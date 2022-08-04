package Odevlerim.HalitHocadanOdevler._01_;

import java.util.Scanner;

public class _05_faktoriyel {
     //5- Girilen bir sayının faktöriyel değerini bulmak için bir program yazın.
     //   number:6
     //   factorial:1*2*3*4*5*6=720
     //   output ---> 720

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Lütfen faktöriyeli hesaplanacak sayıyı giriniz = ");
        double deger= oku.nextDouble();

        double carpim=1;
        for (int i = 1; i < deger; i++)
            carpim=carpim*i;

        System.out.println("Girilen değerin faktöriyeli = " + carpim);
    }
}
