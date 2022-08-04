package Odevlerim.IsmetHocadan.Odev_17Haziran;

public class Dikdortgen implements ISekil{

    @Override
    public double alan(double... diziInt) {

        if (diziInt.length == 1){
            return (diziInt[0] * diziInt[0]);   // KARE İÇİN AYRI METHODA GEREK YOK.
                                                // DİKDÖRTGENİN İÇİNDE HALLEDİLEBİLİR.
        }

        double alanD = diziInt[0] * diziInt[1];
        //dizi iki elemanlı;
        //index0=kısa kenar, index1=uzun kenar
        //

        return alanD;
    }

    @Override
    public double cevre(double... diziInt) {

        if (diziInt.length == 1){
            return (4 * diziInt[0]);    // KARE ZATEN DİKDÖRTGENDEN EXTEND OLDUĞU İÇİN
                                        // kare.cevre DİREKT BURAYA BAKACAK.
        }

        double cevreD = 2* (diziInt[0] + diziInt[1]);

        return cevreD;
    }
}
