import java.util.ArrayList;
import java.util.List;

public class TiendaElectronica {

    private String nombre;
    private List<SmartElectrodomestico> inventario;

    public TiendaElectronica(String nombre) {
        this.nombre = nombre;
        this.inventario = new ArrayList<>();
    }

    public void agregar(SmartElectrodomestico equipo) {
        inventario.add(equipo);
    }

    public SmartElectrodomestico encontrarPorSerie(int numeroSerie) {
        for (SmartElectrodomestico e : inventario) {
            if (e.getNumeroSerie() == numeroSerie) return e;
        }
        return null;
    }

    public boolean eliminarPorSerie(int numeroSerie) {
        return inventario.removeIf(e -> e.getNumeroSerie() == numeroSerie);
    }

    public List<SmartElectrodomestico> getInventario() {
        return inventario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("*** Inventario de " + nombre + " ***\n");
        for (SmartElectrodomestico e : inventario) {
            sb.append(e).append("\n");
        }
        return sb.toString();
    }
}
