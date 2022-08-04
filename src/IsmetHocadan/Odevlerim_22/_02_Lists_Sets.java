package Odevlerim.IsmetHocadan.Odevlerim_22;
/**
 * 2-getSum() isminde bir method oluşturun.
 * Parametresi ArrayList olmalı Return tipi int olmalı.
 * ArrayList teki tüm sayıları birbiri ile toplayın. return olarak toplam sonucu döndürün.
 * Örneğin;
 * Arraylist = 1,2,3,4,5 return 15 olmalı
 */

import java.util.ArrayList;
import java.util.Scanner;

public class _02_Lists_Sets {

    public static int getSum(ArrayList<Integer> arrToplam){

        int toplam=0;
        for (int i = 0; i < arrToplam.size(); i++)
            toplam=toplam + arrToplam.get(i);

        return toplam;
    }

    public static void main(String[] args) {

        Scanner oku= new Scanner(System.in);
        System.out.print("Dizi Kaç Elemanlı? =");
        int elemanS = oku.nextInt();

        ArrayList<Integer> girilenListe = new ArrayList<>();

        for (int i = 0; i < elemanS; i++) {
            System.out.print((i+1) + ". Eleman = ");
            girilenListe.add(oku.nextInt());
        }

        System.out.println("Elemanlar Toplamı = " + getSum(girilenListe) );
    }
}
