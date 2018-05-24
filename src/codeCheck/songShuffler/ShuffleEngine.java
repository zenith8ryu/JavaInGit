package codeCheck.songShuffler;

public interface ShuffleEngine {
    public final Integer PEEKMAX = 5;

    void setSongs(Song[] songs);

    Song getNextSong();

    Song[] peekQueue();
}
