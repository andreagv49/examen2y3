package examen.ejercicio2;

import java.util.Date;

public class EmpresaServicio implements Cobrar {
    private String nombre;
    private String tipoServicio;
    private int importeMensual;
    private String numeroCuenta;

    public EmpresaServicio(String nombre, String tipoServicio, int importeMensual, String numeroCuenta) {
       
    	if (importeMensual < 0) {
           
    		throw new ImporteMensualException("Importe mensual negativo: " + importeMensual);
        }

        this.nombre = nombre;
        this.tipoServicio = tipoServicio;
        this.importeMensual = importeMensual;
        this.numeroCuenta = numeroCuenta;
    }

    public int getImporteMensual() {
        return importeMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setImporteMensual(int importeMensual) {
        if (importeMensual < 0) {
            throw new ImporteMensualException("Importe mensual negativo: " + importeMensual);
        }

        this.importeMensual = importeMensual;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public void cobrar() {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("El ingreso a la Empresa de Servicio por valor de ");
        mensaje.append(importeMensual);
        mensaje.append(" en el numero de cuenta ");
        mensaje.append(numeroCuenta);
        mensaje.append(" se ha realizado correctamente en la fecha ");
        mensaje.append(new Date());

        System.out.println(mensaje);
    }

    @Override
    public String toString() {
        return "EmpresaServicio{" +
                "nombre='" + nombre + '\'' +
                ", tipoServicio='" + tipoServicio + '\'' +
                ", importeMensual=" + importeMensual +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                '}';
    }
}
