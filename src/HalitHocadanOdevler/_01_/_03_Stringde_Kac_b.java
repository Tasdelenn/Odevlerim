package Odevlerim.HalitHocadanOdevler._01_;

import java.util.Scanner;

public class _03_Stringde_Kac_b {
    //3- Girilen bir string de kaç tane b harfi olduğunu yazdırınız.

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Lütfen bir parça yazı giriniz : ");
        String girilenString= oku.nextLine();
        girilenString=girilenString.toLowerCase();  // 'b' karakteri demediği için (harfi dediği için)
                                                    // , 'B' leri de dahil ettim. Hepsi "b" ye dönüştü...

        int adet=0;
        for (int i = 0; i < girilenString.length(); i++)
            if (girilenString.charAt(i)=='b')
                adet++;

        System.out.println("Girdiğiniz parçada, " + adet + " adet b(B) harfi var.");
    }
}
