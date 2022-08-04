package Odevlerim.IsmetHocadan.Odevlerim_22;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 5-rotateList() isminde bir method oluşturun.Parametre olarak String ArrayList
 * ArrayList'in dizilişini terse döndürün. (Tersten yazdırın) Tersten yazılmış halini return edin.
 *Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
 *cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
 */

public class _05_Lists_Sets {

    public static ArrayList<String> rotateList(ArrayList<String> arrTers){

        ArrayList<String> yeniTers = new ArrayList<>();

        for (int i = 0; i < arrTers.size(); i++) {
            yeniTers.add(i,arrTers.get(arrTers.size()-i-1));
        }

        return yeniTers;
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

        System.out.println(rotateList(girilenStrDizi));
    }
}

