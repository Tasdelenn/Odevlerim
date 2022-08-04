package Odevlerim.IsmetHocadan.Odevlerim_22;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 13-commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
 * return tipi arraylist olmalı.
 * **ÖRNEĞİN:**
 *     İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**
 *     İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**
 * Ortak değerleri ArrayListe ekleyiniz.
 * çıktı:  "Germany" , "Brazil" ,"USA"
 * ArrayListi yazdırınız.
 */

public class _13_Lists_Set {

    public static ArrayList<String> commonValues(HashSet<String> hs1, HashSet<String> hs2){

        ArrayList<String> ortakStr = new ArrayList<>(hs1);  // ortakStr.addAll YERİNE JAVA DİREKT GİRİŞTE
                                                            // TANIMLASANA DİYE BUNU ÖNERDİ
        ortakStr.retainAll(hs2);

        return ortakStr;
    }

    public static void main(String[] args) {

        HashSet<String> hs1S = new HashSet<>();
        HashSet<String> hs2S = new HashSet<>();

        hs1S.add("Germany");
        hs1S.add("England");
        hs1S.add("South Africa");
        hs1S.add("Brazil");
        hs1S.add("USA");

        hs2S.add("Germany");
        hs2S.add("China");
        hs2S.add("Brazil");
        hs2S.add("France");
        hs2S.add("USA");

        System.out.println("Ortak Elemanlar = " + commonValues(hs1S,hs2S));
    }
}
