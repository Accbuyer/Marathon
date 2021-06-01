package day12.task3;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>(Arrays.asList(new MusicBand("AC/DC", 1973),
                new MusicBand("Slipknot", 1995), new MusicBand("Bring Me The Horizon", 2004),
                new MusicBand("The Rolling Stones", 1962), new MusicBand("Breaking Benjamin", 1998),
                new MusicBand("Limp Bizkit", 1994), new MusicBand("Shinedown", 2001),
                new MusicBand("Hollywood Undead", 2005), new MusicBand("Nickelback", 1995),
                new MusicBand("Twenty One Pilots", 2009)));


        Collections.shuffle(musicBands);

        System.out.println(musicBands);
        System.out.println(groupsAfter2000(musicBands));



    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> list){
        return list.stream().filter(x -> x.getYear() >= 2000).collect(Collectors.toList());
    }
}
