import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Jogador> listaJogadores = new ArrayList<>();
        listaJogadores.add(new Jogador("João", 30, 20,1));
        listaJogadores.add(new Jogador("Maria", 33, 25,5));
        listaJogadores.add(new Jogador("José", 50, 10,1));
        listaJogadores.sort(Comparator.comparing(Jogador::getPontuacao));
        Collections.reverse(listaJogadores);
        listarJogadores(scanner, listaJogadores);


    }
    public static void listarJogadores(Scanner scanner, ArrayList<Jogador> listaJogadores) {
        System.out.println("\n Jogadores: ");
        for (int i = 0; i < listaJogadores.size(); i++) {
            System.out.println(i + " - " + listaJogadores.get(i).getNome());
        }
    }
}
