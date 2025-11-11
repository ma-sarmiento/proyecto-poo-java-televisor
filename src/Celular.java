public class Celular extends SmartElectrodomestico {

    private int versionAndroid; // p.ej. 14
    private String gama;        // "baja", "media", "alta"

    public Celular(int numeroSerie, int tamano, String marca, int modelo, int versionAndroid, String gama) {
        super(numeroSerie, tamano, marca, modelo);
        this.versionAndroid = versionAndroid;
        this.gama = gama;
    }

    @Override
    public void encender() {
        System.out.println(infoCorto() + " encendiendo CELULAR (Android " + versionAndroid + ", gama " + gama + ")...");
    }

    @Override
    public void apagar() {
        System.out.println(infoCorto() + " apagando CELULAR...");
    }

    // ===== Polimorfismo requerido =====
    @Override
    public void subirVolumen() {
        System.out.println(infoCorto() + " subiendo volumen con teclas laterales (CELULAR)...");
    }

    @Override
    public void bajarVolumen() {
        System.out.println(infoCorto() + " bajando volumen con teclas laterales (CELULAR)...");
    }

    @Override
    public String toString() {
        return "Celular { " + infoBase() + ", Android = " + versionAndroid + ", gama = '" + gama + "' }";
    }
}
