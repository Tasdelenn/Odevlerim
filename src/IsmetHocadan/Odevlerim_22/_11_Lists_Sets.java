package Odevlerim.IsmetHocadan.Odevlerim_22;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 11-Create a method totalCount() totalCount() isminde bir method oluşturun.
 * Parametresi  'Integer Hashset' olmalı HashSetteki eleman sayısını alın. totalCount'u döndürün.
 * _**Örnek:**_
 * hashset ; 4,2,3,1,7
 * cevap: 5
 */

public class _11_Lists_Sets {

    public static int totalCount(HashSet<Integer> hs){
        int totalCount = hs.size();
        return totalCount;
    }

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>(Arrays.asList(4,2,2,2,2,3,1,7,7));
        System.out.println("hs = " + hs);  // KONTROL NOKTASI

        System.out.println("totalCount(hs) = " + totalCount(hs));
    }
}
