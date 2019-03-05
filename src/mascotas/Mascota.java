package mascotas;

public class Mascota {

    private String nombre;
    private int edad;
    private int peso;

    public Mascota(String nombre, int edad, int peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + ", " + edad + " años, " + peso + " kg.";
    }
}
