import java.util.ArrayList;
import java.util.List;

public class Comercio extends Usuario {
    private final List<Campana> campanas = new ArrayList<>();
    public Comercio(String id, String nombre, String correo) {
        super(id, nombre, correo);
    }
    public void agregarCampana(Campana c) { campanas.add(c); }
    public double multiplicadorVigente() {
        return campanas.stream()
                .filter(Campana::estaVigente)
                .mapToDouble(Campana::getMultiplicador)
                .max().orElse(1.0);
    }
    @Override
    public String getRol() { return "COMERCIO"; }
}
