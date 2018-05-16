package interview.ts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ShuffleArgo {
    public static Song[] shuffleSongExec(Song[] inputArr) {
        Song[] shuffledSongTbl = new Song[inputArr.length];

        int[] indexContainer = new int[inputArr.length];
        HashMap<Integer, Song> indexedSongContainer = new HashMap<>();
        int outerLoop = 0; //outer loop cnt

        for (HashMap.Entry<String, List<Song>> entry : sortByArtist(inputArr).entrySet()) {
            int scaleUnit = Integer.MAX_VALUE / entry.getValue().size();
            int innerLoop = 0; //inner loop cnt

            for (Song song : entry.getValue()) {


                /* vary the range by 0~30% based on the original index,
                   to increase the randomnesss of the song list
                */
                int songIndex = (int) (scaleUnit * (innerLoop + Math.abs(Math.random() * 0.3)));


                if (Arrays.asList(indexContainer).contains(songIndex)) {
                    //To avoid overwrite of existed index & and indexed-song in their container.
                    songIndex = (int) (songIndex * (1 + Math.abs(Math.random() * 0.1)));
                }

                indexContainer[outerLoop] = songIndex;
                indexedSongContainer.put(songIndex, song);

                innerLoop++;
                outerLoop++;
            }
        }

        //rearrange song index by merge-sort method
        MergeSort.sortExec(indexContainer);

        for (int i = 0; i < indexContainer.length; i++) {
            shuffledSongTbl[i] = indexedSongContainer.get(indexContainer[i]);
        }

        return shuffledSongTbl;
    }

    public static HashMap<String, List<Song>> sortByArtist(Song[] inputArr) {
        HashMap<String, List<Song>> sortedSongTbl = new HashMap<>();

        for (Song song : inputArr) {
            String artistNm = song.getArtistName();

            if (!sortedSongTbl.containsKey(artistNm)) {
                List<Song> sameArtistSongs = new ArrayList<>();
                sameArtistSongs.add(song);
                sortedSongTbl.put(artistNm, sameArtistSongs);
            } else {
                sortedSongTbl.get(artistNm).add(song);
            }

            //Shuffle order of songs by the same artist
            ShuffleArgo.Shuffle(sortedSongTbl.get(artistNm));
        }

        return sortedSongTbl;
    }

    //Fisher–Yates shuffle
    public static <T> void Shuffle(List<T> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            int j = (int) (Math.abs(Math.random()) * (i + 1));
            T swap = list.get(i);
            list.set(i, list.get(j));
            list.set(j, swap);
        }
    }

}
