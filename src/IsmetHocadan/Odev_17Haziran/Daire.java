package Odevlerim.IsmetHocadan.Odev_17Haziran;

public class Daire implements ISekil{


    @Override
    public double alan(double... diziInt) {
        double alanC = Math.PI * diziInt[0] * diziInt[0];

        return ((int)alanC);
    }

    @Override
    public double cevre(double... diziInt) {
        double cevreC = Math.PI * 2  * diziInt[0];

        return ((int)cevreC);
    }
}
