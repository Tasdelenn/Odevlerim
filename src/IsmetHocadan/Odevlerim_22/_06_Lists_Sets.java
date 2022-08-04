package Odevlerim.IsmetHocadan.Odevlerim_22;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 6-hillNum() isminde bir method oluşturun. Parametre olarak Integer ArrayList Return tipi int,
 * Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
 * Örneğin;
 * ArrayList  5,4,6,2,1   2, 6'dan küçük ve 1 den büyüktür. Return 2 olmalı.
 */

public class _06_Lists_Sets {
    public static int hillNum(ArrayList<Integer> diziNum){

        ArrayList<Integer> arrNew = new ArrayList<>();

        for (int i = 1; i < (diziNum.size()-1); i++) {
            if ( (diziNum.get(i) < diziNum.get(i-1)) && (diziNum.get(i) > diziNum.get(i+1)) )
                arrNew.add(diziNum.get(i));
        }

        // System.out.println("arrNew = " + arrNew);    //KONTROL AMAÇLI

        return arrNew.get(0);   // return int istendiği için dizinin ilk uyan elmanını aldım.
    }

    public static void main(String[] args) {

        Scanner oku= new Scanner(System.in);
        System.out.print("Dizi Kaç Elemanlı? = ");
        int elemanS = oku.nextInt();

        ArrayList<Integer> girilenListe = new ArrayList<>();

        for (int i = 0; i < elemanS; i++) {
            System.out.print((i+1) + ". Eleman = ");
            girilenListe.add(oku.nextInt());
        }

        System.out.println("Kritere Uygun İlk Eleman = " +hillNum(girilenListe));
    }
}
