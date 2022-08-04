package Odevlerim.IsmetHocadan.Odev_17Haziran;

public class GeoMain {

    public static void main(String[] args) {

        Daire daire1 = new Daire();
        System.out.println("Daire (1)nin Alanı = " + daire1.alan(8));
        System.out.println("Daire (1)nin Çevresi = " + daire1.cevre(8));

        Dikdortgen dikD1 = new Dikdortgen();
        System.out.println("dikD1.alan(3,4) = " + dikD1.alan(3,4));
        System.out.println("dikD1.cevre(3,4) = " + dikD1.cevre(3,4));

        Kare kare1 = new Kare();
        System.out.println("kare1.alan(5) = " + kare1.alan(5));
        System.out.println("kare1.cevre(5) = " + kare1.cevre(5));


    }
}
