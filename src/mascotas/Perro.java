package mascotas;

// Un Perro es una Mascota
public class Perro extends Mascota {

    private String raza;

    public Perro(String nombre, int edad, int peso, String raza) {
        super(nombre, edad, peso); // Se crea primero una mascota
        this.raza = raza; // Solo los perros tienen raza (según mi modelo)
    }

    // Doy la posibilidad de crear instancias de Perro sin requerir la raza.
    // Por defecto, será "Callejero"
    public Perro(String nombre, int edad, int peso) {
        super(nombre, edad, peso); // Se crea primero una mascota
        this.raza = "Callejero"; // Solo los perros tienen raza
    }

    @Override
    public String toString() {
        // Obtengo la representación en String de la superclase Mascota y agrego los atributos de Perro
        return super.toString() + " De raza " + this.raza;
    }

    @Override
    public void expresarse() {
        // El método abstracto expresarse en la superclase obliga a sobreescribir
        System.out.println(super.getNombre() + ": GUAU GUAU");
    }
}
