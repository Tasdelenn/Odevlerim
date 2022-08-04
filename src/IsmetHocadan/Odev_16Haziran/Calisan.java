package Odevlerim.IsmetHocadan.Odev_16Haziran;

public class Calisan extends Kisi {

    // String ad;
    // String soyAd;
    // String gorevi;

    private String departmani;

    public Calisan(String ad, String soyAd, String gorevi,String departmani) {
        super(ad, soyAd, gorevi);
        setDepartmani(departmani);
    }

    public String getDepartmani() {
        return departmani;
    }

    public void setDepartmani(String departmani) {
        this.departmani = departmani;
    }

    @Override
    public String toString() {
        return super.toString() +
                " , departmani='" + departmani + '\'' +
                '}';
    }
}