package Odevlerim.HalitHocadanOdevler._02_.Ozel2;

/**
 * 5- {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}
 * int 2D arrayini oluşturunuz.
 * 2D arrayinden max number print ediniz.
 */

public class Q5_DizidekiMaxEleman {

    public static void main(String[] args) {

        //int[][] arr2D = new int[4][3];
        int[][] arr2D = {{1,2,3} , {2,3,1} , {5,5,5} , {2,10,3}};
        //              {{0r0c,0r1c,0r2c} , {1r0c,1r1c,1r2c} , {2r0c,2r1c,2r2c} , {3r0c,3r1c,3r2c}}


        int mx = arr2D[0][0];
        for (int i = 0; i < arr2D.length; i++) {  // 4 : SATIR
            for (int j = 0; j < arr2D[i].length; j++) {   // 3 : SÜTUN

                if (arr2D[i][j]>mx)
                    mx=arr2D[i][j];
            }
        }
        System.out.println("yöntem FOR, IF max Eleman = " + mx);


        //int mx = arr2D[0][0];
        for (int[] ints : arr2D) {      // FOREACH
            for (int j = 0; j < arr2D[0].length; j++) {     //FORİ
                mx = Math.max(ints[j], mx);
            }
        }
        System.out.println("yöntem FOR, MATH max Eleman = " + mx);
    }
}

