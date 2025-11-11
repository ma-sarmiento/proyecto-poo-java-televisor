public class Televisor extends SmartElectrodomestico {

    private String resolucion; // p.ej. "4K", "1080p", "8K", "720p"

    public Televisor(int numeroSerie, int tamano, String marca, int modelo, String resolucion) {
        super(numeroSerie, tamano, marca, modelo);
        this.resolucion = resolucion;
    }

    public void cambiarCanal(int canal) {
        System.out.println(infoCorto() + " cambiando al canal " + canal + "...");
    }

    @Override
    public void encender() {
        System.out.println(infoCorto() + " encendiendo TV (" + resolucion + ")...");
    }

    @Override
    public void apagar() {
        System.out.println(infoCorto() + " apagando TV...");
    }

    @Override
    public String toString() {
        return "Televisor { " + infoBase() + ", resolución = '" + resolucion + "' }";
    }
}
