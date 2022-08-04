package Odevlerim.IsmetHocadan.Odevlerim_18;

public class _02_Odev {
    //2. int Array oluşturun ve elemanları : 12,2,5,15,8  En büyük değeri yazdırınız.

    public static void main(String[] args) {
     int[] diziSayi={12, 2, 5, 15, 8};

     int enb=diziSayi[0];
        for (int i = 0; i < diziSayi.length; i++) {
            if (enb<diziSayi[i])
                enb=diziSayi[i];
        }
        System.out.println("Dizideki en büyük sayı = " + enb);
    }
}
