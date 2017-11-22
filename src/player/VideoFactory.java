
package player;

import java.util.HashMap;
import java.util.Map;

public class VideoFactory {
    private Map<String,Video> videoPool;
    private static VideoFactory instance = null;
    
    private VideoFactory(){
        videoPool = new HashMap<>();
    }
    
    public static VideoFactory getInstance(){
        return instance;
    }
    
    public Video getVideo(String name, String artist, int duration){
        return null;
    }
}
