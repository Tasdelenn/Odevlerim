package Mentoring._210622.Member;

public class MemberMain {
    public static void main(String[] args) {
        Employee employee = new Employee("George", 45, "5698745", "dflkgbdflkgjsdflk", 25000, "Amelelik");
        Manager manager = new Manager("Ayse", 36, "865478962", "sdkfjoirjvcbmclkg", 50000, "Testing");

        manager.printSalary();
        employee.printSalary();
        System.out.println(manager);
        System.out.println(employee);


    }
}
