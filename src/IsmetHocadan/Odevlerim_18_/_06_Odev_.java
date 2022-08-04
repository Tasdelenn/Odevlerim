package Odevlerim.IsmetHocadan.Odevlerim_18_;

import java.util.Scanner;

public class _06_Odev_ {
    //6-Kullanıcnın gireceği bir sayının basamaklarına göre tersi olan sayıyı bulunuzç

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz =");
        int sayi = oku.nextInt();

        int tersSayi = 0;

        while (sayi > 0) {
            tersSayi = tersSayi * 10 + sayi % 10;  // ters sayı sağdan değer almaya başladı -> 6 >>6*10+5 >>65*10+4 >>654*10+3 gbi.
            sayi = sayi / 10;  // sayı ona bölünürken basamaklar birler basamağına taşınıyor -> 3456 >>345 >>34 >>3 gibi.
        }
        System.out.println("Sayının Basamak Tersi = " + tersSayi);
    }
}