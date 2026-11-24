public class ReglaBase implements ReglaPuntos {
    @Override
    public int calcular(double montoCompra) {
        return (int) (montoCompra / 1000);   // 1 punto por cada $1.000 COP
    }
}
