package examen.ejercicio2;

import java.util.Date;

public class Asalariado extends Empleado {
    private String departamento;

    public Asalariado(String nombre,  String apellido,  Date fechaContratacion,  int salario,  String numeroCuenta,  String departamento) {
    	
        if (salario < 0) {
        	
            throw new SalarioException("Salario negativo: " +  salario);
        }

        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
        this.numeroCuenta = numeroCuenta;
        this.departamento = departamento;
    }

    @Override
    public void cobrar() {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("El ingreso al Asalariado por valor de ");
        mensaje.append(salario);
        mensaje.append(" en el numero de cuenta ");
        mensaje.append(numeroCuenta);
        mensaje.append(" se ha realizado correctamente en la fecha ");
        mensaje.append(new Date());

        System.out.println(mensaje);
    }

    @Override
    public String toString() {
        return "Asalariado{" +
                "departamento='" + departamento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaContratacion=" + fechaContratacion +
                ", salario=" + salario +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                '}';
    }
}
