package Odevlerim.IsmetHocadan.Odevlerim_18_;

import java.util.Scanner;

public class _12_Odev {
    //12. Kullanıcıdan alacağınız 5 ayrı kelimeyi bir diziye atayınız,
    // Kelimelerden en uzun olanının ilk ve son harfini Büyük ise küçük, küçük ise büyük hale getiriniz.

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        String[] dizi=new String[5];

        System.out.print("Lütfen bir kelime giriniz: ");
        dizi[0]=oku.next();

        for (int i = 1; i <5 ; i++) {
            System.out.print("Lütfen " +(i+1) + " nci Kelimeyi Giriniz: ");
            dizi[i]=oku.next();
        }

        String enUzunKelime=dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i].length()>enUzunKelime.length())
                enUzunKelime=dizi[i];
        }
        // Burda Beynim Durdu :) enUzunKelime.replaceAll(("[A-Z]", "[a-z]") || ("[a-z]","[A-Z]"))
        // En uzun kelimeyi yazdırayım bari :)
        System.out.println("enUzunKelime = " + enUzunKelime);

        char ilkHarf=enUzunKelime.charAt(0);
        char sonHarf=enUzunKelime.charAt((enUzunKelime.length()-1));

        int iH=(int) ilkHarf;   // İlk harf büyükse küçük, küçükse büyük yapacaz
        int sH=(int) sonHarf;   // ( ASCII den faydalanacağım -> a-z : 97-122   //// A-Z : 65-90 )

        System.out.println("sonHarf (ASCII)= " + sH + "\nilkHarf (ASCII)= " + iH);


        char i;
        if (iH>=97 && iH<=122)
            i=(char)(iH-32);
        else i=(char)(iH+32);

        char s;
        if (sH>=65 && sH<=90)
            s=(char) (sH+32);
        else s=(char) (sH-32);

        System.out.println(i+enUzunKelime.substring(1,enUzunKelime.length()-1)+s);
    }
}


        /*
        char ilkHarf=enUzunKelime.charAt(0);
        char sonHarf=enUzunKelime.charAt((enUzunKelime.length()-1));
        System.out.println("enUzunKelime ilk Harf= " + ilkHarf);
        System.out.println("enUzunKelime son Harf = " + sonHarf);

        //pes etmek yok devam...
        char ilkHarfYeni;
        char sonHarfYeni;
        if ((enUzunKelime.substring(0,1)).equals(enUzunKelime.toLowerCase().substring(0,1)))
            ilkHarfYeni=((char) (enUzunKelime.substring(0,1).toUpperCase()

        if (enUzunKelime.substring(0,1)==enUzunKelime.toLowerCase().substring(0,1))

        enUzunKelime.charAt(0)
        char[] enuzununHarfDizi=new char[enUzunKelime.length()];
        for (int j = 0; j < enuzununHarfDizi.length; j++) {
            char[j]=enUzunKelime.indexOf(j);
        }
        */

