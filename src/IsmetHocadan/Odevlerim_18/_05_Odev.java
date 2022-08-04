package Odevlerim.IsmetHocadan.Odevlerim_18_;

public class _05_Odev {
    //5. int Array oluşturun ve elemanları : 5,6,8,12,14,19
    //   Eğer sayı çiftse topla, tekse çıkar.
    //   **Örneğin:**
    //   **-5 + 6 + 8 + 12 + 14 - 19 = 16**
    //   Toplamlarını yazdırın.

    public static void main(String[] args) {
        int[] sayiDizisi={5,6,8,12,14,19};

        int toplam=0;
        for (int i = 0; i < sayiDizisi.length; i++) {
            if (sayiDizisi[i]%2==0)
                toplam=toplam+sayiDizisi[i];
                        else toplam=toplam-sayiDizisi[i];
        }
        System.out.println("Kümülatif Toplam = " + toplam);
    }
}
