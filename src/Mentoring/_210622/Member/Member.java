package Mentoring._210622.Member;

public class Member {
   protected String Name;
   protected int Age;
   protected String PhoneNumber;
   protected String Address;
   protected int Salary;

    public Member(String name, int age, String phoneNumber, String address, int salary) {
        Name = name;
        Age = age;
        PhoneNumber = phoneNumber;
        Address = address;
        Salary = salary;
    }

    public void printSalary(){
       System.out.println(Name+" isimli personel maasi "+Salary+" dir");
   }

    @Override
    public String toString() {
        return
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Address='" + Address + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}

