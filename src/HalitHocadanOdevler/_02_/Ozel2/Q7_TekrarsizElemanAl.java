package Odevlerim.HalitHocadanOdevler._02_.Ozel2;

import java.util.HashSet;
import java.util.Scanner;

/**
 7- Verilen int arrayde;
 duplicated(tekrarlanan) öğeleri array den kaldırınız.
 non-duplicated(tekrarlanmayan) öğeleri print ediniz.
 Örnek:
 Array is 1,2,2,2,3,3,3,4,4,4,5,5,5
 result [1,2,3,4,5] olmalı
 NOT: resultu print ederken for loop kullanmayınız.
 System.out.println(Arrays.toString(your_array_name)); kullanınız.
 */

public class Q7_TekrarsizElemanAl {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Dizinin rakamlardan oluşan elemanlarını,\n" +
                "aralarına birer virgül koyarak (,) giriniz : ");
        String str1 = input.nextLine();
        String[] str1Arr = str1.split(",");           // --> BOŞLUK BAZ ALINARAK GİRİLENLERİ DİZİYE AKTARDIM
        HashSet<Integer> intHashS = new HashSet<>();        // --> SET(HASH) OLUŞTURUYORUM TEKRARSIZLARI ALMAK İÇİN
        for (int i = 0; i < str1Arr.length; i++)            // INTEGER DİZİYE AKTARIYORUM
            intHashS.add(Integer.parseInt(str1Arr[i]));

        System.out.println("intHashS = " + intHashS);
    }
}
