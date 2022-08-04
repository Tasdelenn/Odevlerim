package Odevlerim.HalitHocadanOdevler._01_;

import java.util.Scanner;

public class _12_Concat {
    //12- Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle.
    // Eger ilk kelimenin son harfi, ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini kaldırın
    // Örnek: "abc", "cat" --> "abcat" "abc", "dog" -->"abcdog"

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("İlk kelimeyi giriniz : ");
        String str1= oku.next();
        System.out.print("İkinci kelimeyi giriniz : ");
        String str2=oku.next();

        String tekStr;
        if (str1.indexOf( (str1.length()-1) ) == str2.indexOf(0))
            tekStr=str1.concat(str2.substring(1));
        else
            tekStr=str1.concat(str2);

        System.out.println("tekStr = " + tekStr);
    }
}
