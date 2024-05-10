package ejercicio.dimension;

@SuppressWarnings("unused")
public class Dimension {
    private Double alto;
    private Double ancho;
    private Double profundidad;

    public Dimension() {
        this.alto = 0.0;
        this.ancho = 0.0;
        this.profundidad = 0.0;
    }

    public Dimension(Double alto, Double ancho, Double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(Double profundidad) {
        this.profundidad = profundidad;
    }

    public Double getVolumen() {
        return alto * ancho * profundidad;
    }

    @Override
    public String toString() {
        return "{" + '\n' +
                "   Alto: " + alto + '\n' +
                "   Ancho: " + ancho + '\n' +
                "   Profundidad: " + profundidad + '\n' +
                "   Volumen: " + this.getVolumen() + '\n' +
                '}';
    }

    public String toString2() {
        return "{" + '\n' +
                "       Alto: " + alto + '\n' +
                "       Ancho: " + ancho + '\n' +
                "       Profundidad: " + profundidad + '\n' +
                "       Volumen: " + this.getVolumen() + '\n' +
                "   }";
    }
}
