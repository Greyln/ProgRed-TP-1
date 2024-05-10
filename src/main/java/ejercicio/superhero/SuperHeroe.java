package ejercicio.superhero;

@SuppressWarnings("unused")
public class SuperHeroe {
    private String nombre;
    private String descripcion;
    private Boolean capa;

    public SuperHeroe(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
        this.capa = false;
    }

    public SuperHeroe(String nombre, String descripcion, Boolean capa) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.capa = capa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getCapa() {
        return capa;
    }

    public void setCapa(Boolean capa) {
        this.capa = capa;
    }

    @Override
    public String toString() {
        return "{" + '\n' +
                "   Nombre: " + nombre + '\n' +
                "   Descripcion: " + descripcion + '\n' +
                "   Capa: " + capa + '\n' +
                '}';
    }

    public String toString2() {
        return "{" + '\n' +
                "       Nombre: " + nombre + '\n' +
                "       Descripcion: " + descripcion + '\n' +
                "       Capa: " + capa + '\n' +
                "   }";
    }
}
