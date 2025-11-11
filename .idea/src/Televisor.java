public class Televisor {

    // ✅ Atributos (encapsulados)
    private int tamaño;
    private String resolucion;
    private String marca;
    private boolean esSmartTV;

    // ✅ Métodos principales
    public void encenderTV() {
        System.out.println("El televisor está encendido.");
    }

    public void apagarTV() {
        System.out.println("El televisor está apagado.");
    }

    public void subirVolumen() {
        System.out.println("Subiendo volumen...");
    }

    public void bajarVolumen() {
        System.out.println("Bajando volumen...");
    }

    // ✅ Constructor principal
    public Televisor(int tamaño, String resolucion, String marca, boolean esSmartTV) {
        this.tamaño = tamaño;
        this.resolucion = resolucion;
        this.marca = marca;
        this.esSmartTV = esSmartTV;
    }

    // ✅ Constructor sobrecargado con 2 parámetros
    public Televisor(int tamaño, boolean esSmartTV) {
        this.tamaño = tamaño;
        this.esSmartTV = esSmartTV;
        this.resolucion = "Sin especificar";
        this.marca = "Genérica";
    }

    // ✅ Método toString()
    @Override
    public String toString() {
        return "Televisor {" +
                "tamaño = " + tamaño + " pulgadas, " +
                "resolución = '" + resolucion + '\'' +
                ", marca = '" + marca + '\'' +
                ", es SmartTV = " + esSmartTV +
                '}';
    }

    // ✅ Getters & Setters (opcional pero recomendado)
    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isSmartTV() {
        return esSmartTV;
    }

    public void setSmartTV(boolean smartTV) {
        esSmartTV = smartTV;
    }
}
