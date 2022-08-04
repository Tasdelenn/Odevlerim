package Odevlerim.IsmetHocadan.Odevlerim_21;

import java.util.Arrays;

public class _09_Method {
    //9-Write a method called `append`
    //`append adında bir method oluşturun.`
    //`Parametre olarak iki int array  oluşturun.`
    // ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
    // Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
    //Bunu döndürmelidir:
    // {2, 4, 6, 1, 2, 3, 4, 5}.

    public static void main(String[] args) {

        int[] array1= {2,4,6};
        int[] array2= {1,2,3,4,5};

        append(array1,array2);
    }
    public static  String append(int[] array1, int[] array2){

        int[] arrayBirles= new int[array1.length+ array2.length];

        for (int i = 0; i < array1.length; i++) {
            arrayBirles[i] = array1[i];

            for (int j = array1.length; j < arrayBirles.length; j++)
                arrayBirles[j]= array2[j- array1.length];
        }

        for (int k = 0; k < arrayBirles.length; k++)  //KONTROL NOKTASI
            System.out.print(" " + arrayBirles[k]);

        return Arrays.toString(arrayBirles);
    }
}
