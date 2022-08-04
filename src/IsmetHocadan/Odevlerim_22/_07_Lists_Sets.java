package Odevlerim.IsmetHocadan.Odevlerim_22;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 7-common_values( ) isminde bir method oluşturun. Parametre olarak 2 tane Integer ArrayList
 * Return tipi integer ArrayList olmalı İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
 * Örneğin;
 * ArrayList 1: 3 , 2 , 5 , 6   *	ArrayList 2: 5 , 8 , 9    * return  5 olmalı
 * Örneğin;
 * ArrayList 1: 8,7,9,6,7    * ArrayList 2: 6,7,12,3,1   * return 6 ve 7 olmalı
 */

public class _07_Lists_Sets {

    public static ArrayList<Integer> common_values(ArrayList<Integer> arrLst1, ArrayList<Integer> arrLst2){

        ArrayList<Integer> arrOrtak = new ArrayList<>();

        for (int i = 0; i < arrLst1.size(); i++) {
            for (int j = 0; j < arrLst2.size(); j++) {

                if (arrLst1.get(i) == arrLst2.get(j))
                    //arrOrtak.add(arrLst1.get(i)); // BU DA OLABİLİR
                    arrOrtak.add(arrLst2.get(j));
            }
        }
        return arrOrtak;
    }

    public static void main(String[] args) {

        ArrayList<Integer> dizi_1 = new ArrayList<>();
        ArrayList<Integer> dizi_2 = new ArrayList<>();


        Scanner oku= new Scanner(System.in);

        System.out.print("İlk Dizi Kaç Elemanlı? = ");
        int elemanS_1 = oku.nextInt();

        for (int i = 0; i < elemanS_1; i++) {
            System.out.print((i+1) + ". Eleman = ");
            dizi_1.add(oku.nextInt());
        }

        System.out.print("İkinci Dizi Kaç Elemanlı? = ");
        int elemanS_2 = oku.nextInt();

        for (int i = 0; i < elemanS_2; i++) {
            System.out.print((i+1) + ". Eleman = ");
            dizi_2.add(oku.nextInt());
        }

        System.out.println("Ortak Elemanlar = " + common_values(dizi_1,dizi_2));
    }
}
