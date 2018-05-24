package codeCheck.songShuffler;

import codeCheck.songShuffler.tool.DataReader;

import java.util.ArrayList;
import java.util.List;

public class RawSongData {
    /**
     * Convert raw csv data of string, into Song data.
     *
     * @return Modified song data, with info of genre, artist name, album tile, and track title.
     */
    public static Song[] execute(String filePath, boolean removeHeadlineFlg) {
        List<String> songDataList = DataReader.readCsvFile(filePath, removeHeadlineFlg);
        List<Song> songList = new ArrayList<>();

        for (String songData : songDataList) {
            int innerLoop = 0;
            Song song = new Song("", "", "", "");

            for (String str : songData.split(",")) {
                switch (innerLoop) {
                    case 0:
                        song.setGenre(str);
                        break;
                    case 1:
                        song.setArtistName(str);
                        break;
                    case 2:
                        song.setAlbumTitle(str);
                        break;
                    case 3:
                        song.setTrackTitle(str);
                        break;
                }

                innerLoop++;
            }

            songList.add(song);
        }

        Song[] songs = new Song[songList.size()];
        for (int i = 0, j = songList.size(); i < j; i++) {
            songs[i] = songList.get(i);
        }

        return songs;
    }
}
