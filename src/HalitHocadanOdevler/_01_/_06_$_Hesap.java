package Odevlerim.HalitHocadanOdevler._01_;

import java.util.Scanner;

public class _06_$_Hesap {

    //6- İçinde negatif de olabilen sayının ve para sembolünün olduğu aşağıdaki gibi 3 tane String okutunuz
    //okunan bu 3 string içindeki negatif de olabilen sayıları toplayın.
    //Toplam pozitif ise toplamı yazdırın, eğer toplam negatif ise sadece -1 yazdırın.
    //Ornek:
    //String num1 = "$15"; String num2 = "$20";  String num3 = "$30"; output ----> 65; olmali
    //String num1 = "$15"; String num2 = "$-80"; String num3 = "$30"; output ----> -1; olmali

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Lütfen 1. $ Değerini Giriniz : ");
        String $_Deger1= oku.nextLine();
        System.out.print("\n       2. $ Değerini Giriniz : ");
        String $_Deger2= oku.nextLine();
        System.out.print("\n       3. $ Değerini Giriniz : ");
        String $_Deger3= oku.nextLine();

        int num1;
        int num2;
        int num3;

        String numS1=$_Deger1.replace("$","");
        String numS2=$_Deger2.replace("$","");
        String numS3=$_Deger3.replace("$","");

        num1= Integer.parseInt(numS1);
        num2= Integer.parseInt(numS2);
        num3= Integer.parseInt(numS3);

        int toplam=num1 + num2 + num3;
        if (toplam >= 0)
            System.out.println("\n  TOPLAM = " + toplam + " $");
        else System.out.println("\n-1");
    }
}
