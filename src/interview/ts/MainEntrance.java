package interview.ts;

import java.util.ArrayList;
import java.util.List;

public class MainEntrance {
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
        Song s11 = new Song("Metal", "v", "album7", "track7-2");
        Song s12 = new Song("Country", "r", "album8", "track8-1");

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
        songList.add(s11);
        songList.add(s12);

        //list of songs without rearrange.
        Song[] songs = new Song[songList.size()];
        for (int i = 0, j = songList.size(); i < j; i++) {
            songs[i] = songList.get(i);
        }

//        new ShuffleExecutor().setSongs(songs);

        ShuffleExecutor songExe = new ShuffleExecutor(songs);
        songExe.peekQueue();
        for (int i = 0; i < songs.length + 2; i ++) {
            System.out.println(songExe.getNextSong().getTrackTitle());
        }
//        System.out.println("---------------------");
//        Song[] newSongs2 = songExe.peekQueue();
//        System.out.println("---------------------");
//        Song[] newSongs3 = songExe.peekQueue();
//        System.out.println("---------------------");
//        Song[] newSongs4 = songExe.peekQueue();
//        System.out.println("---------------------");
//        Song[] newSongs5 = songExe.peekQueue();

//        for (Song song : newSongs) {
//            System.out.println(song.getTrackTitle());
//        }

    }
}

