public class Main {
    public static void main(String[] args) {

        //  5 objetos Televisor con datos diferentes
        Televisor tv1 = new Televisor(55, "4K", "Samsung", true);
        Televisor tv2 = new Televisor(43, "1080p", "LG", false);
        Televisor tv3 = new Televisor(65, "8K", "Sony", true);
        Televisor tv4 = new Televisor(32, "720p", "Hisense", false);
        Televisor tv5 = new Televisor(50, true); // usando constructor sobrecargado

        //  Imprimir la información de cada uno (toString)
        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);
        System.out.println(tv4);
        System.out.println(tv5);

        //  Ejemplo de uso de métodos
        tv1.encenderTV();
        tv1.subirVolumen();
        tv1.bajarVolumen();
        tv1.apagarTV();
    }
}
