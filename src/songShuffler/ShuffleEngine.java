package songShuffler;

public interface ShuffleEngine {
    //先読み曲数（１曲以上）
    public final Integer PEEKMAX = 5;

    //シャッフル対象の曲(Song)の配列をインスタンスに設定します。
    void setSongs(Song[] songs);

    //次に再生する曲(Song)を返します。次に返す曲が更新されます。
    Song getNextSong();

    //PEEKMAXの数を上限として,次に再生する予定の曲を先読みして配列として返します。次に返す曲の状態は変わりません。
    Song[] peekQueue();
}
