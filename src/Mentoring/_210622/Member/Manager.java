package Mentoring._210622.Member;

public class Manager extends Member{
    String department;

    public Manager(String name,
                   int age,
                   String phoneNumber,
                   String address, int salary,
                   String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +super.toString()+
                "department='" + department + '\'' +
                '}';
    }
}
