package Odevlerim.IsmetHocadan.Odevlerim_22;

import java.util.LinkedHashSet;

/**
 * 14-removing() isminde bir method oluşturun. Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
 * Eğer Stringler LinkedHashset 'in içinde varsa, sil.   Return tipi linkedhashset
 * Örneğin,
 * linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
 * String 1= Germany
 * String 2 = USA
 *  **Germany ve USA 'i sil.**
 * **Set'i döndür.**
 */

public class _14_Lists_Sets {

    public static LinkedHashSet<String> removing(LinkedHashSet<String> lhsRemo, String s1, String s2){

        //LinkedHashSet<String> lhsRemo = new LinkedHashSet<>();
        if (lhsRemo.contains(s1) && lhsRemo.contains(s2)){
            lhsRemo.remove(s1);
            lhsRemo.remove(s2);}

        return lhsRemo;
    }

    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Germany");
        lhs.add("France");
        lhs.add("USA");
        lhs.add("Canada");
        lhs.add("Mexico");
        lhs.add("Brazil");

        String s1 = "Germany";  // SİL 1
        String s2 = "USA";      // SİL 2

        System.out.println("Silinmeden Önceki Liste :\n" + lhs);
        System.out.println("\nSilinen Liste :\n" + removing(lhs, s1, s2));
    }
}
