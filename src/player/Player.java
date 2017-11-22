package player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

    private List<PlayList> playLists;

    public Player() {
        playLists = new ArrayList<>();
    }

    public void showPlayLists() {
        for(PlayList pl : playLists){
           
        }
    }

    public void newPlayList(String name) {
        /*playLists.add(name);*/
    }

    public PlayList selectPlayList(String name) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nome: ");
        in.nextLine();
        name = in.nextLine();
        
        return null;
    }
}
