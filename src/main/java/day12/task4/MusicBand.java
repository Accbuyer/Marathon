package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<Member> memeberList = new ArrayList<>();

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void addMember(Member member) {
        memeberList.add(member);
    }

    public void deleteMember(int id) {
        memeberList.remove(id);
    }
    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2){
        musicBand1.getMemeberList().addAll(musicBand2.getMemeberList());
        musicBand2.getMemeberList().clear();
    }
    public void printMembers(){
        System.out.println(memeberList);
    }


    public List<Member> getMemeberList() {
        return memeberList;
    }


}
