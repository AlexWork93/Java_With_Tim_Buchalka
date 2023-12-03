import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration){
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        for (Song song: this.songs){
            if (song.getTitle().equals(title)) return song;
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> album){
        if (trackNumber - 1 < this.songs.size() && trackNumber > 0) {
            album.push(this.songs.get(trackNumber - 1));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String name, LinkedList<Song> album){
        Song song = findSong(name);
        if (song != null) {
            album.push(song);
            return true;
        }
        return false;
    }
}
