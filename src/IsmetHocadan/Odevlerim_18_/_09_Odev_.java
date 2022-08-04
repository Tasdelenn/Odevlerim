package Odevlerim.IsmetHocadan.Odevlerim_18_;

import java.util.Scanner;

public class _09_Odev_ {

    //9-Girilen bir cümledeki kelimelerin baş harflarini yazdırınız.(Regex kullanmayın)
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen Cümlenizi Giriniz: ");
        String cumle = oku.nextLine();
        cumle = cumle.trim();

        System.out.print("BAŞ HARFLER: " + cumle.charAt(0)); // İlk baş harf.

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == ' ')
                System.out.print(" " + cumle.charAt((i + 1)));
        }
    }
}
