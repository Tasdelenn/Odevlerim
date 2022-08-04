package Odevlerim.IsmetHocadan.Odevlerim_21;

public class _10_Method {
    //10-**isUnique** adında bir method oluşturun. Parametre olarak int array alır.
    //ve bu dizideki değerlerin benzersiz olup olmadığını gösteren bir boolean değeri döndürür (benzerlik yoksa true, var ise false).
    //örneğin, list isminde bir array'imiz varsa,
    //int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
    //Bu listede yinelenen eleman olmadığı için sonuç true dönmelidir.
    //int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
    //Bu listede eleman 3, iki tane olduğu için sonuç false dönmelidir.

    public static void main(String[] args) {
        
        int[] sayi_dizi={123,456,789,908,7655,43,321,2};
        reverse(sayi_dizi);

        for (int i:reverse(sayi_dizi)
             ) {
            System.out.println(i);

        }







    }

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }
/**
    public static ArrayList<Integer>[] isUnique(ArrayList<Integer>[] array_Params){

        String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};

        int[] my_arrayInt = {12, 234, 4344, 0, 5, 89};
        int[] array_Params= new int[my_arrayInt.length];


        for (int i = 0; i < array_Params.length; i++) {
            array_Params[i]=my_arrayInt[i];

        }



        for (int i = 0; i < array_Params.length-1; i++) {
            for (int j = i+1; j < array_Params.length; j++) {
                if(array_Params[i].equals(array_Params[j])){
                    System.out.println(" " + array_Params[i]);

                }
            }
        }

        return array_Params;



    }
*/

}
