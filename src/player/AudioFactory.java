
package player;

import java.util.HashMap;
import java.util.Map;

public class AudioFactory {
    private Map<String,Audio> audioPool;
    private static AudioFactory instance = null;
    
    private AudioFactory(){
        audioPool = new HashMap<>();
    }
    
    public static AudioFactory getInstance(){
        return instance;
    }
    
    public Audio getAudio(String name, String artist, int duration){
        return null;
    }
}
