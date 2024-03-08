import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Jogador> listaJogadores = new ArrayList<>();
//        listaJogadores.add(new Jogador("João", 30, 20,1));
//        listaJogadores.add(new Jogador("Maria", 33, 25,5));
//        listaJogadores.add(new Jogador("José", 50, 10,1));
//        listaJogadores.add(new Jogador("José", 11, 6,1));
//        listaJogadores.add(new Jogador("josiane", 18, 8,1));
//        listaJogadores.add(new Jogador("samara", 32, 15,1));
//        listaJogadores.add(new Jogador("suelem", 14, 13,1));
//        listaJogadores.add(new Jogador("salem", 44, 18,1));
//        listaJogadores.add(new Jogador("kirara", 31, 2,1));
//        listaJogadores.add(new Jogador("joaquina", 28, 7,1));
//        listaJogadores.add(new Jogador("luke", 25, 23,1));
        listaJogadores.sort(Comparator.comparing(Jogador::getPontuacao));
        Collections.reverse(listaJogadores);
        adicionarJogador(scanner, listaJogadores);
        listarJogadores(listaJogadores);


    }
    public static void listarJogadores(ArrayList<Jogador> listaJogadores){
        System.out.println("\n Jogadores: ");
        for (int i = 0; i < listaJogadores.size() ; i++) {
            if(i >= 10){
                break;
            }
            System.out.println("Jogador: " + listaJogadores.get(i).getNome() + " - Pontuação: " + listaJogadores.get(i).getPontuacao());
        }
    }

    public static void adicionarJogador(Scanner scanner, ArrayList<Jogador> listaJogadores){
        String nomeJogador;
        do {
            System.out.println("Digite seu nome: ");
            nomeJogador = scanner.next();
        } while(!validarNome(listaJogadores, nomeJogador));
        Jogador novoJogador = new Jogador(nomeJogador);
        listaJogadores.add(novoJogador);
    }

    public static boolean validarNome(ArrayList<Jogador> jogadores, String nome) {
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getNome().equals(nome)) {
                return false;
            }
        }
        return true;
    }
}
