public class Jogador {
    public String nome;
    public int idade;
    public int pontuacao = 0;
    public int numeroTentativas = 0;


    public void adicionaPontos() {
        this.pontuacao++;
    }

    public void perdePontos() {
        this.pontuacao--;
    }

    public void adicionaTentativa() {
        this.numeroTentativas++;
    }
}
