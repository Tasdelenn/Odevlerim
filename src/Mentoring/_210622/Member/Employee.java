package Mentoring._210622.Member;

public class Employee extends Member{
    String specialization;

    public Employee(String name,
                    int age,
                    String phoneNumber,
                    String address,
                    int salary,
                    String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Employee{" +super.toString()+
                "specialization='" + specialization + '\'' +
                '}';
    }
}
