package mascotas;

public class Gato extends Mascota {

    private String color;

    public Gato(String nombre, int edad, int peso, String color) {
        super(nombre, edad, peso); // Se crea primero una mascota
        this.color = color; // Solo los gatos tienen color (según mi modelo)
    }

    @Override
    public String toString() {
        // Obtengo la representación en String de la superclase Mascota y agrego los atributos de Gato
        return super.toString() + " De color " + this.color;
    }

    public void maullar() {
        // Obtengo su nombre (lo tiene la superclase Mascota) y lo hago maullar
        System.out.println(super.getNombre() + ": MIAU MIAU");
    }
}
