package examen.ejercicio2;

import java.util.List;

public class SociedadAnonima {
	
    private String nombre;
    private List<EmpresaServicio> empresasServicios;

    public SociedadAnonima(String nombre, List<EmpresaServicio> empresasServicios) {
        this.nombre = nombre;
        this.empresasServicios = empresasServicios;
    }

    public String getNombre() {
        return nombre;
    }

    public List<EmpresaServicio> getEmpresasServicios() {
        return empresasServicios;
    }

    @Override
    public String toString() {
        return "SociedadAnonima{" +
                "nombre='" + nombre + '\'' +
                ", empresasServicios=" + empresasServicios +
                '}';
    }
}
