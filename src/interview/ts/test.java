package interview.ts;

import java.util.ArrayList;
import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        HashMap<String, Integer> hmap = new HashMap<>();
        ArrayList<Song> arr = new ArrayList<>();
        arr.add(new Song("a", "b", "c", "d"));
        for (Song song : arr) {
            System.out.println(song.getTrackTitle());
        }
    }
}
