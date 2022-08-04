package Odevlerim.IsmetHocadan.Odevlerim_22;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 4-İsmi changelnArraylist() olan bir method oluşturun.  Parametre olarak String ArrayList, String s1, String s2
 * Arraylist'te s1'i s2 olarak değiştirin Return String arrayList
 * Örneğin;
 * Arraylist  "yellow" , "red" , "blue" , "red" , "blue" s1 = blue s2 = yellow // Tüm blue 'ları yellow'a dönüştürün.
 * cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
 */

public class _04_Lists_Sets {
    public static ArrayList<String> changeInArrayList(ArrayList<String> arrListStr, String s1, String s2) {

        for (int i = 0; i < arrListStr.size(); i++) {

            if (arrListStr.get(i).equals(s1)) {
                arrListStr.set(i,s2);
                // arrListStr.remove(s1);   // ÖNCE BÖYLE YAPTIM
                // arrListStr.add(s2);      // AMA DEĞİŞİM AYNI İNDEXTE İSTENİYOR DİYE set KULLANDIM.
            }
        }
        return arrListStr;
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
        System.out.println(changeInArrayList(girilenStrDizi,"blue","yellow"));
    }
}
