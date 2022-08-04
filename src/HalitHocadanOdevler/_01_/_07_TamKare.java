package Odevlerim.HalitHocadanOdevler._01_;

import java.util.Scanner;

public class _07_TamKare {
    //7- Girilen pozitif bir sayının tam kare olup olmadığını bulunuz, tam kare ise true değilse false
    //yazdırınız. Not: sqrt gibi fonksiyonları kullanmayın.
    //Example 1: //Input: 16  //Output: true
    //Not: bu sayı tam kare çünkü 4*4 = 16
    //Example 2: //Input: 14  //Output: false (14 tam kare degil)

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz = ");
        double kareMi=oku.nextDouble();

        int sayac=1;
        int kok=0;
        while(sayac <= kareMi)
        {
            if (sayac*sayac == kareMi){
                kok=sayac;
                break;
            }

            sayac++;
        }

        if (kok >0)
            System.out.println( kareMi +" -> tam karedir : " + (sayac==kok) + "   Kök = " + kok);
        else
            System.out.println( kareMi + "-> tam kare değildir :" + (sayac==kok));
    }
}
