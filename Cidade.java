import java.util.ArrayList;
import java.util.List;
import java.util.*;


// Classe responsável por definir os parâmetros padrões das cidades:
class Cidade {
    String nome;
    List<Fronteiras> limites;

    public Cidade(String nome) {
        this.nome = nome;
        this.limites = new ArrayList<>();
    }

    public void adicionarLigacao(Cidade destino, int custo, int poderDaJoia) {
        Fronteiras fronteira = new Fronteiras(destino, custo, poderDaJoia);
        limites.add(fronteira);
    }
}