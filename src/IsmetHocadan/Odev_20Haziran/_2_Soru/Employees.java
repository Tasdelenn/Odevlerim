package Odevlerim.IsmetHocadan.Odev_20Haziran._2_Soru;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employees {

    private String name;
    private int salary;
    private String dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getDateOfBirth() {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dateOfBirth,format);
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return
                "Name is " + name + '\'' +
                ", Salary is " + salary +
                ", Date Of Birth is " + dateOfBirth ;
    }
}
