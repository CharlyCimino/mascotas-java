package mascotas;

/**
 *
 * @author caemci
 */
public class Principal {

    public static void main(String[] args) {
        // Creamos un par de mascotas de prueba
        Perro a = new Perro("Scooby Doo",2, 25, "Gran Danés");
        Perro b = new Perro("Pluto", 4, 20);
        Gato c = new Gato("Félix",3, 17, "Blanquinegro");
        Gato d = new Gato("Garfield", 6, 32, "Naranja");
        Perro e = new Perro("Ayudante de Santa", 2, 14, "Galgo");
        Gato f = new Gato("Bola de nieve II", 4, 20, "Negro");
        Loro g = new Loro("Alex", 2, 1, 80);
        
        System.out.println(a); // Equivalente a esto: System.out.println( a.toString() );
        System.out.println(b); // Equivalente a esto: System.out.println( b.toString() );
        System.out.println(c); // Equivalente a esto: System.out.println( c.toString() );
        System.out.println(d); // Equivalente a esto: System.out.println( d.toString() );
        System.out.println(e); // Equivalente a esto: System.out.println( e.toString() );
        System.out.println(f); // Equivalente a esto: System.out.println( f.toString() );
        System.out.println(g); // Equivalente a esto: System.out.println( g.toString() );
    }
}
