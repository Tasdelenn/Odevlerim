package Mentoring._210622.Animal;

public class AnimalMain {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
        bird1.uctu();
        bird1.yemekYer();
        bird1.yuru();

        Animal bird2 = new Animal();
        bird2.yemekYer();
        bird2.yuru();

        Animal bird3 = new Bird();
        bird3.yuru();
        bird3.yemekYer();

        ((Bird) bird3).uctu();
        deneme(bird1);
        Cat cat=new Cat();
        deneme(cat);
    }

    public static void deneme(Animal animal){
        if (animal instanceof Bird){
            ((Bird) animal).beslendi();
        }
        if (animal instanceof Cat){
            ((Cat) animal).beslendi();
        }
    }
}
