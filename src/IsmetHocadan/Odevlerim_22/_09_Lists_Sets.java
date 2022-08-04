package Odevlerim.IsmetHocadan.Odevlerim_22;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 9-rangeBtw() isminde bir method oluşturun.Parametre olarak   bir Arraylist  ve iki ayrı int
 * return tipi int Arraylist'in iki int arasında kaç değeri olduğunu sayın.
 * return  count (sayacı (count) döndürün.)
 * Example (Örnek):
 * ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
 * min = 20  * max = 30  * return =  5    (20,22,25,28,30)
 * min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
 */

public class _09_Lists_Sets {

    public static int rangeBtw(ArrayList<Integer> arrList, int min, int max) {
/** public static ArrayList<Integer> rangeBtw(ArrayList<Integer> arrList, int min, int max) {          */

            /** ArrayList<Integer> arrListNew = new ArrayList<>(); */

        int count = 0;
        for (int i = 0; i < arrList.size(); i++) {
            if
            (min <= arrList.get(i) && arrList.get(i) <= max)
                /** arrListNew.add(arrList.get(i)); İSTERSEK LİSTEYİ BU ŞEKİLDE YAZDIRABİLİRİZ...*/
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

            Scanner oku=new Scanner(System.in);
            System.out.print("Dizi kaç elemanlı olacak? = ");
            int elSay= oku.nextInt();

            ArrayList<Integer> arrLst = new ArrayList<>();

            for (int i = 0; i < elSay; i++) {
                System.out.print((i+1) + ". Eleman = ");
                arrLst.add(oku.nextInt());
            }

            System.out.println("Girilen Dizi = " + arrLst);  //KONTROL NOKTASI

        System.out.print("İstediğiniz Aralığın Alt Sınır Elemanını Giriniz = ");
        int alt = oku.nextInt();
        System.out.print("İstediğiniz Aralığın Üst Sınır Elemanını Giriniz = ");
        int ust = oku.nextInt();

        System.out.println("İstenilen Aralık = " + rangeBtw(arrLst,alt,ust));
    }
}
