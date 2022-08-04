package Odevlerim.HalitHocadanOdevler._02_.Ozel2;

import java.util.Arrays;
import java.util.Scanner;

/**
 8- Verilen String arrayde;
 String arrayi ters çeviriniz.
 ters arrayi yazdırınız.
 NOT:
 Arrays.toString(your_array_name); <--- kullanınız.
*/

 public class Q8_TerstenCumleDizisi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Cümleyi Giriniz: ");
        String girilenStr = input.nextLine();
        String[] strDizi = girilenStr.split(" ");
        String[] tersDizi = new String[strDizi.length];

        for (int i = 0; i < strDizi.length; i++) {
            tersDizi[i] = strDizi[strDizi.length-1-i];
        }

        System.out.println("Ters Dizi = " + Arrays.toString(tersDizi));
    }
}
