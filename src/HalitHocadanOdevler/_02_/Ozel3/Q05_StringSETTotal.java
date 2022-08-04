package Odevlerim.HalitHocadanOdevler._02_.Ozel3;

import java.util.*;

/**
 * 5- Parametresi Set String olan ve Set içindeki Stringlerin uzunluklarının toplamını döndüren
 * getTotalLength metodunu yazınız.
 * return total
 * Örnek:
 * Set String "repl" "is" "homework"
 * result 14 olmalı
 * NOT : EĞER SONUÇ 0'A EŞİT OLURSA -1 İLE DEĞİŞTİRİNİZ.
 */

public class Q05_StringSETTotal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("String Giriniz: ");
        String girilenStr = input.nextLine();

        HashSet<String> girHashList = new HashSet<>(Arrays.asList(girilenStr.split(" ")));

        System.out.println("girHashList = " + girHashList);     /**KONTROL*/

        System.out.println("GİRİLEN YEGANE STRING UZUNLUKLARI TOPLAMI = " + getTotalLength(girHashList));

    }

    public static int getTotalLength(HashSet<String> formalHash) {

        int toplam = 0;

        for (String iStr : formalHash)  // HASHLİST İN İÇİNDEKİ ELEMANLARI BİR SIRAYLA iStr İSMİNİ VEREREK GÖNDERİYOR
        {                                // BUNUN LENGTH İNİ ALARAK HER SEFERİNİ TOPLAMA EKLEDİM.
            toplam = toplam + iStr.length();
        }

        if (toplam == 0)
            return (-1);
        else
            return toplam;
    }
}
