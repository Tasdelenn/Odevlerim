package Odevlerim.IsmetHocadan.Odev_16Haziran;

public class OkulMain {

    public static void main(String[] args) {

        Ogrenci ogr1 = new Ogrenci("Hakan","Tasdelen","Ogrenci","1F");
        Calisan cal1 = new Calisan("Mehmet","Rauf","Calisan","Testing");

        //System.out.println("ogr1 = " + ogr1.toString());
        //System.out.println("cal1 = " + cal1.toString());

        kimlikYaz(ogr1);
        kimlikYaz(cal1);
    }
    public static void kimlikYaz(Kisi formalKisi)
    {
       System.out.println(formalKisi.toString());
    }
}

