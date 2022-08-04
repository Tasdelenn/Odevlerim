package Odevlerim.HalitHocadanOdevler._01_;

import java.util.Scanner;

public class _11_String_Sayi {
    //11- Girilen bir string deki harf sayısı tek ise true , değilse false yazdırınız.

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Lütfen Bir Cümle Giriniz : ");
        String Cumle= oku.nextLine();

        Cumle=Cumle.replace(" ","");
        int harfSayisi=Cumle.length();
        boolean harfSayisiTekMi= (harfSayisi %2 == 1);

        if (harfSayisi %2 == 1)
            System.out.println("Harf Sayısı Tek mi? : " + harfSayisiTekMi + "adet=" +harfSayisi);
        else System.out.println("Harf Sayısı Tek mi? : " + harfSayisiTekMi + " (adet : " + harfSayisi +")");
    }
}
