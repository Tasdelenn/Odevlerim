package Odevlerim.IsmetHocadan.Odev_20Haziran._3_Soru;
public class AboneMain {
    public static void main(String[] args) {

        Subscribe abone1 = new Subscribe("Victoria",true,MemberShip.GOLD);

        abone1.setAboneOlmakIstermisin(true);
        abone1.setAboneName("Mehmet Ali");
        abone1.setHangiUyelik(MemberShip.SILVER);

        System.out.println("\n" + abone1.toString());

        if (!abone1.isAboneOlmakIstermisin())
            System.out.println("Uye olmak istediginiz zaman gorusmek uzere tesekkurler...");
        else if (abone1.getHangiUyelik()==MemberShip.GOLD)
            System.out.println("Welcome to membership " + abone1.getAboneName() +
                    ".\nYour membership is 40 dollar for month you can enjoy the videos ," +
                    " all homework and see you soon.");
        else if (abone1.getHangiUyelik()==MemberShip.SILVER)
            System.out.println("Welcome to membership " + abone1.getAboneName() +
                    ".\nYour membership is 20 dollar for month you can enjoy the videos and all homework.");
        else if (abone1.getHangiUyelik()==MemberShip.BRONZE)
            System.out.println("Welcome to membership " + abone1.getAboneName() +
                    ".\nYour membership is 10 dollar for month you can enjoy the videos.");
    }
}
