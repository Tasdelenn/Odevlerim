package Mentoring._170622;

public class Main {
    public static void main(String[] args) {
        GolfClub sube1=new GolfClub();

        Member member1=new Member("Jacop","Smith",7000);
        Member member2=new Member("George","Jordan",700000);

        sube1.addMember(member1);
        sube1.addMember(member2);


        for (Member member: sube1.members){
            System.out.println(member.toString());
        }
    }
}
