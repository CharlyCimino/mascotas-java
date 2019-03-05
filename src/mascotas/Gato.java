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

    @Override
    public void expresarse() {
        // El método abstracto expresarse en la superclase obliga a sobreescribir
        System.out.println(super.getNombre() + ": MIAU MIAU");
    }
}
