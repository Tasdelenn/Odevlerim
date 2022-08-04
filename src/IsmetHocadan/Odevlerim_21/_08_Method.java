package Odevlerim.IsmetHocadan.Odevlerim_21;

import java.util.Scanner;

public class _08_Method {
    //8-powerOfThree isminde bir method oluşturun.Parametre olarak int Return tipi boolean  Bir tamsayı verildiğinde,
    //3 ün üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
    //**Örnek 1:** ```    //**Girdi:** 27    //**Çıktı:** true     //Açıklama: 3*3*3 =27    //Sonuç= true
    //**Örnek 2:** ```    //**Girdi:** 0     //**Çıktı:** false
    //**Örnek 3:**```    //**Girdi:** 9      //**Çıktı:** true

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Lütfen 3 'ten Büyük Bir Sayı Giriniz = ");
        int okunanSayi = oku.nextInt();

        System.out.println("Girilen Sayı Üçün Üssü Mü? :  " + powerOfThree(okunanSayi));

    }
    public static boolean powerOfThree(int parametre) {

        if (parametre<3)
            System.out.println("Lütfen 3 ten büyük bir sayı giriniz = ");

        do {
            parametre = parametre / 3;
        } while (parametre % 3 == 0 && parametre != 1);

        if (parametre==1)
            return true;
        else return false;
    }
}
