
package player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayList {
    private String name;
    private List<Media> medias;
    private Media currentMedia;
    
    public PlayList(int name){
        medias = new ArrayList<>();
    }
    
    public String getName(){
        return name;
    }
    
    public void showMedias(){
       
    }
    
    public void newMedia(Media media){
    
    }
    
    public Media selectMedia(String name){
        return null;
    } 
    
    public Media randomSelect(){
        return null;
    }
    
    public void showMenu(){
        Scanner in = new Scanner(System.in);
        String nome, artista;
        int opc, duracao;
        do {
            System.out.println("1-Mostrar mídias");
            System.out.println("2-Adicionar áudio");
            System.out.println("3-Adicionar vídeo");
            System.out.println("4-Selecionar mídia");
            System.out.println("5-Escolher uma mídia aleatoriamente");
            System.out.println("6-Tocar uma mídia");
            System.out.println("0-Voltar ao menu principal");
            System.out.println("Selecione: ");
            opc = in.nextInt();

            switch (opc) {
                case 1:
                    showMedias();
                    break;
                case 2:
                    newMedia(currentMedia);
                    break;
                case 3:
                    newMedia(currentMedia);
                    break;
                case 4:
                    selectMedia(name);
                    break;
                case 5:
                    randomSelect();
                    break;  
                case 6:
                    System.out.print("Nome: ");
		    in.nextLine();
         	    nome = in.nextLine();
                    System.out.print("Artista: ");
		    in.nextLine();
         	    artista = in.nextLine();
                    System.out.print("Duracao: ");
		    in.nextLine();
         	    duracao = in.nextInt();
                    Media m = new Audio(nome, artista, duracao);
                    m.play();
                    break;    
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opc != 0);
        in.close();
    }
}
