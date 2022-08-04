package Odevlerim.HalitHocadanOdevler._02_.Ozel3;

import java.util.Scanner;

/**
 * 1- Parametresi int ve return tipi int olan power4 isminde method verilmiştir.
 * power4 metodu girilen int parametresinin rakamlarının ayrı ayrı 4.kuvvetini alıp toplayınız.
 * Örnek:
 * parameter int is 1234
 * 1⁴ + 2⁴ + 3⁴ + 4⁴ = 1 + 16 + 81 + 256
 * result 354 olmalı.
 */

public class Q01_power4 {

    public static int power4(int sayi) {

        int toplam = 0;
        while (sayi % 10 < sayi) {
            toplam = toplam + (sayi % 10) * (sayi % 10) * (sayi % 10) * (sayi % 10);
            sayi = sayi / 10;
        }

        return (toplam + (sayi * sayi * sayi * sayi));
    }

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");

        System.out.println("Rakamların 4. Üs Toplamı = " + power4(oku.nextInt()));
    }
}


