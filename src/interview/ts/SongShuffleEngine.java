package interview.ts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SongShuffleEngine {
    public static void main(String[] args) {
        Song s01 = new Song("JPop", "a", "album1", "track1-1");
        Song s02 = new Song("JPop", "a", "album1", "track1-2");
        Song s03 = new Song("JPop", "a", "album2", "track2-1");
        Song s04 = new Song("JPop", "b", "album3", "track3-1");

        Song s05 = new Song("Rock", "r", "album4", "track4-1");

        Song s06 = new Song("Soundtrack", "j", "album5", "track5-1");
        Song s07 = new Song("Soundtrack", "j", "album6", "track6-1");
        Song s08 = new Song("Soundtrack", "j", "album6", "track6-2");
        Song s09 = new Song("Soundtrack", "j", "album6", "track6-3");

        Song s10 = new Song("Metal", "v", "album7", "track7-1");

        List<Song> songList = new ArrayList<>();
        songList.add(s01);
        songList.add(s02);
        songList.add(s03);
        songList.add(s04);
        songList.add(s05);
        songList.add(s06);
        songList.add(s07);
        songList.add(s08);
        songList.add(s09);
        songList.add(s10);


        //raw list of songs
        Song[] songs = new Song[songList.size()];
        for (int i = 0, j = songList.size(); i < j; i++) {
            songs[i] = songList.get(i);
        }

        HashMap<String, ArrayList<Song>> hmap = ShuffleArgo.sortByArtist(songs);
        for (HashMap.Entry entry : hmap.entrySet()) {
            System.out.println(entry.getValue());
        }

        //shuffled list
//        ShuffleArgo.Shuffle(songs);
//        for (Song song : songs) {
//            System.out.println(song.getArtistName());
//            System.out.println(song.getTrackTitle());
//        }
    }
}

interface ShuffleEngine {
    void setSongs(Song[] songs);

    Song getNextSong();

    Song[] peekQueue();
}

class ShuffleExec implements ShuffleEngine {
    public static final Integer PEEKMAX = 5;

    @Override
    public void setSongs(Song[] songs) {

    }

    @Override
    public Song getNextSong() {
        return null;
    }

    @Override
    public Song[] peekQueue() {
        return new Song[0];
    }
}

class ShuffleArgo {
    //Fisher–Yates shuffle
    public static <T> void Shuffle(T[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            T swap = arr[i];
            arr[i] = arr[j];
            arr[j] = swap;
        }
    }

    public static HashMap<String, ArrayList<Song>> sortByArtist(Song[] arr) {
        HashMap<String, ArrayList<Song>> mergedList = new HashMap<>();
        ArrayList<Song> sameArtistSongs = new ArrayList<Song>();
        String artistNm;

        for (Song song : arr) {
            artistNm = song.getArtistName();

            if (!mergedList.containsKey(artistNm)) {
                sameArtistSongs.add(song);
                mergedList.put(artistNm, sameArtistSongs);
                sameArtistSongs.clear();
            } else {
                sameArtistSongs = mergedList.get(artistNm);
                sameArtistSongs.add(song);
                mergedList.put(artistNm, sameArtistSongs);
                sameArtistSongs.clear();
            }
        }

        return mergedList;
    }
}
