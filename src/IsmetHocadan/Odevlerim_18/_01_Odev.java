package Odevlerim.IsmetHocadan.Odevlerim_18_;

public class _01_Odev {

    //1. String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
    //        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
    //        Eğer aitse "true" çevirin.
    public static void main(String[] args) {

        String[] arrayFruits= {"Apple", "Orange", "Banana", "Pineapple"};

        String s1="Apple";
            for (int i = 0; i < arrayFruits.length; i++) {
                // if (s1.equals(arrayFruits[i]) )
                // System.out.println(arrayFruits[i] + " Dizinin "+ i + ".index elemanıdır");
                if (arrayFruits[i].contains("Apple"))
                    System.out.println(arrayFruits[i].contains("Apple"));
        }
    }
}
