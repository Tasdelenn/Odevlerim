package Odevlerim.IsmetHocadan.Odev_21Haziran.OOP2_tekSoru;
public class Calisan extends Kisi{
    private int maas;
    private int calId;
    private static int calSayac =0;
    public Calisan(String adSoyad, String adres, Tip kisiTipi, Okul okul, int maas)
    {
        super(adSoyad, adres, kisiTipi, okul);
        setMaas(maas);
        setCalId(++calSayac + getOkul().getKapasite());
        // ÇALIŞAN ID Yİ, OKULUN ÖĞRENCİ KAPASİTESİNDEN İTİBAREN BAŞLATTIM...
    }

    public void setCalId(int calId) {  this.calId = calId; }
    public void setMaas(int maas) { this.maas = maas; }
    @Override
    public String toString() {
        return "\nCalisan{" +
                "maas=" + maas +
                ", calID=" + calId +
                ", " + super.toString() +
                '}';
    }
}
