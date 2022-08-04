package Odevlerim.HalitHocadanOdevler._01_;

import java.util.Scanner;

public class _09_Random {
    //9- Kullanıcıdan pozitif bir sayı alınız ve 0 ile girilen sayı arasında
    // Random int tipinde bir sayı üreten programı yazınız.
    //not : girilen sayı üretilen sayılara dahil olmalı

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Pozitif bir sayı giriniz = ");
        int girilenSayi= oku.nextInt();

        int randomS=(int) (Math.random()*girilenSayi);
        System.out.println("Üretilen Rastgele Sayı = " + randomS);
    }
}
