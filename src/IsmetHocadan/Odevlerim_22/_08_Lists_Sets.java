package Odevlerim.IsmetHocadan.Odevlerim_22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 8- secondMax()  isminde bir method oluşturun. Parametre olarak integer ArrayList.
 * Return tipi int olmalı. ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
 * ÖRN;
 * ArrayList   --  5,3,4,6,7
 * CEVAP : 6
 */

public class _08_Lists_Sets {

    public static int secondMax(ArrayList<Integer> secMaxBul){

        Collections.sort(secMaxBul);
        int ikincienB=secMaxBul.get(secMaxBul.size()-2);

        return ikincienB;

    }

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Dizi kaç elemanlı olacak? = ");
        int elSay= oku.nextInt();

        ArrayList<Integer> arrLst = new ArrayList<>();

        for (int i = 0; i < elSay; i++) {
            System.out.print((i+1) + ". Eleman = ");
            arrLst.add(oku.nextInt());
        }

        System.out.println("Girilen Dizi = " + arrLst);  //KONTROL NOKTASI

        System.out.println("Dizinin İkinci En Büyük Elemanı = " + secondMax(arrLst));
    }
}


