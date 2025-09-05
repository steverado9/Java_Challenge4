package Challenge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.PriorityQueue;

//Write a Java program to create a class called "MusicLibrary" with
//a collection of songs and methods to add and remove songs, and to play a random song.
public class MusicLibrary {
    Collection<String> songs = new ArrayList<>();
    String[] randomSongs = new String[songs.size()];

    public void addSongs(String value) {
        songs.add(value);
    }

    public void removeSongs(String value) {
        songs.add(value);
    }

    public void playRandomSong(String value) {
        int result = (int) (Math.random() * songs.size());
//        songs[result];
    }


}
