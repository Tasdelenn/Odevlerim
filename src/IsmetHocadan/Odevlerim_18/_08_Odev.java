package Odevlerim.IsmetHocadan.Odevlerim_18_;

public class _08_Odev {
    // 8. int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4  Array'in ortalamasını alınız.

    public static void main(String[] args) {
        int[] dizi={12, 14, 21, 23, 10, 4 };

        int toplam=0;
        for (int i = 0; i < dizi.length; i++)
            toplam=toplam+dizi[i];

        System.out.println("Dizi Ortalaması = " + toplam/ dizi.length + " 'dır");
    }
}
