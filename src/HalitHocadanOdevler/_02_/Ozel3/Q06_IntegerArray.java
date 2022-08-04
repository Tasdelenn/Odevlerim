package Odevlerim.HalitHocadanOdevler._02_.Ozel3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 6- İnteger array ‘numaralar’ ve integer ‘toplam’ verilmistir.
 Verilen array’de toplami, integer ‘toplam’ a esit olan kac cift numara bulunduğunu hesaplayınız.
 Örnek:
 int[] numaralar = {1, 9, 5, 14, 2, 0, 4};
 Int toplam = 6;
 Verilen array’de toplami 6 olan çift sayisini bulmalıyız.
 Toplami 6 olan ciftler = [1, 5] ve [2, 4] dur. Toplami 6 olan iki adet ciftimiz var.
 Result 2 olmali!
 */

public class Q06_IntegerArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Dizi kaç elemanlı olsun? = ");
        int elemanSayisi = input.nextInt();

        System.out.print("Aranacak iki sayı toplamını giriniz = ");
        int toplam = input.nextInt();

        int[] numaralar = new int[elemanSayisi];
        int sayac = 0;

        for (int i = 0; i < elemanSayisi; i++) {
            numaralar[i] = (int) (Math.random()*100);  // BİRDEN YÜZE KADAR RASTGELE SAYIYLA DOLDURDUM...
            System.out.print(numaralar[i] + " ");
        }

        System.out.println("\n");

        for (int i = 0; i < elemanSayisi; i++) {
            for (int j = i; j < elemanSayisi; j++) {

                    if((numaralar[i]+numaralar[j] == toplam) && (i != j)) // Dizi elemanını kendisiyle
                                                                          // kıyaslamamak için i j ye eşit olmamalı!!!
                    {
                    sayac++;
                    System.out.println(numaralar[i] + "," + numaralar[j]);}
            }
        }

        System.out.println("\nToplamı " + toplam  + " olan " + sayac + " adet çiftimiz var.");
    }
}
