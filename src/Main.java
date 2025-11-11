//Proyecto EanX Java Modulo 3
public class Main {
    public static void main(String[] args) {

        TiendaElectronica tienda = new TiendaElectronica("ElectroMart");

        // ====== Agregar 10 TELEVISores (los del avance 2) ======
        tienda.agregar(new Televisor(1001, 55, "SAMSUNG", 2024, "4K"));
        tienda.agregar(new Televisor(1002, 43, "LG", 2023, "1080p"));
        tienda.agregar(new Televisor(1003, 65, "SONY", 2024, "8K"));
        tienda.agregar(new Televisor(1004, 32, "HISENSE", 2022, "720p"));
        tienda.agregar(new Televisor(1005, 50, "PANASONIC", 2024, "4K"));
        tienda.agregar(new Televisor(1006, 50, "PANASONIC", 2023, "1080p"));
        tienda.agregar(new Televisor(1007, 50, "PANASONIC", 2023, "1080p"));
        tienda.agregar(new Televisor(1008, 50, "PANASONIC", 2023, "1080p"));
        tienda.agregar(new Televisor(1009, 50, "PANASONIC", 2023, "1080p"));
        tienda.agregar(new Televisor(1010, 50, "PANASONIC", 2023, "1080p"));

        // ====== Agregar 5 CELULARES (nuevo en avance 3) ======
        tienda.agregar(new Celular(2001, 6,  "SAMSUNG", 2024, 14, "alta"));
        tienda.agregar(new Celular(2002, 67, "XIAOMI",  2024, 14, "media")); // 6.7"
        tienda.agregar(new Celular(2003, 62, "MOTOROLA",2023, 13, "media")); // 6.2"
        tienda.agregar(new Celular(2004, 61, "OPPO",    2023, 13, "media"));
        tienda.agregar(new Celular(2005, 58, "NOKIA",   2022, 12, "baja"));

        // ====== Mostrar inventario completo (upcasting activo) ======
        System.out.println(tienda);

        // ====== Buscar por serie (ej: 1003) ======
        System.out.println("Buscando equipo con serie 1003:");
        SmartElectrodomestico encontrado = tienda.encontrarPorSerie(1003);
        System.out.println(encontrado != null ? encontrado : "No encontrado");
        System.out.println();

        // ====== Demostración de polimorfismo ======
        System.out.println("=== Demostración de polimorfismo ===");
        for (SmartElectrodomestico equipo : tienda.getInventario()) {
            equipo.encender();
            equipo.conectarInternet();
            equipo.subirVolumen();     // Celular sobreescribe (polimorfismo)
            equipo.bajarVolumen();     // Celular sobreescribe (polimorfismo)
            equipo.desconectarInternet();
            equipo.apagar();
            System.out.println();
        }

        // ====== Eliminar por serie (ej: 1004) y mostrar inventario ======
        System.out.println("Eliminando serie 1004...");
        tienda.eliminarPorSerie(1004);
        System.out.println("\nInventario después de eliminar 1004:\n");
        System.out.println(tienda);
    }
}
