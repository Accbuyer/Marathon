package day12.task4;



public class Task4 {
    public static void main(String[] args) {

        MusicBand musicBand1 = new MusicBand("Group1", 1967);
        MusicBand musicBand2 = new MusicBand("Group2", 1969);

        musicBand1.addMember(new Member("Alex", "Filch"));
        musicBand1.addMember(new Member("Bob", "Sanders"));

        musicBand2.addMember(new Member("Cris", "Hammer"));
        musicBand2.addMember(new Member("Mark", "White"));

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
