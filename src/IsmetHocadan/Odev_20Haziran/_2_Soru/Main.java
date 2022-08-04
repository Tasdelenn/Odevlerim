package Odevlerim.IsmetHocadan.Odev_20Haziran._2_Soru;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Employees emp1 = new Employees();
        emp1.setName("Fernando");
        emp1.setSalary(80000);
        emp1.setDateOfBirth("23/11/2000");

        System.out.println("Calisan Durum = " + emp1.toString());

        // ageCalculator(emp1.getDateOfBirth());  // KONTROL

        int age = ageCalculator(emp1.getDateOfBirth());

        if (age == 18)
            System.out.println("we can have inter with you after " +
                    "that you can have a 80000 salary");
        else if (age > 18)
            System.out.println("Welcome to our company " + emp1.getName() +
                    " your salary is 80000.");
        else
            System.out.println("come back when you are 18 years old.");
    }



    public static int ageCalculator(LocalDate formalDogumTarihi){

        int age;

        age = LocalDate.now().compareTo(formalDogumTarihi);

        System.out.println("age = " + age); // ÇALIŞINCA KONTROL AMAÇLI
                                            // YAŞ YAZSIN İSTEDİM.
        return age;
    }
}
