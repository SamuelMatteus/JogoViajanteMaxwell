// Classe para representar uma aresta (ligação) entre cidades
class Fronteiras {
    Cidade destino;
    int moedasDeTransporte;
    int poderDaJoia;



    public Fronteiras(Cidade destino, int moedasDeTransporte, int poderDaJoia) {
        this.destino = destino;
        this.moedasDeTransporte = moedasDeTransporte;
        this.poderDaJoia = poderDaJoia;
    }
}