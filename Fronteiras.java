import java.util.StringTokenizer;

// Classe que define as fronteiras entre cidades.
class Fronteiras {
    Cidade destino;
    int moedasDeTransporte;
    int poderDaJoia;
    public Fronteiras(Cidade destino, int moedasDeTransporte, int poderDaJoia) {
        this.destino = destino;
        this.moedasDeTransporte = moedasDeTransporte;
        this.poderDaJoia = poderDaJoia;
    }
    
    public void ExecutarMissaoEmKalb(){
        System.out.println("Olá, seja bem vindo! Temos uma missão para você, deseja aceitar? ");
        int aceitarMissao = 0;
        System.out.println("1.SIM \n2.NÃO");
        if (aceitarMissao == 1) {
            System.out.println("Ótimo! Por aceitar, receba 4 moedas de transporte!");
            moedasDeTransporte += 4;
            System.out.println("Se desejas ganhar um prêmio maior, vá até Grand Duchy of Smalia e receba as luvas do poder!");
        }
        if (aceitarMissao == 2) {
            System.out.println("Que pena!");
        }
    }
}

