package codeCheck.songShuffler;

public class MainEntrance {
    public static void main(String[] args) {
        //Songデータ（csv形式）の保存先
        String filePath = "./src/codeCheck.songShuffler/csv/songData.csv";

        //Songデータを取り込む
        Song[] songs = RawSongData.execute(filePath, true);

        //シャッフルされた曲順で曲を返す
        ShuffleExecutor shuffledSongs = new ShuffleExecutor(songs);
        for (int i = 0; i < songs.length; i++) {
            System.out.println(shuffledSongs.getNextSong().getTrackTitle());
        }
    }
}

