package Odevlerim.HalitHocadanOdevler._02_.Ozel2;

/**
 * 6- {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}
 * int 2D arrayini oluşturunuz.
 * 2D arrayinden min number print ediniz.
 */

public class Q6_DizidekiMinEleman {
    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 1, 3}};

        int mn = arr2D[0][0];
        for (int[] ints : arr2D) {
            for (int j = 0; j < arr2D[j].length; j++)
                mn = Math.min(ints[j], mn);
        }

        System.out.println("Tablonun minimum elemanı = " + mn);
    }
}
