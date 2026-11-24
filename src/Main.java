import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Cliente ana = new Cliente("C1", "Ana", "ana@mail.com");
        Comercio cafe = new Comercio("M1", "Cafe Central", "cafe@mail.com");
        cafe.agregarCampana(new Campana("Doble puntos", 2.0,
                LocalDate.now().minusDays(1), LocalDate.now().plusDays(5)));
        ServicioFidelizacion servicio = new ServicioFidelizacion();
        int ganados = servicio.registrarCompra(ana, cafe, 50000);
        System.out.println("Puntos ganados: " + ganados);
        servicio.canjear(ana, new Recompensa("Cafe gratis", 40));
        System.out.println("Saldo de " + ana.getNombre() + ": " + ana.getPuntos());
    }
}