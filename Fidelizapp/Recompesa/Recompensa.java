public class Recompensa {
    private final String nombre;
    private final int costoPuntos;
    public Recompensa(String nombre, int costoPuntos) {
        this.nombre = nombre;
        this.costoPuntos = costoPuntos;
    }
    public String getNombre() { return nombre; }
    public int getCostoPuntos() { return costoPuntos; }
}
