package day12.task5;


public class Task5 {
    public static void main(String[] args) {

        MusicBand musicBand1 = new MusicBand("Group1", 1967);
        MusicBand musicBand2 = new MusicBand("Group2", 1969);

        musicBand1.addMusicArtist(new MusicArtist("Alex", "Filch", 25));
        musicBand1.addMusicArtist(new MusicArtist("Bob", "Sanders", 26));

        musicBand2.addMusicArtist(new MusicArtist("Cris", "Hammer", 31));
        musicBand2.addMusicArtist(new MusicArtist("Mark", "White", 16));

        MusicBand.transferMusicArtist(musicBand1, musicBand2);
        musicBand1.deleteMusicArtist(0);

        musicBand1.printMusicArtists();
        musicBand2.printMusicArtists();

    }
}
