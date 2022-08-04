package Odevlerim.IsmetHocadan.Odev_16Haziran;

public class Kisi {

    private String ad;
    private String soyAd;
    private String gorevi;

    public Kisi(String ad, String soyAd, String gorevi) {
        setAd(ad);
        setSoyAd(soyAd);
        setGorevi(gorevi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    @Override
    public String toString() {
        return "Kisi {" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", gorevi='" + gorevi + '\'' ;
    }
}