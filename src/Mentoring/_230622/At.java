package Mentoring._230622;

public class At implements IDomestic{
    @Override
    public void livesIn() {
        System.out.println("Ahirda Yasar");
    }

    @Override
    public void walks() {
        System.out.println("Dort ayak ustunde yurur");
    }

    @Override
    public void eats() {
        System.out.println("Ot ve saman yer");
    }

    @Override
    public void name() {
        System.out.println("Isim verilir. Mesela Bold Pilot");
    }

    @Override
    public void takeCare() {
        System.out.println("Yemini suyunu ver. Arad bir timar et.");
    }

    public void sadeceAtaAit(){
        System.out.println("kisner");
    }
}
