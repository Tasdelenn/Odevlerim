package Odevlerim.HalitHocadanOdevler._02_.Ozel2;
/**
 * 10- String 2D array oluşturunuz.
 {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}
 String de $ varsa 3.2 ile çarpın >> KUR 17.5 ile çarptım...
 String de € varsa 4.2 ile çarpın >> KUR 18.5 ile çarptım...
 double return ediniz.
 */
public class Q10_Dolar_Euro {
    public static void main(String[] args) {

        String[][] tabloDoviz = {
                {"$12" , "$22" , "5$","0"},
                {"€9" , "€40" , "$1" , "$2"},
                {"€12","0","0","0"}
        };
        System.out.println("cevirDoviz(tabloDoviz) = " + cevirDoviz(tabloDoviz));
    }
    public static double cevirDoviz(String[][] tablo){

        double[][] tabloInt= new double[3][4];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 4; j++) {
                    if (tablo[i][j].contains("$"))
                    tabloInt[i][j] = 17.5 * Float.parseFloat(tablo[i][j].replace("$", ""));
                    else if (tablo[i][j].contains("€"))
                            tabloInt[i][j] = 18.5 * Float.parseFloat(tablo[i][j].replace("€", ""));
            }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(i + "," + j + " = " + tabloInt[i][j]);
            }
        }
        return tabloInt[0][0];
    }
}

/** AŞAĞIDAKİ CONTİNİUE ESPRİSİNİ $ VE eur İÇİN KULLANABİLİRİZ BELKİ DİYE AKLIMA GELDİ...16.GÜNDE
 *  // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
 *         // şekilde yazdırınız, boşlukları yazmasın.
 *
 *         Scanner oku=new Scanner(System.in);
 *         System.out.print("Bir cümle giriniz = ");
 *         String cumle=oku.nextLine();
 *
 *         for(int i=0; i < cumle.length(); i++){
 *
 *             //bir karakter karşılaştırıyorsanız tek tırnak, birden fazla karakter olacaksa çift tırnak
 *             if (cumle.charAt(i) ==' ' ) continue;  // boşluk geldiğinde continue çalışır ve sonrakler pas geçilir, döngü devam eder
 *
 *             System.out.println(cumle.charAt(i));
 *         }
 */
