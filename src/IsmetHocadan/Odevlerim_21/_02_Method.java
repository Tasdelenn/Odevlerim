package Odevlerim.IsmetHocadan.Odevlerim_21;

import java.util.Scanner;

public class _02_Method {
    //2-"OrtaKelime" isminden bir method oluşturun.Bu method String'i parametre olarak almalı.
    //Cümle veya dizelerde ortada bulunan kelimeleri bulmalı. Ortadaki kelimeyi return yapınız.
    //Örnek: Ben Java'yı seviyorum.print : Java'yı
    //Örnek2:Java'yı kolayca öğreniyorum. print: kolayca

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Lütfen String Giriniz : ");
        String cumle=oku.nextLine();

        System.out.println("Ortadaki Kelime = " + OrtaKelime(cumle));

    }
    public static String OrtaKelime(String cumle){

        String[] kelimeler=cumle.split(" ");
        
        return kelimeler[(kelimeler.length)/2];  // TEK SAYIDA KELİME İÇEREN BİR CÜMLE VARSAYDIM...
    }
}
