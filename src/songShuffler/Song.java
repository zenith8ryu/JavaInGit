package songShuffler;

public class Song {
    String genre;
    String artistName;
    String albumTitle;
    String trackTitle;

    public Song(String genre, String artistName, String albumTitle, String trackTitle) {
        this.genre = genre;
        this.artistName = artistName;
        this.albumTitle = albumTitle;
        this.trackTitle = trackTitle;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public String getTrackTitle() {
        return trackTitle;
    }

    public void setTrackTitle(String trackTitle) {
        this.trackTitle = trackTitle;
    }

}
