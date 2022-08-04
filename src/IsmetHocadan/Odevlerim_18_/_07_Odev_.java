package Odevlerim.IsmetHocadan.Odevlerim_18_;

import java.util.Scanner;

public class _07_Odev_ {
//7-Girilen bir cumledeki a harfi sayısını bulunuz.(Regex kullanmayın)

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen Bir String Giriniz : ");
        String cumle = oku.nextLine();

        int sayac = 0;
        for (int i = 0; i < cumle.length(); i++)
            if (cumle.charAt(i) == 'a')
                sayac++;

        System.out.println("Cümlede geçen 'a' harfi sayısı = " + sayac);
    }
}


