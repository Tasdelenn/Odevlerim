package Odevlerim.IsmetHocadan.Odevlerim_21;

import java.util.Scanner;

public class _04_Method {
    //4- adı  reverseWord olan bir method oluşturun Bu methodun String olarak bir parametresi olmalıdır
    //Ve bu cümledeki kelimelerle tersine çevirmeli Ters halini yazdırın.
    //Örnek 1 :Dize: Java yazın dönüş şöyle olmalıdır:  yazın Java
    //Örnek 2:Dize: Sakin olun ve evde kalın dönüş olmalı: kalın evde ve olun sakin

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Bir cümle giriniz : ");
        String cumle=oku.nextLine();

        reverseWord(cumle);
       // System.out.println(reverseWord(cumle) + "\n(Tersten Cümle)");
//        int boslukS=cumle.length()-cumle.replaceAll(" ","").length();
//        //cümle uzunluğundan boşlukSUZları çıkarırsak, boşluk sayısını buluruz.
//        //Kelime sayısı da boşluk+1 dir.
//
//        String[] dize=cumle.split(" "); // Kelimeler dizisi oluşturdum.
//        String[] tersi=new String[(boslukS+1)];
//
//
//        for (int i = 0; i < boslukS+1; i++) {
//        //    System.out.println(dize[boslukS-i]); //KONTROL
//            tersi[i]=dize[boslukS-i];
//        }

        // System.out.println("Arrays.toString(tersi) = " + Arrays.toString(tersi)); // KONTROL
    }

    public static void reverseWord(String rev){
        
        int boslukS=rev.length()-rev.replaceAll(" ","").length();
        //cümle uzunluğundan boşlukSUZları çıkarırsak, boşluk sayısını buluruz.
        //Kelime sayısı da boşluk+1 dir.

        String[] dize=rev.split(" "); // Kelimeler dizesi oluşturdum.

        for (int i = 0; i < boslukS+1; i++)
                System.out.print(dize[boslukS-i] + " ");
    }
}
