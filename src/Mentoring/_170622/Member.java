package Mentoring._170622;

import java.util.Scanner;

public class Member {
    private String ad;
    private String soyad;
    private int aylikGelir;
    private Sinif sinif;

    public Member(String ad, String soyad, int aylikGelir) {
        setAd(ad);
        this.soyad = soyad;
        this.aylikGelir = aylikGelir;
        setSinif(aylikGelir);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        Scanner scanner=new Scanner(System.in);
        boolean uygunMu=false;
        do {
            if (ad.length()<2){
                System.out.println("ad en az 2 harften olusmali\n Yeni isim girin");
                ad=scanner.nextLine();
            }else {
                uygunMu=true;
            }
        }while (!uygunMu);

      this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getAylikGelir() {
        return aylikGelir;
    }

    public void setAylikGelir(int aylikGelir) {
        this.aylikGelir = aylikGelir;
    }

    public Sinif getSinif() {
        return sinif;
    }

    public void setSinif(int aylikGelir) {
        if (aylikGelir<20000){
            this.sinif=Sinif.FAKFAKIR;
        }else if (aylikGelir<70000){
            this.sinif=Sinif.FAKIR;
        }else if (aylikGelir<150000){
            this.sinif=Sinif.ORTADIREK;
        }else {
            this.sinif=Sinif.ZENGIN;
        }
    }

    @Override
    public String toString() {
        return "Member{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", aylikGelir=" + aylikGelir +
                ", sinif=" + sinif +
                '}';
    }
}
