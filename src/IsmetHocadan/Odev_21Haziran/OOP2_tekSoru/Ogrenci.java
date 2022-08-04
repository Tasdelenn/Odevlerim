package Odevlerim.IsmetHocadan.Odev_21Haziran.OOP2_tekSoru;
public class Ogrenci extends Kisi {
    private int ucret;
    private int id;
    private static int sayac =0;
    public Ogrenci(String adSoyad, String adres, Tip kisiTipi, Okul okul,int ucret )
    {
        super(adSoyad, adres, kisiTipi, okul);
        setUcret(ucret);
        if (id < getOkul().getKapasite())
        setId(++sayac);
        else System.out.println("kapasite doldu");
    }

    public int getId() { return id; }
    public void setId(int id) {  this.id = id; }
    public void setUcret(int ucret) {
        this.ucret = ucret;
    }
    @Override
    public String toString() {
        return "\nOgrenci{" +
                "ucret=" + ucret +
                ", id=" + id +
                ", "    + super.toString() +
                '}';
    }
}
