import java.util.HashMap;
import java.util.Set;
public class Hashmatique {
    public static void main(String[] args) {
        
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Saint Tropez","I've been waitin', I've been waitin' for a long time");
        trackList.put("White Iverson","Saucin', saucin', I'm saucin' on you");
        trackList.put("Hollywood's Bleeding","Hollywood's bleeding, vampires feedin' Darkness turns to dust");
        trackList.put("Blame Tt On Me","I used to say I was free");
        System.out.println(trackList);

        String SingleTrack = trackList.get("Saint Tropez");
        System.out.println(SingleTrack);

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key + ": " + trackList.get(key));
        }
    }

}