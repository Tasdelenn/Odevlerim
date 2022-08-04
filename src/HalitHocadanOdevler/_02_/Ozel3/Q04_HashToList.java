package Odevlerim.HalitHocadanOdevler._02_.Ozel3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * 4- allNumbers Integer Hashset verildiğinde;
 * allNumbers hashset'i sort edin,
 * Sonucu ArrayList olarak değiştirin,
 * Return ArrayList.
 * NOT : SORUYU ÇÖZERKEN COLLECTİON CLASS KULLANMAYINIZ , FOR LOOP VEYA
 * FARKLI SET TİPLERİNİ KULLANINIZ.
 */

public class Q04_HashToList {

    public static void main(String[] args) {

        HashSet<Integer> allNumbers = new HashSet<>();
        for (int i = 0; i < 40; i++)
            allNumbers.add((int) (Math.random() * 100 + 1));    // HASHSET İ RASTGELE DOLDURUYORUM
        System.out.println("allNumbersHash = " + allNumbers);  // KONTROL

        TreeSet<Integer> allNumbersTree = new TreeSet<>(allNumbers);  // TREESET İLE SORT YAPTIM
        System.out.println("allNumbersTree = " + allNumbersTree);

        ArrayList<Integer> allNumbersList = new ArrayList<>(allNumbersTree);  // SORT ETTİKTEN SONRA LİSTE ATTIM
        System.out.println("allNumbersList = " + allNumbersList);
    }
}



















