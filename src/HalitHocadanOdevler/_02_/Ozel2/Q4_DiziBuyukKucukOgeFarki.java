package Odevlerim.HalitHocadanOdevler._02_.Ozel2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 4- Bir veya daha fazla öğe içeren int array verildiğinde, arraydeki en büyük ve en küçük öğeler
 * arasındaki farkı return ediniz.
 * Not: the built-in Math.min(v1, v2) ve Math.max(v1, v2) methodları en küçük ve en büyük
 * öğeleri return eder.
 * bigDiff([10, 3, 5, 6]) → 10-3 result = 7
 * bigDiff([7, 2, 10, 9]) → 10-2 result = 8
 * bigDiff([2, 10, 7, 1]) → 10-1 result = 9
 * return tipi int dir.
 */

public class Q4_DiziBuyukKucukOgeFarki {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin rakamlardan oluşan elemanlarını,\n" +
                "arada birer boşluk bırakarak giriniz : ");
        String str1 = input.nextLine();
        String[] str1Arr = str1.split(" ");           // -->BOŞLUK BAZ ALINARAK GİRİLENLERİ DİZİYE AKTARDIM
        ArrayList<Integer> intList = new ArrayList<>();    // -->BURADA DA STRING OLARAK GİRİLEN DİZİYİ,
        for (int i = 0; i < str1Arr.length; i++)            // INTEGER DİZİYE AKTARIYORUM
            intList.add(Integer.parseInt(str1Arr[i]));
        System.out.println("intList1 = " + intList);

        System.out.println("bigDiff(intList) = " + bigDiff(intList));
        System.out.println("bigDiffMath(intList) = " + bigDiffMath(intList));
    }

    public static int bigDiff(ArrayList<Integer> intListFormal){    // 1.YÖNTEM : IF İLE BU ŞEKİLDE YAPARIZ

        int enb=intListFormal.get(0), enk=intListFormal.get(0);
        for (Integer i : intListFormal) {                 // INTELLIJ FOREACH ÖNERDİ, DAHA KISA GÖRÜNÜM OLDU
            if (enb < i)
                enb = i;
            if (enk > i)
                enk = i;
        }
        return (enb-enk);
    }

    public static int bigDiffMath(ArrayList<Integer> intListFormal){    // 2. YÖNTEM : MATH METHOD İLE BENZER
        int mx = intListFormal.get(0), mn = intListFormal.get(0);       // ŞEKİLDE YAPABİLİRİZ...
        for (Integer i : intListFormal) {
            mx = Math.max(intListFormal.get(0), i);
            mn = Math.min(intListFormal.get(0), i);
        }
        return (mx-mn);
    }
}
