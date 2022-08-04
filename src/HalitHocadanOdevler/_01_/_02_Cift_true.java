package Odevlerim.HalitHocadanOdevler._01_;

import java.util.Scanner;

public class _02_Cift_true {
    //2- Girilen bir sayı çift ise "true" , tek ise "false" yazdırınız.

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz = ");
        double sayi= oku.nextDouble();

        System.out.println("Girilen Sayı Çift mi? : " + (sayi %2 == 0));
    }
}
