package examen.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;

import examen.ejercicio2.Asalariado;
import examen.ejercicio2.Cobrar;
import examen.ejercicio2.Contratista;
import examen.ejercicio2.Empleado;
import examen.ejercicio2.EmpresaServicio;
import examen.ejercicio2.SociedadAnonima;

public class App {
	
    
    public static void main(String[] args) {
    	
        Asalariado asalariado = new Asalariado("Andrea",
                "Gutierrez Vega",
                new Date(),
                3000,
                "ES6000491500051234567892",
                "WEB");
        EmpresaServicio empresaServicio = new EmpresaServicio("ES", "tipoServicio", 600, "ES6621000418401234567891");

        ArrayList<EmpresaServicio> empresasServicios = new ArrayList<>();
        empresasServicios.add(empresaServicio);

        SociedadAnonima sociedadAnonima = new SociedadAnonima("SA", empresasServicios);

        ArrayList<SociedadAnonima> sociedadesAnonimas = new ArrayList<>();
        sociedadesAnonimas.add(sociedadAnonima);

        Contratista contratista = new Contratista("Pablo",
                "Santamarta Esteban",
                new Date(),
                1500,
                "ES7100302053091234567895",
                sociedadesAnonimas);

        ArrayList<Cobrar> cobradores = new ArrayList<>();
        cobradores.add(asalariado);
        cobradores.add(contratista);
        cobradores.add(empresaServicio);

        for (Cobrar c : cobradores) {
            System.out.println(c);
        }

        LinkedList<Empleado> empleados = new LinkedList<>();
        empleados.add(contratista);
        empleados.add(asalariado);
        empleados.add(new Asalariado("Lionel", "Messi", new Date(), 4300, "ES7100302053091234567895", "SISTEMAS"));
        empleados.add(new Asalariado("Enjuto", "Mojamuto", new Date(), 1000, "ES7100302053091234567895", "RRHH"));

        Collections.sort(empleados);
        System.out.println(empleados);

        Collections.sort(empleados, new Empleado.ComparadorPorSalarioApellidosNombre());
        System.out.println(empleados);
    }
}
