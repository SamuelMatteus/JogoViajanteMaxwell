import java.util.ArrayList;
import java.util.List;

// Classe para representar um nó do grafo
class Cidade {
    String nome;
    List<Fronteiras> ligacoes;


    public Cidade(String nome) {
        this.nome = nome;
        this.ligacoes = new ArrayList<>();
    }

    public void adicionarLigacao(Cidade destino, int custo, int poderDaJoia) {
        Fronteiras fronteira = new Fronteiras(destino, custo, poderDaJoia);
        ligacoes.add(fronteira);
    }
}