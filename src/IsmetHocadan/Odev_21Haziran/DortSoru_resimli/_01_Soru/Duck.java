package Odevlerim.IsmetHocadan.Odev_21Haziran.DortSoru_resimli._01_Soru;

public class Duck implements ISailing,IFlying{
    @Override
    public String food() {
        return "gagalayarak yedi";
    }

    @Override
    public String uctu() {
        return "sazliktan havalandı";
    }

    @Override
    public String yuzdu() {
        return "suya başını daldırdı";
    }
}
