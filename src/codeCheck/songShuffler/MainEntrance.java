package codeCheck.songShuffler;

public class MainEntrance {
    public static void main(String[] args) {
        String filePath = "./src/codeCheck.songShuffler/csv/songData.csv";

        Song[] songs = RawSongData.execute(filePath, true);

        ShuffleExecutor shuffledSongs = new ShuffleExecutor(songs);
        for (int i = 0; i < songs.length; i++) {
            System.out.println(shuffledSongs.getNextSong().getTrackTitle());
        }
    }
}

