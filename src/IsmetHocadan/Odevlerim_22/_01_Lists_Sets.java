package Odevlerim.IsmetHocadan.Odevlerim_22;
/**
 * 1-ismi getCount() olan bir method oluşturun.
 * Parametre olarak bir String ArayList  ve  bir tane String Return tipi int olmalı.
 * ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
 * Örneğin;
 * ArrayList = Orange , Kiwi , Peach , Banana , Orange
 * String Orange: Count = 2 olmalı. (Orange 2 kez yazılmış)
 */
import java.util.ArrayList;
import java.util.Arrays;

public class _01_Lists_Sets {

    public static int getCount(ArrayList<String> arrList, String str)
    {
        int counter=0;
        int i=0;

        do{
            if (arrList.get(i).equals(str))
            counter++;
            i++;
        }while ( i<= (arrList.size()-1) );
        
        return counter;
    }

    public static void main(String[] args) {

        String[] meyvelerS= {"Orange", "Kiwi", "Peach", "Banana", "Orange"}; // Bu kullanıcıdan da alınabilir
        ArrayList<String> meyveler=new ArrayList<>();
        meyveler.addAll(Arrays.asList(meyvelerS));  //ARRAY LİSTE STRING DİZİYİ (meyvelerS) KOPYALADIK.

        System.out.print("getCount return: " + getCount(meyveler,"Orange"));
    }
}
