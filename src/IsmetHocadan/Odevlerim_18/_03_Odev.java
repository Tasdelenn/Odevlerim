package Odevlerim.IsmetHocadan.Odevlerim_18;

public class _03_Odev {
    //3. int Array oluşturun ve elemanları : 14 , 19 , 5 , 21  En küçük (minimum) sayıyı yazdırınız.

    public static void main(String[] args) {

        int[] diziSayisi={14, 19, 5, 21};
        int enk=diziSayisi[0];
        for (int i = 0; i < diziSayisi.length; i++) {
            if (enk>diziSayisi[i])
                enk=diziSayisi[i];
        }
        System.out.println("Dizinin en küçük değeri = " + enk);
    }
}
