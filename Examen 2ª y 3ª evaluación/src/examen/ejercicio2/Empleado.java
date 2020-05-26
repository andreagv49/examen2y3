package examen.ejercicio2;

import java.util.Comparator;
import java.util.Date;

public abstract class Empleado implements Cobrar, Comparable<Empleado> {
	
    protected String nombre;
    protected String apellido;
    protected Date fechaContratacion;
    protected int salario;
    protected String numeroCuenta;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        if (salario < 0) {
            throw new SalarioException("Salario negativo: " +  salario);
        }

        this.salario = salario;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public final int compareTo(Empleado otro) {
        int result = apellido.compareTo(otro.getApellido());

        if (result == 0) {
            result += nombre.compareTo(otro.getNombre());
        }

        return result;
    }

    public static class ComparadorPorSalarioApellidosNombre implements Comparator<Empleado> {
        @Override
        public int compare(Empleado empleado1, Empleado empleado2) {
            int result = Integer.compare(empleado2.getSalario(), empleado1.getSalario());

            if (result == 0) {
                result += empleado1.getApellido().compareTo(empleado2.getApellido());

                if (result == 0) {
                    result += empleado1.getNombre().compareTo(empleado2.getNombre());
                }
            }

            return result;
        }
    }
}
