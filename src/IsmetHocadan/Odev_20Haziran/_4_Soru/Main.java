package Odevlerim.IsmetHocadan.Odev_20Haziran._4_Soru;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        rentApartments room1 = new rentApartments();

        System.out.println("Adınız nedir? ");
        room1.setName(oku.nextLine());

        System.out.println(
                "room tipini seçiniz : " +
                " \n0 ... 1400 $" +
                " \n1 ... 1700 $" +
                " \n2 ... 2200 $" +
                " \n3 ... 2700 $");

        int secim = oku.nextInt();
        room1.setRoomCount(secim);

        System.out.println("Balkon olacak mı? (true / false) ");
        boolean balkonVarMi = oku.nextBoolean();
        room1.setBalconyOrNo(balkonVarMi);

        System.out.println(room1.getName() + " rent is " +
                ( rent(secim) + balkonluMu(balkonVarMi) ) +
                " $");
    }
    public static int rent(int formalSecim)
    {
        int kira =0;

        switch (formalSecim)
        {
            case 0: kira = 1400; break;
            case 1: kira = 1700; break;
            case 2: kira = 2200; break;
            case 3: kira = 2700; break;
            default: System.out.println("gecerli giris yapmadiniz");
        }
        return kira;
    }

    public static int balkonluMu(boolean formalBoo)
    {

        if (formalBoo)
            return 200;
        else
            return 0;
    }
}