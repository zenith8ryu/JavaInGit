package interview.ts;

import liRen.basic.FirstableArrayList;

import java.util.*;

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

        Song[] shuffledSongs = ShuffleArgo.ShuffleExec(songs);

        for (Song song : shuffledSongs) {
            System.out.println(song.getTrackTitle());
        }

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
    public static <E> void Shuffle(List<E> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            E swap = list.get(i);
            list.set(i, list.get(j));
            list.set(j, swap);
        }
    }

    public static HashMap<String, ArrayList<Song>> shuffledSortByArtist(Song[] arr) {
        HashMap<String, ArrayList<Song>> mergedList = new HashMap<>();

        for (Song song : arr) {
            String artistNm = song.getArtistName();

            if (!mergedList.containsKey(artistNm)) {

//                System.out.println(artistNm);

                ArrayList<Song> sameArtistSongs = new ArrayList<>();
                sameArtistSongs.add(song);
                mergedList.put(artistNm, sameArtistSongs);
            } else {
                mergedList.get(artistNm).add(song);
            }

            //Shuffle songs of same artist
            ShuffleArgo.Shuffle(mergedList.get(artistNm));

//            System.out.println(artistNm);
        }

//        for (HashMap.Entry<String, ArrayList<Song>> entry : mergedList.entrySet()) {
//            System.out.println(entry.getKey() + ", num is : " + entry.getValue().size());
        }

//        System.out.println(mergedList.size());
        return mergedList;
    }

    public static Song[] ShuffleExec(Song[] songs) {
        Song[] shuffledSongContainer = new Song[songs.length];

        int[] indexContainer = new int[songs.length];
        HashMap<Integer, Song> indexedSongContainer = new HashMap<>();

        for (HashMap.Entry<String, ArrayList<Song>> entry : ShuffleArgo.shuffledSortByArtist(songs).entrySet()) {
            int indexScaleUnit = Integer.MAX_VALUE / (entry.getValue().size() + 1);
//            System.out.println("artist=" + entry.getKey() + ", song num=" + entry.getValue().size());
            int i = 0;
            int j = 0;

            for (Song song : entry.getValue()) {
                /* add a random variable range of 0~30% based on the original index,
                   to increase the randomnesss of the song list
                */
                int idx = indexScaleUnit * (i + (int) (Math.random() * 0.3));

                if (Arrays.asList(indexContainer).contains(idx)) {
                    //To avoid overwrite of existed index & and indexed-song in their container.
                    idx = idx + (int) (Math.random() * 1e10);
                }

                indexContainer[i] = indexScaleUnit * i;
                indexedSongContainer.put(idx, song);
                i++;
            }

            MergeSort.sortExec(indexContainer);

            for (int idx : indexContainer) {
                shuffledSongContainer[j++] = indexedSongContainer.get(idx);
            }

        }


        return shuffledSongContainer;
    }
}
