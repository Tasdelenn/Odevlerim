package Odevlerim.HalitHocadanOdevler._02_.Ozel2;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_DiziXElemanIceriyoMu {
    /**
     * 1- Aşağıdaki düzende tek line verilen 5 adet eleman , aşağıdaki okuma ile
    ilki 3 ,ikincisi 2 elemanlı 2 adet diziye atılmaktadır.Bu kod vardır.
    İkinci dizinin tüm elemanları 1.nin içerisinde var ise true, yok ise false
    gönderiniz.
        1 2 3 2 3 → 1.dizi : 1,2,3 2.Dizi : 2,3 => true
        10 20 3 1 2 → 1.dizi : 10 20 3 2.Dizi : 1,2 => false
        1 2 3 1 2 → 1.dizi : 1 2 3 2.Dizi : 1 2 => true
     */

    public static void main(String[] args) {

        int[] diziT = new int[5];
        int[] dizi1 = new int[3];
        int[] dizi2 = new int[2];

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + ". eleman = ");
            diziT[i] = in.nextInt();
        }
        System.out.println("Tüm Dizi=" + Arrays.toString(diziT));

        for (int i = 0; i < 5; i++)

            if (i<3)
            dizi1[i] = diziT[i];
            else dizi2[i-3] = diziT[i];

        System.out.print("Dizi1=" + Arrays.toString(dizi1));
        System.out.print("  Dizi2=" + Arrays.toString(dizi2));

        int sayac = 0;
        boolean iceriyoMu = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (dizi2[j] == dizi1[i])
                    sayac++;
            }
        }

        if (sayac == dizi2.length)
            iceriyoMu = true;
        else iceriyoMu = false;

        System.out.println("    iceriyoMu = " + iceriyoMu);
    }
}
