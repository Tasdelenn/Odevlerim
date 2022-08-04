package Odevlerim.HalitHocadanOdevler._02_.Ozel2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 3- a ve b den oluşan 2 int array verildiğinde, aynı ilk öğeye sahiplerse veya aynı son öğeye
 sahiplerse true değerini döndürünüz.
 Her iki arrayin lengthi(öğe sayısı) 1 veya daha fazla olacaktır.
 commonEnd([1, 2, 3], [7, 3]) → true
 commonEnd([1, 2, 3], [7, 3, 2]) → false
 commonEnd([1, 2, 3], [1, 3]) → true
 */

public class Q3_DiziIlkSonOgeAyniMi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci dizinin rakamlardan oluşan elemanlarını\n" +
                "arada birer boşluk bırakarak giriniz : ");
        String str1 = input.nextLine();
        String[] str1Arr = str1.split(" ");           // BOŞLUK BAZ ALINARAK GİRİLENLERİ DİZİYE AKTARDIM
        ArrayList<Integer> intList1 = new ArrayList<>();    // BURADA DA STRING OLARAK GİRİLEN DİZİYİ,
        for (int i = 0; i < str1Arr.length; i++)            // INTEGER DİZİYE AKTARIYORUM
            intList1.add(Integer.parseInt(str1Arr[i]));
        System.out.println("intList1 = " + intList1);

        System.out.print("\nİkinci dizinin rakamlardan oluşan elemanlarını\n" +
                "arada birer boşluk bırakarak giriniz : ");
        String str2 = input.nextLine();
        String[] str2Arr = str2.split(" ");
        ArrayList<Integer> intList2 = new ArrayList<>();
        for (int i = 0; i < str2Arr.length; i++)
            intList2.add(Integer.parseInt(str2Arr[i]));
        System.out.println("intList2 = " + intList2);

        boolean commonEnd = false;

        if (intList1.get(0) == intList2.get(0) || intList1.get(intList1.size()-1) == intList2.get(intList2.size()-1))
            commonEnd = true;

        System.out.println("\nGirilen İki Dizi Aynı İlk veya Son Öğeye Sahip mi?  = " + commonEnd);
    }
}
