public class ServicioFidelizacion {
    public int registrarCompra(Cliente cliente, Comercio comercio, double monto) {
        ReglaPuntos regla = new ReglaConCampana(new ReglaBase(), comercio.multiplicadorVigente());
        int puntos = regla.calcular(monto);
        cliente.acumular(puntos);
        return puntos;
    }
    public void canjear(Cliente cliente, Recompensa recompensa) {
        cliente.descontar(recompensa.getCostoPuntos());
    }
}
