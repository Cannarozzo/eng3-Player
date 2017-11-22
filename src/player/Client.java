package player;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Player p = new Player();
        Scanner in = new Scanner(System.in);

        int opc;
        String nome;
        do {
            System.out.println("1-Mostrar playlist");
            System.out.println("2-Nova playlist");
            System.out.println("3-Selecionar playlist");
            System.out.println("0-Sair do programa");
            System.out.println("Selecione: ");
            opc = in.nextInt();

            switch (opc) {
                case 1:
                    p.showPlayLists();
                    break;
                case 2:
                    System.out.print("Nome: ");
		    in.nextLine();
         	    nome = in.nextLine();
                    p.newPlayList(nome);
                    break;
                case 3:
                    System.out.print("Nome: ");
		    in.nextLine();
         	    nome = in.nextLine();
                    p.selectPlayList(nome);
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
