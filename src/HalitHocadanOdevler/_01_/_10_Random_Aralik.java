package Odevlerim.HalitHocadanOdevler._01_;

import java.util.Scanner;

public class _10_Random_Aralik {
    //10- Girilen 2 sayı arasında Random integer sayı üreten programı yazınız.

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Aralığın min. değerini giriniz =");
        int minAralik= oku.nextInt();
        System.out.print("Şimdi de max. değerini giriniz =");
        int maxAralik= oku.nextInt();

        int aralikRandom= (int) (Math.random()* ( (maxAralik-minAralik) +1 ) )+minAralik;
        System.out.println(minAralik +" ve " + maxAralik + " arasında üretilen random sayı = " + aralikRandom);
    }
}
