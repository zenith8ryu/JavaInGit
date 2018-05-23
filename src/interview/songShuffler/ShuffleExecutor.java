package interview.songShuffler;

public class ShuffleExecutor implements ShuffleEngine {
    private Song[] currentSongsList;
    private Song[] currentSongsQueue;
    private int currentQueueNo = -1;//from (-1) to (int) Math.ceil((double) currentSongsList.length / PEEKMAX) - 1.
    private int currentTrackNo = -1;//from (-1) to (PEEKMAX - 1).

    ShuffleExecutor(Song[] songs) {
        this.currentSongsList = new Song[songs.length];
        this.currentSongsQueue = new Song[PEEKMAX];
        setSongs(songs);
        peekQueue();
    }

    @Override
    public void setSongs(Song[] songs) {
        if (songs.length > 0) {
            this.currentSongsList = ShuffleArgo.songListShuffler(songs);
        } else {
            System.out.println("This is an empty song list, which can't be rearranged.");
        }
    }

    @Override
    public Song getNextSong() {
        if (currentTrackNo < PEEKMAX - 1) {
            currentTrackNo++;
        } else if (currentTrackNo == PEEKMAX - 1) {
            peekQueue();
            currentTrackNo = 0;
        }
        return currentSongsQueue[currentTrackNo];
    }

    @Override
    public Song[] peekQueue() {
        int maxQueueNo = (int) Math.ceil((double) currentSongsList.length / PEEKMAX) - 1;
        int queueStart = 0;
        int queueEnd = 0;

        if (currentQueueNo < maxQueueNo - 1) {
            currentQueueNo++;
            queueStart = currentQueueNo * PEEKMAX;
            queueEnd = queueStart + PEEKMAX - 1;
        } else if (currentQueueNo == maxQueueNo - 1) {
            currentQueueNo++;
            queueStart = currentQueueNo * PEEKMAX;
            queueEnd = currentSongsList.length - 1;
        } else if (currentQueueNo == maxQueueNo) {
            setSongs(currentSongsList);
            currentQueueNo = 0;
            queueStart = 0;
            queueEnd = PEEKMAX - 1;
        }

        for (int i = 0, j = queueStart; i + j <= queueEnd; i++) {
            currentSongsQueue[i] = currentSongsList[i + j];
        }

        return currentSongsQueue;
    }

}
