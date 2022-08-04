package Mentoring._230622;

public class AnimalMain {
    public static void main(String[] args) {
        At at1=new At();
        at1.livesIn();
        at1.walks();
        at1.name();
        at1.eats();
        at1.takeCare();
        System.out.println("----------------------");
        IDomestic at2=new At();
        at2.name();
        at2.livesIn();
        at2.walks();
        at2.eats();
        at2.takeCare();
        ((At)at2).sadeceAtaAit();
        System.out.println("----------------------");
        IAnimal kartal=new Kartal();
        kartal.eats();
        kartal.livesIn();
        kartal.walks();

        ((IWild)kartal).hunts();
        ((IWild)kartal).friendlyToHumans();

        ((Kartal)kartal).sadeceKartalaAit();

    }
}
