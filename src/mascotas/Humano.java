package mascotas;

public class Humano implements CapazDeComer {

    private String nombre;
    private int peso;
    private String comidaFavorita;

    public Humano(String nombre, int peso, String comidaFavorita) {
        this.nombre = nombre;
        this.peso = peso;
        this.comidaFavorita = comidaFavorita;
    }

    @Override
    public String toString() {
        return this.nombre + ", " + peso + " kg. Su comida favorita es: " + this.comidaFavorita;
    }

    @Override
    public void comer() {
        System.out.println(this.nombre + ": ÑAM ÑAM, estoy comiendo " + this.comidaFavorita);
    }
}
