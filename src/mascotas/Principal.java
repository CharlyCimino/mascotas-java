package mascotas;

/**
 *
 * @author caemci
 */
public class Principal {

    public static void main(String[] args) {
        // Creo algunos objetos con distintas combinaciones

        // VALIDO
        Perro p = new Perro("Boby", 2, 3, "Pekinés");
        System.out.println(p);
        p.ladrar(); // Los perros pueden ladrar

        System.out.println("");

        // VALIDO
        Mascota m = new Mascota ("Pepe", 4, 2); // Mascota genérica
        System.out.println(m);
        // Las mascotas genéricas no ladran, ni maullan, ni parlotean

        System.out.println("");

        // VALIDO
        Mascota g = new Gato ("Michi", 1, 3, "Negro"); // Un Gato es una Mascota.
        // A pesar de guardar una referencia a un Gato, se comportará como una mascota genérica.
        System.out.println(g);
        // g.maullar(); No se puede

        System.out.println("");

        // NO VALIDO
        // Loro l = new Mascota("Luis",5,2); // No se puede. Una Mascota no es un Loro.
    }
}
