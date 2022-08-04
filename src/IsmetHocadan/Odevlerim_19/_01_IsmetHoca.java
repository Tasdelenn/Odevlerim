package Odevlerim.IsmetHocadan.Odevlerim_19;

import java.util.Arrays;
import java.util.Scanner;

public class _01_IsmetHoca {
    //1- 4 elemanlı bir dizi tanımlayınız değerlei kullanıcan alınız.
    // Dizideki en küçük ve enbüyük elemanlar arasındaki farkı bulunuz.
    public static void main(String[] args) {
        int[] dizi = new int[4];
        Scanner oku = new Scanner(System.in);

        int enb = dizi[0];
        for (int i = 0; i < dizi.length; i++)   {
            System.out.print((i + 1) + ". Sayıyı Giriniz =");
            dizi[i] = oku.nextInt();
            if (enb<dizi[i])
                enb=dizi[i];                    }

        int enk=dizi[0];
        for (int j : dizi)  {        //  for (int i = 0; i < dizi.length; i++) {   //NORMALDE BÖYLE YAZMIŞTIM
            if (enk > j)             //  if (enk>dizi[i])                          //İNTELLİJ YANDAKİ GİBİ ÖNERDİ
                enk = j;    }        //  enk=dizi[i];                              //DAHA SADE OLDU...

            System.out.println("Oluşan Dizi = " + Arrays.toString(dizi));
            System.out.println("enb = " + enb + "\nenk = " + enk);
            System.out.print("En büyük ve en küçük arasındaki fark  = " + (enb - enk));
        }
    }

