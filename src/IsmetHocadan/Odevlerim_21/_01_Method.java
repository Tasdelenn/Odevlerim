package Odevlerim.IsmetHocadan.Odevlerim_21;

import java.util.Scanner;

public class _01_Method {
    //1-Ismi **randomNum** olan bir method oluşturun. Parametre olarak **int max** almalı.
    //Bu method, 0 ile max arasında random bir değer döndürmelidir. Random numarayı döndürünüz.

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir değer giriniz = ");
        int maksimum = oku.nextInt();

        System.out.println("return = " + randomNum(maksimum));
    }

    public static int randomNum(int max){

        return (int) (Math.random()*max);
    }
}
