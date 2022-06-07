import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    HashMap<String, String> trackList = new HashMap<String, String>();
    public void addTrack(String title, String lyrics) {
        trackList.put(title, lyrics);
    }

    public String pickATrack (String title) {
        String chosenSong = trackList.get(title);
        return chosenSong;
    }

    public void listAllTracks () {
        Set<String> keys = trackList.keySet(); 
        for (String key : keys) {
            System.out.println(key + ": " + trackList.get(key));
        }
    }
}