package Odevlerim.HalitHocadanOdevler._02_.Ozel3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 2- Girdiğiniz String parametresinin herbir karakterinin(char) sayısını döndüren charCount
 * metodunu yazınız.
 * Örnek:
 * String = aabbbcccc
 * return a , 2 olmalı
 * b , 3
 * c , 4
 * Not: Stringde herhangi bir char olabilir.
 */
public class Q02_CharCount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir cümle giriniz: ");
        String girilenStr = input.nextLine();

        charCount(girilenStr);

    }

    public static Map<Character,Integer> charCount(String formalStr){

        formalStr = formalStr.replace(" ","");

        char[] diziStr = formalStr.toCharArray();
        // GİRİLEN STRINGI KARAKTER DİZİSİNE AKTARDIM,
        // SONRA DA MAP İLE HER FAKLI KARAKTERİ KEY-VALUE ŞEKLİNDE
        // KARAKTER-SAYAC OLARAK EŞİTLEYECEĞİM

        int count = 0;
        Map<Character,Integer> charCountMap = new HashMap<>();

        for (int i=0 ; i< diziStr.length ; i++) {

            count = 0;      // COUNT U i DEĞİL; j DONGUSUNDEN MAP A AKTARACAĞIZ.

            for (int j=0 ; j<diziStr.length ; j++) {
                if (diziStr[i] == diziStr[j])
                    count++;
            }
            charCountMap.put(diziStr[i],count);      // OLUŞAN KARAKTERLERİ MAP TE SAYAÇ LA BİRİKTİRİYORUZ

        }
        System.out.println("charCountMap = " + charCountMap);

        return charCountMap;
    }
}
