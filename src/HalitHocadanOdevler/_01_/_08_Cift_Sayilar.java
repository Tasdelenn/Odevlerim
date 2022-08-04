package Odevlerim.HalitHocadanOdevler._01_;

import java.util.Scanner;

public class _08_Cift_Sayilar {
    //8- Girilen bir sayıya kadar olan çift sayıları (0 ve girilen sayı dahil) yazdırınız.
    //Example 1: int input = 10; print 0 2 4 6 8 10 olmalı
    //Example 2: int input = 15; print 0 2 4 6 8 10 12 14 olmalı

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz = ");
        int sayi= oku.nextInt();

        for (int i = 0; i < sayi; i=i+2) {
            System.out.print(" " + i);
        }
    }
}
