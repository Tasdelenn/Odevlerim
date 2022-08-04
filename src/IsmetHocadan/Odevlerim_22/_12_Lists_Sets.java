package Odevlerim.IsmetHocadan.Odevlerim_22;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 12-changeSet() isminde bir method oluşturun.Parametre olarak bir String HashSet   ve  iki String
 * return hashset olmalı. Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
 * **ÖRNEK:**
 * hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
 * String 1 = **banana**
 * String 2 = **peach**
 * **CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"
 */

public class _12_Lists_Sets {

    public static HashSet<String> changeSet(HashSet<String> hs, String s1, String s2){

            if (hs.contains(s1)) {
                hs.remove(s1);
                hs.add(s2);
            }
        return hs;  //HASHSET SIRAYI ÖNEMSEMEDİĞİ İÇİN AYRICA SIRALAMA YAPMADIM.
                    //GEREK OLURSA LINKEDSET VEYA TREESET KULLANIRIM DİYE DÜŞÜNDÜM.
    }

    public static void main(String[] args) {

        String[] str = {"banana","stawberry","kiwi","pineapple"};
        HashSet<String> hs = new HashSet<String> (Arrays.asList(str));
        String s1 = "banana";
        String s2 = "peach";

        System.out.println("hs = \n" + hs);
        System.out.println("\nchangeSet(hs,s1,s2) = \n" + changeSet(hs,s1,s2));
    }
}
