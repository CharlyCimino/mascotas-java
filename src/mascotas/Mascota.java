package mascotas;

// Si una clase tiene al menos un METODO ABSTRACTO, debe ser ABSTRACTA
// Por ser abstracta no se puede instanciar, pero sirve para generalizar y usar polimorfismo
public abstract class Mascota {

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
    
    // ¿Cómo se expresa una mascota? Depende qué tipo de mascota.
    // No podemos decir COMO se expresa pero si obligar a que TODAS SEAN CAPACES DE EXPRESARSE
    public abstract void expresarse ();
}
