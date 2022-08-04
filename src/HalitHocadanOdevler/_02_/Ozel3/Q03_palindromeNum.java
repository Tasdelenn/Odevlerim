package Odevlerim.HalitHocadanOdevler._02_.Ozel3;

import java.util.Scanner;

/**
3- Parametresi bir tane int (num1) ve return tipi int olan palindromeNum isminde method
 verilmiştir.
 Palindrome, bir kelime veya sayının, tıpkı ileri ile aynı şekilde geriye doğru okuduğu anlamına
 gelir. Örneğin; "mom" , "refer" , "131" , "1221".
 num1'i ve num1'in tersini ekleyin, sonucu bulun.
 Sonucun palindrom olup olmadığını kontrol edin.
 Sonuç bir palindrom numarası değilse, sonucun tersini bulun.
 Ve sonucu ve sonucun tersine ekleyin, yeni toplamı bulun.
 Yeni toplamın bir palindrom olup olmadığını kontrol edin.
 Sonuçlarınızda bir palindrom numarasına ulaşana kadar aynı adımları uygulayın.
 Palindrom numarasına ulaştıktan sonra, bir palindrome numarasına ulaşmak için aynı işlemi kaç
 kez yaptığınızı bulun.
 Return count olmali
 Örnek:
 num1 = 349 --> 349 + 943 =1292 Not : 1292 palindrom olmadığından bunun için aynı
 adımı uygulayın (birinci işlem)
 1292 + 2921 = 4213 Not : 4213 palindrom değil bunun için aynı adımı yapın
 (ikinci işlem)
 4213 + 3124 = 7337 Not : 7337 palindrome (üçüncü işlemde palindroma
 ulaştınız ve count 3 olur)
 return 3 olmalı
 İPUCU: Bu soru için while loop kullanırsanız iyi olur
 */

public class Q03_palindromeNum {

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz =");
        int num1 = oku.nextInt();

        int tersDuzTopl = num1 + ters(num1);
        int sayac = 1;

        if (tersDuzTopl == ters(tersDuzTopl))
        System.out.println(tersDuzTopl + " Palindromdur");
        else{
            while (tersDuzTopl != ters(tersDuzTopl)){
                tersDuzTopl = tersDuzTopl + ters(tersDuzTopl);
                sayac++;
            }
        }

        System.out.println(tersDuzTopl + " palindromuna " + sayac + " hamlede ulaşıldı.");

    }
    public static int ters(int num1) {  //METHODUN NE KADAR GEREKLİ OLDUĞUNU BU SORUDA
                                        //ÇOK İYİ ANLAMIŞ OLDUM...

        int tersSayi = 0;

        while (num1 > 0) {
            tersSayi = tersSayi * 10 + num1 % 10;   // ters sayı sağdan değer almaya başladı
                                                    // -> 6 >>6*10+5 >>65*10+4 >>654*10+3 gbi.
            num1 = num1 / 10;   // sayı ona bölünürken basamaklar birler basamağına taşınıyor
                                // -> 3456 >>345 >>34 >>3 gibi.
        }
        return tersSayi;
    }
}
