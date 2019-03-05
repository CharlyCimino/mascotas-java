package mascotas;

/**
 *
 * @author caemci
 */
public class Principal {

    public static void main(String[] args) {
        // Creamos un par de mascotas de prueba
        Perro a = new Perro("Scooby Doo", 2, 25, "Gran Danés");
        Perro b = new Perro("Pluto", 4, 20);
        Gato c = new Gato("Félix", 3, 17, "Blanquinegro");
        Gato d = new Gato("Garfield", 6, 32, "Naranja");
        Perro e = new Perro("Ayudante de Santa", 2, 14, "Galgo");
        Gato f = new Gato("Bola de nieve II", 4, 20, "Negro");
        Loro g = new Loro("Alex", 2, 1, 80);

        // Las guardo en un arreglo en cualquier orden
        Mascota[] portalDeLasMascotas = {b, a, f, g, c, e, d};

        // Aquí se ve al polimorfismo en acción
        for (int i = 0; i < portalDeLasMascotas.length; i++) {
            portalDeLasMascotas[i].expresarse(); // Todas responden al mensaje, de diferentes formas
        }
    }
}
