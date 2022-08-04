package Odevlerim.HalitHocadanOdevler._02_.Ozel2;

import java.util.ArrayList;
import java.util.Scanner;

/**9- Bir int array verildiğinde, array uzunluğu 1 veya daha fazlaysa ve ilk öğe ile son öğe eşitse
 true değerini yazdırınız.
 sameFirstLast([1, 2, 3]) → false
 sameFirstLast([1, 2, 3, 1]) → true
 sameFirstLast([1, 2, 1]) → true
 sameFirstLast([1]) → true
 sadece true veya false print ediniz.
 */

public class Q9_IlkSonOgeEsitMi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin rakamlardan oluşan elemanlarını\n" +
                "arada birer boşluk bırakarak giriniz : ");
        String str1 = input.nextLine();
        String[] str1Arr = str1.split(" ");           // BOŞLUK BAZ ALINARAK GİRİLENLERİ DİZİYE AKTARDIM
        ArrayList<Integer> intList1 = new ArrayList<>();    // BURADA DA STRING OLARAK GİRİLEN DİZİYİ,
        for (int i = 0; i < str1Arr.length; i++)            // INTEGER DİZİYE AKTARIYORUM
            intList1.add(Integer.parseInt(str1Arr[i]));
        System.out.println("intList1 = " + intList1);

        boolean ilkSonEsitMi = false;
        for (int i = 0; i < intList1.size(); i++) {
            if (intList1.get(0) == intList1.get(intList1.size()-1))
                ilkSonEsitMi = true;
        }

        System.out.println("ilkSonEsitMi = " + ilkSonEsitMi);
    }
}


