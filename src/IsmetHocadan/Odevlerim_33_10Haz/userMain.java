package Odevlerim.IsmetHocadan.Odevlerim_33_10Haz;

import java.util.ArrayList;

public class userMain {

    public static void main(String[] args) {

        // /**ARRAY LIST I BURADA TANIMLAYACAĞIM SORUNUN 5. ADIMI */
        ArrayList<User> userList = new ArrayList<>();

        User user10 = new User("hakan","1234567",false,true,userRole.ADMIN);
        System.out.println(user10.toString());
        User user20 = new User("ali","12345643",false,false,userRole.CALISAN);
        System.out.println(user20.toString());
        User user1 = new User();
        User user2 = new User();


/**
        Scanner input = new Scanner(System.in);

            System.out.println("Kullanıcı Adı Giriniz: ");
            user1.setUsername(input.next());

            do {
                System.out.println("Şifreyi Giriniz: ");
                if (input.next().length() < 6)
                    System.err.println("Şifre 6 karakterden az olamaz! Lütfen Tekrar Giriniz: ");

                else user1.setPassword(input.next());
            }while (user1.getPassword().length()<6);
            */










        /**

        User user1 = new User("hakan","1233456",false,false,userRole.CALISAN);
        System.out.println("user1.toString() = " + user1.toString());

        User user2 = new User("ali","212121213232",false,true,userRole.ADMIN);
        System.out.println(user2.toString());

         */














    }
}
