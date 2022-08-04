package Odevlerim.IsmetHocadan.Odevlerim_22;

import java.util.ArrayList;

/**
 * 10-Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
 * Store all the elements in one arraylist and print the arraylist
 * Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
 * Örnek:
 * **Girdi:**
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 * **Çıktı:** [1,2,3,4,5,6,7,8,9]
 */

public class _10_Lists_Sets {
    public static void main(String[] args) {

        int [][] array2D = {{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> arrlist = new ArrayList<>();

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[0].length; j++) {
                arrlist.add(array2D[i][j]);
            }
        }

        System.out.println("arrlist = " + arrlist);
    }
}
