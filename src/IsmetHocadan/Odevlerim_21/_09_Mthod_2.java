package Odevlerim.IsmetHocadan.Odevlerim_21;

import java.util.Scanner;

public class _09_Mthod_2 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        System.out.print("1. dizi kaç elemanlı? :");  // 1. DİZİNİN GİRİŞİ YAPILIYOR
        int dizi1_uzunluk= oku.nextInt();
        int [] dizi1 = new int[dizi1_uzunluk];
        for (int i = 0; i < dizi1_uzunluk; i++) {
            System.out.print((i+1) + ". eleman = ");
            dizi1[i]= oku.nextInt();
        }
        for (int i = 0; i < dizi1_uzunluk; i++) {  // KONTROL
            System.out.print(" " + dizi1[i]);

        }

        Scanner oku2 =new Scanner(System.in);
        System.out.print("\n2. dizi kaç elemanlı? :");  // 2. DİZİNİN GİRİŞİ YAPILIYOR
        int dizi2_uzunluk= oku.nextInt();
        int [] dizi2 = new int[dizi1_uzunluk];
        for (int j = 0; j < dizi2_uzunluk; j++) {
            System.out.print((j+1) + ". eleman = ");
            dizi2[j]= oku.nextInt();
        }

        for (int j = 0; j < dizi2_uzunluk; j++) {  // KONTROL
                System.out.print(dizi2[j] + " ");
        }










        //arrayBirles(dizi1,dizi2);

        int[] birles=new int[dizi1_uzunluk+dizi2_uzunluk];

        for (int i = 0; i < dizi1_uzunluk; i++) {
            birles[i]=dizi1[i];

            for (int j = dizi1_uzunluk; j < dizi1_uzunluk+dizi2_uzunluk; j++) {
                birles[j]=dizi2[j-dizi1_uzunluk];
            }
        }

        for (int k = 0; k < birles.length; k++) {
            System.out.println(birles[k] + " ");

        }


    }

}
