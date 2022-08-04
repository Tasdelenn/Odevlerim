package Odevlerim.IsmetHocadan.Odevlerim_18_;

import java.util.Scanner;

public class _08_Odev_ {
    //8-Girilen bir cümledeki kelime sayısını bulunuz.(Regex kullanmayın)

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen Cümleyi Giriniz: ");
        String cumle = oku.nextLine();
        cumle = cumle.trim();  // Baştaki ve sondaki boşlukları kestik
        System.out.println(cumle);

        int boslukSayisi = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == ' ')
                boslukSayisi++;
        }
        System.out.print("Cümledeki Kelime Sayısı = " + (boslukSayisi + 1));
    }
}
