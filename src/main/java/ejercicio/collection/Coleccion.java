package ejercicio.collection;

import ejercicio.figure.Figura;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Coleccion {
    private String nombre;
    private final List<Figura> figuras;


    public Coleccion(String nombre) {
        this.nombre = nombre;
        this.figuras = new ArrayList<>();
    }

    public Coleccion(String nombre, List<Figura> figuras) {
        this.nombre = nombre;
        this.figuras = figuras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    public void subirPrecio(Double cantidad, String id) {
        for (Figura figura : figuras) {
            if (figura.getCodigo().equals(id)) {
                figura.subirPrecio(cantidad);
            }
        }
    }

    public Figura masValioso() {
        Figura masValioso = null;
        Double max = 0.0;
        for (Figura figura : figuras) {
            if (figura.getPrecio() > max) {
                max = figura.getPrecio();
                masValioso = figura;
            }
        }
        return masValioso;
    }

    public Double getValorColeccion() {
        Double total = 0.0;
        for (Figura figura : figuras) {
            total += figura.getPrecio();
        }
        return total;
    }

    public Double getVolumenColeccion() {
        Double total = 0.0;
        for (Figura figura : figuras) {
            total += figura.getDimensiones().getVolumen();
        }
        return total + 200.0;
    }

    public String conCapa() {
        StringBuilder figurasConCapa = new StringBuilder();

        for (Figura figura : figuras) {
            if (Boolean.TRUE.equals(figura.getSuperHeroe().getCapa())) {
                figurasConCapa.append(figura).append('\n');
            }
        }
        return figurasConCapa.toString();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Nombre: ").append(this.nombre).append('\n');
        sb.append("Figuras: [" + '\n');

        for (Figura figura : figuras) {
            sb.append(figura.toString()).append('\n');
        }
        sb.append("]" + '\n');

        return sb.toString();
    }
}
