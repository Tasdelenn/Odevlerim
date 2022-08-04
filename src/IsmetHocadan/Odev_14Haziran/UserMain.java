package Odevlerim.IsmetHocadan.Odev_14Haziran;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

    public static void main(String[] args) {

        //Scanner oku = new Scanner(System.in);
        //System.out.println("Kullanıcı Adı: ");


        //User yeni1 = new User(1,"hakan","123456pass", false,false);
        //User yeni2 = new User(2,"ali","2468021",false,false);

        ArrayList <User> users = new ArrayList<>();

        User yeni1 = new User(1, "hakan","1234554",false,false,userRole.ADMIN);
        User yeni2 = new User(2,"mehmet","24680987",false,false,userRole.OGRENCI);

        users.add(yeni1);
        users.add(yeni2);

        System.out.println("users = " + yeni1.toString());



    }
}
