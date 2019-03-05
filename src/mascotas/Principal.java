package mascotas;

/**
 *
 * @author caemci
 */
public class Principal {

    public static void main(String[] args) {
        // Creamos un par de mascotas y humanos de prueba
        Perro a = new Perro("Scooby Doo", 2, 25, "Gran Danés");
        Perro b = new Perro("Pluto", 4, 20);
        Gato c = new Gato("Félix", 3, 17, "Blanquinegro");
        Gato d = new Gato("Garfield", 6, 32, "Naranja");
        Perro e = new Perro("Ayudante de Santa", 2, 14, "Galgo");
        Gato f = new Gato("Bola de nieve II", 4, 20, "Negro");
        Loro g = new Loro("Alex", 2, 1, 80);
        Humano h = new Humano("Homero", 96, "Rosquillas");
        Humano y = new Humano("Chavo", 59, "Torta de jamón");
        Humano j = new Humano("Carlos", 84, "Tortilla de papas");

        // Las guardo en un arreglo en cualquier orden
        CapazDeComer[] portalDeHambrientos = {b, a, j, f, h, g, c, y, e, d};

        // Aquí se ve al polimorfismo por interfaces en acción
        for (int i = 0; i < portalDeHambrientos.length; i++) {
            portalDeHambrientos[i].comer(); // Todos responden al mismo mensaje, de diferentes formas
        }
    }
}
