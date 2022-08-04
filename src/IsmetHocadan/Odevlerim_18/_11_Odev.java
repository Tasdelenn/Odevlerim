package Odevlerim.IsmetHocadan.Odevlerim_18_;

public class _11_Odev {
    //11.   İnt Array oluştur ve elemanları   : 25,30,30,35,100
    //      Array in elemanlarının toplamını yazdır. Cevap 220 olmalı.

    public static void main(String[] args) {
        int[] sayiDizisi={25, 30, 30, 35, 100};

        int toplam=0;
        for (int i = 0; i < sayiDizisi.length; i++)
            toplam=toplam+ sayiDizisi[i];

        System.out.println("Toplam = " + toplam);
    }
}
