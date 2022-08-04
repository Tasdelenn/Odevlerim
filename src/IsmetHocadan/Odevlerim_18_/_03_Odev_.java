package Odevlerim.IsmetHocadan.Odevlerim_18_;

import java.util.Scanner;

public class _03_Odev_ {

    public static void main(String[] args) {


        // 3-  Kullanıcıdan 10 adet sayı isteyiniz, eğer sayı çift ise toplasın, tek ise girdiğinde ise döngü sonlansın.

        int toplam = 0;
        int i = 1;

        Scanner oku = new Scanner(System.in);
        do {
            System.out.print(i + "nci sayıyı giriniz = ");
            int sayi = oku.nextInt();
            if (sayi % 2 == 0) {
                toplam = toplam + sayi;
                System.out.println("SON TOPLAM = " + toplam);
                i++;
            } else break;
        } while (i <= 10);
    }
}

