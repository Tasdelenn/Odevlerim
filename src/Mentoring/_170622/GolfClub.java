package Mentoring._170622;

import java.util.ArrayList;

public class GolfClub {
     ArrayList<Member> members;

    public GolfClub() {
        members=new ArrayList<>();
    }

    public void addMember(Member member){
        if (member.getSinif()==Sinif.FAKFAKIR){
            System.out.println("Caktirmadan Guvenligi Cagirin");
        }else if(member.getSinif()==Sinif.FAKIR){
            System.out.println("Kibarca ayrilmasini isteyin");
        }else if (member.getSinif()==Sinif.ORTADIREK){
            System.out.println("cok ayak altinda dolasmadan kenarda oynayabilirsiniz");
            members.add(member);
        }else {
            System.out.println("Bastaci edin");
            members.add(member);
        }
    }
}
