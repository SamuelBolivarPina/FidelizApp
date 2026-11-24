public class ReglaConCampana implements ReglaPuntos {
    private final ReglaPuntos base;
    private final double multiplicador;
    public ReglaConCampana(ReglaPuntos base, double multiplicador) {
        this.base = base;
        this.multiplicador = multiplicador;
    }
    @Override
    public int calcular(double montoCompra) {
        return (int) Math.round(base.calcular(montoCompra) * multiplicador);
    }
}
