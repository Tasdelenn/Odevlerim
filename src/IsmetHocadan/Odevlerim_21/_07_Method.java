package Odevlerim.IsmetHocadan.Odevlerim_21;

import java.util.Scanner;

public class _07_Method {

    //7-addDigits isminde bir method oluşturun.
    //Parametresi int,
    //Return tipi de int Pozitif int değerler ver
    //ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.Tek basamaklı çıktığında, döndürün
    //**Örnek1:**
    //```
    //**Girdi** `38`
    //**Çıktı:** 2
    //**Açıklama: İşlemler şöyle olacak**: `3 + 8 = 11`, `1 + 1 = 2`.
    //             2 , tek basamaklı olduğundan, bunu döndürün.
    //```

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir değer giriniz = ");

        System.out.println("Tek Haneli Olana Kadar Basamaklar Toplamı = " + addDigits(oku.nextInt()) );

    }

    public static int addDigits(int parametre){

        int basamakT = parametre %10;
        do {
            parametre = parametre /10;
            basamakT = basamakT + parametre %10;

            if (basamakT > 9)
                basamakT = basamakT %10+ (basamakT /10 %10)+ (basamakT /100 %10);  // birlerBs + onlarBs +yuzlerBs

            /**
             Basamak sayısı ilk seferinde tek haneliye düşmezse,
             en fazla 3 haneli sonuç çıkar... Bunun için, ek bir bloğa daha
             (ya yukarıdaki if bloğuna ya da aşağıdaki  //do while 'a)
             ihtiyaç duydum... ikisinden biri basamak toplamını tek haneye indirir...
             **/

            //do{
            //    basamakT = basamakT %10+ (basamakT /10 %10)+ (basamakT /100 %10);  // birlerBs + onlarBs +yuzlerBs
            //}while (basamakT>9);

        }while (parametre > 0);

        // System.out.println("Tek Haneli Olana Kadar Basamaklar Toplamı = " + basamakT);  // KONTROL AMAÇLI

        return basamakT;
    }
}





