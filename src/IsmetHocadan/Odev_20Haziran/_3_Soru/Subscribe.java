package Odevlerim.IsmetHocadan.Odev_20Haziran._3_Soru;
public class Subscribe {
    private String aboneName;
    private boolean aboneOlmakIstermisin;
    private MemberShip hangiUyelik; // Üyeliğin String değil de enum olması
                                    // daha mantıklı geldi...
    public Subscribe(String aboneName, boolean aboneOlmakIstermisin, MemberShip hangiUyelik) {
        setAboneName(aboneName);
        setAboneOlmakIstermisin(aboneOlmakIstermisin);
        setHangiUyelik(hangiUyelik);
    }
    public String getAboneName() {
        return aboneName;
    }
    public void setAboneName(String aboneName) {
        this.aboneName = aboneName;
    }
    public boolean isAboneOlmakIstermisin() {
        return aboneOlmakIstermisin;
    }
    public void setAboneOlmakIstermisin(boolean aboneOlmakIstermisin) {
        this.aboneOlmakIstermisin=aboneOlmakIstermisin;
    }
    public MemberShip getHangiUyelik() {
        return hangiUyelik;
    }
    public void setHangiUyelik(MemberShip hangiUyelik) {
        this.hangiUyelik = hangiUyelik;
    }
    @Override
    public String toString() {
        return  "Name is " + aboneName +
                ", Abone Olmak Ister misin? = " + aboneOlmakIstermisin +
                ", Uyeliginiz = " + hangiUyelik;
    }
}
