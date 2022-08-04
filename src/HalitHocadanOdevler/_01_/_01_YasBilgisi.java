package Odevlerim.HalitHocadanOdevler._01_;

import java.util.Scanner;

public class _01_YasBilgisi {
   //   1-  Kullanıcıdan yaş bilgisini isteyiniz
   //       Eğer yaş 10 dan küçük veya eşit ise   "facebook hesabi acmak icin cok gencsin" şeklinde yazdırın
   //       Eğer yaş 16 dan küçük veya eşit ise   "ehliyet almak icin cok gencsin" şeklinde yazdırın
   //       Eğer yaş 18 den küçük veya eşit ise   "dovme yaptirmak icin cok gencsin" şeklinde yazdırın
   //       Eğer yaş 21 den küçük veya eşit ise   "alkol icmek icin cok gencsin" şeklinde yazdırın
   //       Eğer yaş 21 den büyük ise             "istediğini yapabilirsin" şeklinde yazdırın

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Lüfen Yaşınızı Giriniz = ");
        int yas= oku.nextInt();

/*        if (yas <= 10)
            System.out.println("facebook hesabi acmak icin cok gencsin");
        if (yas <=16)
            System.out.println("ehliyet almak icin cok gencsin");
        if (yas <= 18)
            System.out.println("dovme yaptirmak icin cok gencsin");
        if (yas <= 21)
            System.out.println("alkol icmek icin cok gencsin");
        else System.out.println("istediğini yapabilirsin");
*/

        if (yas > 21)
            System.out.println("istediğini yapabilirsin");
        else
            if (yas > 18)
                System.out.println("alkol icmek icin cok gencsin");
            else
                if (yas > 16)
                    System.out.println("dovme yaptirmak icin cok gencsin");
                else
                    if (yas > 10)
                        System.out.println("ehliyet almak icin cok gencsin");
                    else
                        System.out.println("facebook hesabi acmak icin cok gencsin");

    }
}
