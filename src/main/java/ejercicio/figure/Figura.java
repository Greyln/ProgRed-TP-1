package ejercicio.figure;

import ejercicio.dimension.Dimension;
import ejercicio.superhero.SuperHeroe;

@SuppressWarnings("unused")
public class Figura {
    private String codigo;
    private Double precio;
    private SuperHeroe superHeroe;
    private Dimension dimensiones;

    public Figura(String codigo, Double precio, SuperHeroe superHeroe, Dimension dimensiones) {
        this.codigo = codigo;
        this.precio = precio;
        this.superHeroe = superHeroe;
        this.dimensiones = dimensiones;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public SuperHeroe getSuperHeroe() {
        return superHeroe;
    }

    public void setSuperHeroe(SuperHeroe superHeroe) {
        this.superHeroe = superHeroe;
    }

    public Dimension getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimension dimensiones) {
        this.dimensiones = dimensiones;
    }

    public void subirPrecio(Double cantidad) {
        this.precio += cantidad;
    }
    
    @Override
    public String toString() {
        return "Figura {" + '\n' +
                "   Codigo: " + codigo + '\n' +
                "   Precio: " + precio + '\n' +
                "   SuperHeroe: " + superHeroe.toString2() + '\n' +
                "   Dimensiones: " + dimensiones.toString2() + '\n' +
                '}';
    }
}
