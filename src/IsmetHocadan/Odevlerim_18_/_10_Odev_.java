package Odevlerim.IsmetHocadan.Odevlerim_18_;

import java.util.Scanner;

public class _10_Odev_ {

    //10-Kullanıcından 10 sayı isteyiniz, eğer sonra girilen önce girilenden büyük ise döngü sonlansın.
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz =");
        int onceki = oku.nextInt();   // İlk sayıyı burada aldığımız için i=0 dan değil de i=1 den başladı.

        for (int i = 1; i < 10; i++) {
            System.out.print((i + 1) + "." + " bir sayı daha giriniz = ");
            int sayi = oku.nextInt();

            if (sayi > onceki) break;

            onceki = sayi;
        }
        System.out.println("Döngü Sonlandı.");
    }
}
