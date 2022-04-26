import java.util.Set;
import java.util.HashMap;
public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("hello", "hello it's me");
        trackList.put("johny", "johny johny yes baba!");
        trackList.put("baby shark", "baby shark dododo");
        trackList.put("hi", "hi hi");
        // get the keys by using the keySet method
        String track = trackList.get("hello");
        System.out.println(track);
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
   
            System.out.println(key+trackList.get(key));    
        }
    }
}
