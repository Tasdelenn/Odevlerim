package Odevlerim.IsmetHocadan.Odev_20Haziran._1_Soru;

public class Main {
    public static void main(String[] args) {

        Student ogr1 = new Student();
        ogr1.setName("Ali");
        ogr1.setAge(27);

        System.out.println("Student name is " + ogr1.getName());
        System.out.println("The Student is " + ogr1.getAge() + " years old");

    }
}