package Odevlerim.IsmetHocadan.Odevlerim_22;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 3- getLength() isminde bir method oluşturun. Parametre olarak String ArrayList
 * Return tipi Integer ArrayList ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
 * Tüm elementlerin uzunluğunu döndürün
 * Örneğin;
 * ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
 * Tüm Stringlerin uzunluklarını yazdırın;
 * cevap: 10 ,  8 , 4 , 7 , 6 olmalı
 */

public class _03_Lists_Sets {

    public static ArrayList<Integer> getLength(ArrayList<String> arrStrList){

        ArrayList<Integer> arrUzunluk = new ArrayList<>();

        for (int i = 0; i < arrStrList.size(); i++) {
            arrUzunluk.add(arrStrList.get(i).length());
        }

        return arrUzunluk;
    }

    public static void main(String[] args) {

        ArrayList<String> girilenStrDizi = new ArrayList<>();

        Scanner okuInt= new Scanner(System.in);
        System.out.print("String Dizisi Kaç Elemanlı? = ");
        int elSay = okuInt.nextInt();

        for (int j = 0; j < elSay; j++) {
            Scanner okuStr = new Scanner(System.in);
            System.out.print((j+1) + ". Eleman = ");
            girilenStrDizi.add(okuStr.nextLine());
        }

        System.out.println(getLength(girilenStrDizi));
    }
}
