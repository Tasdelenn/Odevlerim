package Odevlerim.IsmetHocadan.Odev_21Haziran.OOP2_tekSoru;

public class Kisi {

    private String adSoyad;
    private String adres;
    private Tip kisiTipi;
    private Okul okul;

    public Kisi(String adSoyad, String adres, Tip kisiTipi, Okul okul) {
        this.adSoyad = adSoyad;
        this.adres = adres;
        this.kisiTipi = kisiTipi;
        this.okul = okul;
    }

    public Kisi() {
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Tip getKisiTipi() {
        return kisiTipi;
    }

    public void setKisiTipi(Tip kisiTipi) {
        this.kisiTipi = kisiTipi;
    }

    public Okul getOkul() {
        return okul;
    }

    public void setOkul(Okul okul) {
        this.okul = okul;
    }
    @Override
    public String toString() {
        return
                "adSoyad='" + adSoyad + '\'' +
                ", adres='" + adres + '\'' +
                ", kisiTipi=" + kisiTipi +
                ", okul=" + okul +
                '}';
    }
}
