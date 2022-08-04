package Odevlerim.IsmetHocadan.Odevlerim_21;

import java.util.Scanner;

public class _06_Method {

    //6- EvenOddNums isminde bir method oluşturun. Bu yöntem String olan bir parametreyi kabul etsin.
    //Bu String'de 1234567890 gibi 10 haneli sayılar olacak.Sayıların her basamağını alın
    //ve basamak çiftse toplayın, tekse çıkartın. toplam sonucu yazdırın.
    //**İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.**
    //For example Örnek:
    //String =  "6678421312"
    //6+6-7+8+4+2-1-3-1+2
    //sonuç 16 olmalı

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz = ");
        String sayi= oku.nextLine();

        evenOddNums(sayi);

        //String sayilar = "1234567890";
        //evenOddNums(sayilar);
    }

    public static void evenOddNums(String parametre){

        String[] rakamlar =parametre.split("");

        int toplam=0;
        int sayi;
        for (int i = 0; i < rakamlar.length; i++) {
            sayi=Integer.parseInt(rakamlar[i]);

            if (sayi %2 ==0)
                toplam+=sayi;
            else toplam-=sayi;
        }

        // return toplam; void olduğu için bişey döndürmüycek.. sadece verilen stringi böl sayıya çevir topla diyo
        // emir veriyo... emirleri return edemiyoruz....
        System.out.println("Basamak Rakamları İşlem Sonucu = " + toplam);
    }
}
