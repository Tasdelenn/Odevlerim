package Odevlerim.IsmetHocadan.Odev_21Haziran.OOP2_tekSoru;

public class Okul {
    private  String okulIsim;
    private  int kapasite;

    public Okul(String okulIsim, int kapasite) {
        this.okulIsim = okulIsim;
        this.kapasite = kapasite;
    }

    public String getOkulIsim() {
        return okulIsim;
    }

    public void setOkulIsim(String okulIsim) {
        this.okulIsim = okulIsim;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

    @Override
    public String toString() {
        return
                okulIsim + '\'' +
                ", kapasite=" + kapasite +
                '}';
    }
}
