package Odevlerim.IsmetHocadan.Odevlerim_21;

import java.util.ArrayList;
import java.util.Scanner;

public class _05_Method {

    //5-getSum isminde bir method oluşturun.Parametresi ArrayList'tir.
    //Dizideki tüm $ ları kaldır ve tüm sayıları topla return yaptğımız veri tipi 'int' olmalıdır.
    //sonuç 0'dan küçükse, -1 yazdırın.
    //Örnek1: ArrayList = $13, $15, $20 Cevap = 48 olmalı
    //Örnek 2 : ArrayList= $-13, $0, $0
    //Cevap = -1 olmalı.

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        ArrayList<String> $_liListe= new ArrayList<>();

        String devamMi="";
        int i=1;
        do{
            System.out.print((i +". *$_Değer* Giriniz ="));
            String $_li=oku.next();
            $_liListe.add($_li);
            System.out.print("Devam Etmek istiyor musunuz (E/H) ");
            devamMi=oku.next();
            i++;
        }while( devamMi.equalsIgnoreCase("E"));

        System.out.println($_liListe);  // KONTROL AMAÇLI, GEREKLİ DEĞİL.
        System.out.println("\nTOPLAM: " + getSum($_liListe) + "$");

    }
    public static int getSum(ArrayList<String> arrayList){

        int $_sizIntDeger;
        int toplam=0;

        for (int i = 0; i < arrayList.size(); i++) {
            $_sizIntDeger=Integer.parseInt(arrayList.get(i).replace("$",""));
            toplam=toplam + $_sizIntDeger;
        }
        if (toplam>=0)
            return toplam;

        else return -1;
    }
}


//   YAPAMADIĞIM ÇÖZÜM
//       // System.out.println("Bir değer giriniz ($1234)");
//
//        ArrayList<String> kac$=new ArrayList<>();
//
//        String devamMi="";
//        do{
//            System.out.print("Değer Giriniz ($1234) = ");
//            kac$.add(oku.next());
//
//            System.out.print("Devam Etmek istiyor musunuz (E/H) ");
//            devamMi=oku.next();
//
//        }while( devamMi.equalsIgnoreCase("E"));
//
//        System.out.println("kac$ = " + kac$);  //KONTROL
//
//        for (int i = 0; i < kac$.size(); i++) {
//
//
//        }
//        }
//
//    public static void getSum(String ArrayList){
//
//
//
//
//        //return veri;
//
