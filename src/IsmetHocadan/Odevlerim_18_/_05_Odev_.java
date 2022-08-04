package Odevlerim.IsmetHocadan.Odevlerim_18_;

import java.util.Scanner;

public class _05_Odev_ {

    // 5- Kullanıcın girdiği bir sayının ilk ve son basamaklarının eşit olup olmadığınız bulunuz
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz =");
        int sayi = oku.nextInt();

        int enkBs = sayi % 10;
        int enbBs = sayi;

        while (enbBs >= 10)
            enbBs = enbBs / 10;

        System.out.println("En Büyük Basamak = " + enbBs + "\nEn Küçük Basamak = " + enkBs);

        if (enbBs == enkBs)
            System.out.println("* birbirine eşittir.");
        else System.out.println("* birbirine eşit değildir.");
    }
}




