package Odevlerim.HalitHocadanOdevler._02_.Ozel2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2- String bir array verildiğinde;
 * Eger String Orange içeriyorsa bütün Orange leri Apple çeviriniz.
 * Örnek:
 * Array : Peach , Berry , Orange , WaterMelon , Orange
 * Result böyle olmalı --> : Peach , Berry , Apple , WaterMelon , Apple
 * Arrayi print ediniz.
 */

public class Q2_StringIceriyoMu {

    public static void main(String[] args) {

        ArrayList<String> fruitS = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Meyve Adı Giriniz: ");
            fruitS.add(input.next());
            System.out.print("Devam Etmek İstiyor musunuz? (E/H): ");
        }while (input.next().equalsIgnoreCase("e"));

        System.out.print("fruitS = " + fruitS);     // Kontrol Amaçlı

        for (int i = 0; i < fruitS.size(); i++) {
            if (fruitS.get(i).equalsIgnoreCase("Orange"))
                fruitS.set(i,"Apple");
        }

        System.out.println("\nYeni fruitS = " + fruitS);
    }
}
