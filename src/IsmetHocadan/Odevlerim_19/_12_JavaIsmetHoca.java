package Odevlerim.IsmetHocadan.Odevlerim_19;
import java.util.Scanner;
public class _12_JavaIsmetHoca {
    public static void main(String[] args) {
        //2- 2x3 lük String bir tablo tanımlayınız, kullanıcıdan $22 veya $65  şeklinde
        // para simgesi ve rakam olan değerlerle doldurunuz.
        // sonrasında bütün RAKAMLARI toplayıp ö toplam para değerini bulunuz.

        String[][] tabloStr=new String[2][3];

        Scanner oku=new Scanner(System.in);

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print(i + " x " + j + " Değerini Giriniz ($1234) = ");
                tabloStr[i][j]=oku.next();
            }

        int[][] tabloInt= new int[2][3];
        int topla=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                tabloInt[i][j] = Integer.parseInt(tabloStr[i][j].replace("$", ""));
                topla=topla+tabloInt[i][j];
            }
        }
        System.out.println("TOPLAM = " + topla + " $");
    }
}
