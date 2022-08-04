package Odevlerim.IsmetHocadan.Odevlerim_18_;

import java.util.Scanner;

public class _04_Odev_ {

    //4- Kullanıcın gireceği bir sayının kaç basamak olduğunu bulunuz

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen Sayıyı Giriniz = ");
        int sayi = oku.nextInt();

        int sayac = 0;

        while (sayi > 0) {
            sayi = sayi / 10;
            sayac++;
        }
        System.out.println("Girilen Sayı " + sayac + " Basamaklıdır.");
    }
}
