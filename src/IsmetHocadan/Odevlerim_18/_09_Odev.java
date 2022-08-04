package Odevlerim.IsmetHocadan.Odevlerim_18_;

public class _09_Odev {
    //9. String Array (Dizi) oluşturunuz.Elemanları : Apple, Orange , Babana, Kiwi
    //   Array'leri tüm elemanları yazdırınız.
    public static void main(String[] args) {

        String[] MeyveDizisi={"Apple", "Orange", "Banana", "Kiwi"};

        for (int i = 0; i < MeyveDizisi.length; i++)
            System.out.println((i+1) + ". Meyve : "  + MeyveDizisi[i]);
        }
    }

