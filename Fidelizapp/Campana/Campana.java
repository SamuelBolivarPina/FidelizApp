import java.time.LocalDate;
public class Campana {
    private final String nombre;
    private final double multiplicador;
    private final LocalDate inicio;
    private final LocalDate fin;
    public Campana(String nombre, double multiplicador, LocalDate inicio, LocalDate fin) {
        this.nombre = nombre;
        this.multiplicador = multiplicador;
        this.inicio = inicio;
        this.fin = fin;
    }
    public String getNombre() { return nombre; }
    public double getMultiplicador() { return multiplicador; }
    public boolean estaVigente() {
        LocalDate hoy = LocalDate.now();
        return !hoy.isBefore(inicio) && !hoy.isAfter(fin);
    }
}
