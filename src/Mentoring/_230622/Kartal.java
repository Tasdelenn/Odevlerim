package Mentoring._230622;

public class Kartal implements IWild{
    @Override
    public void livesIn() {
        System.out.println("Goklerde :)");
    }

    @Override
    public void walks() {
        System.out.println("Iki ayaginin uzerinde yurur");
    }

    @Override
    public void eats() {
        System.out.println("Balik, tavsan, yilan, geyik, tilki");
    }

    @Override
    public void hunts() {
        System.out.println("kucuk hayvanlari avlar");
    }

    @Override
    public void friendlyToHumans() {
        System.out.println("Insan dostu degil");
    }

    public void sadeceKartalaAit(){
        System.out.println("ciyaklar :))");
    }
}
