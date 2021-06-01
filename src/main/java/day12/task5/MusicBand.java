package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> musicArtistList = new ArrayList<>();

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void addMusicArtist(MusicArtist  musicArtist ) {
        musicArtistList.add(musicArtist);
    }

    public void deleteMusicArtist(int id) {
        musicArtistList.remove(id);
    }

    public static void transferMusicArtist(MusicBand musicBand1, MusicBand musicBand2){
        musicBand1.getMemeberList().addAll(musicBand2.getMemeberList());
        musicBand2.getMemeberList().clear();
    }
    public void printMusicArtists(){
        System.out.println(musicArtistList);
    }

    
    public List<MusicArtist> getMemeberList() {
        return musicArtistList;
    }


}
