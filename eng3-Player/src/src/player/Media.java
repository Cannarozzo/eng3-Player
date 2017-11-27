
package player;

public abstract class Media {
    private String name;
    private String artist;
    private int duration;
    
    public Media(String name, String artist, int duration){
        this.name = name;
        this.artist = artist;
        this.duration = duration;
    }
    
    public String getName(){
        return name;
    }
    
    public abstract void play();

    @Override
    public String toString() {
        return "[name=" + name + ", artist=" + artist + ", duration=" + duration + "]";
    }
    
    
}
