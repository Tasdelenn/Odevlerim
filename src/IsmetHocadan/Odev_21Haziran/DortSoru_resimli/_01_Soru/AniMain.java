package Odevlerim.IsmetHocadan.Odev_21Haziran.DortSoru_resimli._01_Soru;

public class AniMain {
    public static void main(String[] args) {

        Swallow kirlangic1 = new Swallow();
        System.out.println(kirlangic1.toString());


        System.out.println("---------------------");

        Cat cat1 = new Cat();
        System.out.println(cat1.food());
        System.out.println(cat1.tirmaladi());

        System.out.println("---------------------");



        Duck ordek1 = new Duck();

        System.out.println(ordek1.food());
        System.out.println(ordek1.uctu());
        System.out.println(ordek1.yuzdu());


    }
}
