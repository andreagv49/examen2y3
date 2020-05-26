package examen.ejercicio2;

import java.util.Date;
import java.util.List;

public class Contratista extends Empleado {
    private List<SociedadAnonima> sociedadesAnonimas;

    public Contratista(String nombre,  String apellido,  Date fechaContratacion,  int salario,  String numeroCuenta,  List<SociedadAnonima> sociedadesAnonimas) {
    	
        if (salario < 0) {
        	
            throw new SalarioException("Salario negativo: " +  salario);
        }

        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
        this.numeroCuenta = numeroCuenta;
        this.sociedadesAnonimas = sociedadesAnonimas;
    }

    public List<SociedadAnonima> getSociedadesAnonimas() {
        return sociedadesAnonimas;
    }

    @Override
    public void cobrar() {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("El ingreso al Contratista por valor de ");
        mensaje.append(salario);
        mensaje.append(" en el numero de cuenta ");
        mensaje.append(numeroCuenta);
        mensaje.append(" se ha realizado correctamente en la fecha ");
        mensaje.append(new Date());

        System.out.println(mensaje);
    }

    @Override
    public String toString() {
        return "Contratista{" +
                "sociedadesAnonimas=" + sociedadesAnonimas +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaContratacion=" + fechaContratacion +
                ", salario=" + salario +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                '}';
    }
}
