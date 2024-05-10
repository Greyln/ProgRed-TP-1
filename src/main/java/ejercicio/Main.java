package ejercicio;

import ejercicio.collection.Coleccion;
import ejercicio.dimension.Dimension;
import ejercicio.figure.Figura;
import ejercicio.superhero.SuperHeroe;

import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    private static void println(String message) {
        LOGGER.info(() -> message);
    }

    private static Figura crearSuperman() {
        SuperHeroe superHeroe = new SuperHeroe("Superman");
        superHeroe.setDescripcion("Kal-El, el último hijo de Krypton, tiene fuerza, velocidad y capacidad de volar sobrehumanas. " +
                "Es un extraterrestre del planeta Krypton y está dedicado a la verdad, la justicia y el estilo americano.");
        superHeroe.setCapa(true);

        Dimension dimensiones = new Dimension(10.91, 4.0, 5.0);

        return new Figura("DC-SUPERMAN-01", 115.0, superHeroe, dimensiones);
    }

    private static Figura crearBatman() {
        SuperHeroe superHeroe = new SuperHeroe("Superman");
        superHeroe.setDescripcion("Bruce Wayne, un filántropo multimillonario, es un héroe hecho a sí mismo sin poderes sobrehumanos. " +
                "Utiliza su inteligencia, atletismo y tecnología para luchar contra el crimen y proteger a Gotham City de los villanos.");
        superHeroe.setCapa(true);

        Dimension dimensiones = new Dimension(10.88, 4.0, 5.0);

        return new Figura("DC-BATMAN-01", 120.0, superHeroe, dimensiones);
    }

    public static void main(String[] args) {

        Figura superman = crearSuperman();
        Figura batman = crearBatman();

        Coleccion coleccionDC = new Coleccion("DC-Comics");

        coleccionDC.agregarFigura(superman);
        coleccionDC.agregarFigura(batman);

        println("\n" + coleccionDC);
    }
}