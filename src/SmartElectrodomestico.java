public abstract class SmartElectrodomestico {

    // Requeridos como protected
    protected int numeroSerie;
    protected int tamano;       // pulgadas (TV) o pulgadas de pantalla (celular)
    protected String marca;
    protected int modelo;       // año o serie del modelo

    public SmartElectrodomestico(int numeroSerie, int tamano, String marca, int modelo) {
        this.numeroSerie = numeroSerie;
        this.tamano = tamano;
        this.marca = marca;
        this.modelo = modelo;
    }

    // ===== Métodos abstractos (OBLIGATORIO) =====
    public abstract void encender();
    public abstract void apagar();

    // ===== Métodos NO abstractos (se heredan y se pueden sobreescribir) =====
    public void conectarInternet() {
        System.out.println(infoCorto() + " conectándose a Internet...");
    }

    public void desconectarInternet() {
        System.out.println(infoCorto() + " desconectándose de Internet...");
    }

    public void subirVolumen() {
        System.out.println(infoCorto() + " subiendo volumen (genérico)...");
    }

    public void bajarVolumen() {
        System.out.println(infoCorto() + " bajando volumen (genérico)...");
    }

    // ===== Getters (por si los necesitas) =====
    public int getNumeroSerie() { return numeroSerie; }
    public int getTamano() { return tamano; }
    public String getMarca() { return marca; }
    public int getModelo() { return modelo; }

    // ===== Utilidades de texto =====
    protected String infoCorto() {
        return "[" + getClass().getSimpleName() + " " + marca + " #" + numeroSerie + "]";
    }

    protected String infoBase() {
        return "tamaño = " + tamano + " pulgadas, marca = '" + marca + "', modelo = " + modelo + ", serie = " + numeroSerie;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " { " + infoBase() + " }";
    }
}
