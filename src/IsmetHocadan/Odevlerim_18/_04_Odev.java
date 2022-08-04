package Odevlerim.IsmetHocadan.Odevlerim_18_;

public class _04_Odev {
    //4. int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
    // Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

    public static void main(String[] args) {

        int[] diziSayilari={15,25,22,18,30};

        int enb=diziSayilari[0];
        for (int i = 0; i < diziSayilari.length; i++)
            if (enb<diziSayilari[i])
                enb=diziSayilari[i];
        System.out.println("enb = " + enb);

        int ikinciEnb=diziSayilari[0];
        for (int i = 0; i < diziSayilari.length; i++)
        {
            if (ikinciEnb<diziSayilari[i] && diziSayilari[i]<enb)
                ikinciEnb=diziSayilari[i];
        }
        System.out.println("ikinciEnb = " + ikinciEnb);
    }
}
