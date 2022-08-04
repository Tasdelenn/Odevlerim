package Odevlerim.IsmetHocadan.Odevlerim_21;

import java.util.Scanner;

public class _03_Method {
    //3-reverseString isminde bir method oluşturun.Bu method bir String'i parametre olarak alsın.
    //Ve bu method, girilen String'i tersten yazsın.Terste yazılmış halini yazdırınız.
    //Örn: String = "Java'yı Seviyorum."
    //Print: .muroyiveS ıy'avaJ

    public static void main(String[] args) {
        
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Cümle Giriniz : ");
        String cumle = oku.nextLine();

        reverseString(cumle);

    }

    public static String reverseString(String str) {

        char[] ters = new char[str.length()];

        for (int i = 0; i < ters.length; i++) {
            ters[i] = (str.charAt( (str.length()-1) - i));
            System.out.print(ters[i]);
        }
            return str;
    }
}








