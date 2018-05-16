package interview.ts;

public class ShuffleEngineExec implements ShuffleEngine {

    @Override
    public void setSongs(Song[] songs) {
        Song[] sortedSongs = ShuffleArgo.songListShuffler(songs);

        for (int i = 0, j = songs.length; i < j; i++) {
            songs[i] = sortedSongs[i];
        }
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
