import java.util.ArrayList;
import java.util.List;
public class Cliente extends Usuario {
    private int puntos;
    public Cliente(String id, String nombre, String correo) {
        super(id, nombre, correo);
    }
    public int getPuntos() { return puntos; }
    public void acumular(int cantidad) {
        if (cantidad <= 0) throw new IllegalArgumentException("Puntos invalidos");
        puntos += cantidad;
    }
    public void descontar(int cantidad) {
        if (cantidad > puntos) throw new IllegalStateException("Puntos insuficientes");
        puntos -= cantidad;
    }
    @Override
    public String getRol() { return "CLIENTE"; }

}

