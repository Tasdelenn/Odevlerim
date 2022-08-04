package Odevlerim.IsmetHocadan.Odev_21Haziran.OOP2_tekSoru;
import java.util.ArrayList;
public class OkulMain {

    public static void main(String[] args) {

        Okul okul1 = new Okul("Serhat Anadolu Lisesi",100);
        Okul okul2 = new Okul("Adıgüzel Meslek Lisesi",50);

        Ogrenci ogr1 = new Ogrenci("Hakan Taşdelen", "Altay Mh. Karaca Sk. n:3 Manisa", Tip.OGRENCI, okul1, 12000);
        Ogrenci ogr2 = new Ogrenci("Ayşe Yılmaz","Aba Mh. Mavi Sk. n:10 Salihli",Tip.OGRENCI,okul1, 15000);
        Ogrenci ogr3 = new Ogrenci("Yılmaz Durmuş", "Ince Mh. Darı Sk. No:56 Turgutlu", Tip.OGRENCI, okul1, 16000 );

        Calisan cal1 = new Calisan("Mahmut Akca","Ala Mh. Dar Sk. n:5 Kula",Tip.CALISAN,okul1, 8000);
        Calisan cal2 = new Calisan("Fatma Yavuz","Yeşil Mh. Elma Sk. n:44 Akhisar",Tip.OGRENCI,okul1, 10000);

        ArrayList<Ogrenci> tumOgrenciler = new ArrayList<>();
        tumOgrenciler.add(ogr1);        tumOgrenciler.add(ogr2);        tumOgrenciler.add(ogr3);

        ArrayList<Calisan> tumCalisanlar = new ArrayList<>();
        tumCalisanlar.add(cal1);        tumCalisanlar.add(cal2);

        System.out.println(tumOgrenciler);
        System.out.println(tumCalisanlar);
    }
}
