import java.util.*;

class Main {
  public static void main(String[] args) {
      System.out.println("\nJorat: \n\n- Olá Maxwell, seja bem vindo a essa incrível jornada! Precisamos da sua ajuda para a Jóia chegar até Nargumun!\n");

      //Cria as cidades do Mapa
    Cidade ubud = new Cidade("Ubud");
    Cidade kingdomOfLegmod = new Cidade("Kingdom Of Legmod");
    Cidade principalityOfNekikh = new Cidade("Principality Of Nekikh");
    Cidade principalityOfGritesthr = new Cidade("Principality Of Gritesthr");
    Cidade protectorateOfDogrove = new Cidade("Protectorate Of Dogrove");
    Cidade kingdomOfLastwatch = new Cidade("Kingdom Of Lastwatch");
    Cidade grandDuchyOfSmalia = new Cidade("Grand Duchy Of Smalia");
    Cidade kingdomOfOldcalia = new Cidade("Kingdom Of Oldcalia");
    Cidade kingdomOfKalb = new Cidade("Kingdom Of Kalb");
    Cidade aymarLeague = new Cidade("Aymar League");
    Cidade defalsia = new Cidade("Defalsia");
    Cidade vuneseOfEmpire = new Cidade("Vunese Of Empire");
    Cidade principalityOfKarhora = new Cidade("Principality Of Karhora");
    Cidade chandirSultanate = new Cidade("Chandir Sultanate");
    Cidade bun = new Cidade("Bun");
    Cidade principalityOfKasya = new Cidade("Principality Of Kasya");
    Cidade nargumun = new Cidade("Nargumun");

        // Cidades e suas fronteiras:
        //Ubud
      ubud.adicionarLigacao(kingdomOfLegmod, 1,2);
      ubud.adicionarLigacao(principalityOfNekikh, 1,1);
        //Kingdom of Legmod
      kingdomOfLegmod.adicionarLigacao(ubud, 1,0);
      kingdomOfLegmod.adicionarLigacao(principalityOfNekikh,1,1);
      kingdomOfLegmod.adicionarLigacao(principalityOfGritesthr,1,5);
      kingdomOfLegmod.adicionarLigacao(protectorateOfDogrove,1,3);
      kingdomOfLegmod.adicionarLigacao(kingdomOfOldcalia,1,4);
        //Principality of Nekikh
      principalityOfNekikh.adicionarLigacao(ubud,1,0);
      principalityOfNekikh.adicionarLigacao(kingdomOfLegmod,1,2);
      principalityOfNekikh.adicionarLigacao(principalityOfGritesthr,1,5);
        //Principality of Gritesthr
      principalityOfGritesthr.adicionarLigacao(principalityOfNekikh,1,1);
      principalityOfGritesthr.adicionarLigacao(kingdomOfLegmod,1,2);
      principalityOfGritesthr.adicionarLigacao(protectorateOfDogrove,1,3);
      principalityOfGritesthr.adicionarLigacao(kingdomOfLastwatch,1,-2);
        //Protectorate of Dogrove
      protectorateOfDogrove.adicionarLigacao(kingdomOfLegmod,1,2);
      protectorateOfDogrove.adicionarLigacao(principalityOfGritesthr,1,5);
      protectorateOfDogrove.adicionarLigacao(kingdomOfLastwatch,1,-2);
      protectorateOfDogrove.adicionarLigacao(kingdomOfOldcalia,1,4);
        //Kingdom of Lastwatch
      kingdomOfLastwatch.adicionarLigacao(principalityOfGritesthr,1,5);
      kingdomOfLastwatch.adicionarLigacao(protectorateOfDogrove,1,3);
      kingdomOfLastwatch.adicionarLigacao(kingdomOfOldcalia,1,4);
      kingdomOfLastwatch.adicionarLigacao(grandDuchyOfSmalia,1,1);
        //Grand Duchy Of Smalia
      grandDuchyOfSmalia.adicionarLigacao(kingdomOfLastwatch,1,-2);
      grandDuchyOfSmalia.adicionarLigacao(kingdomOfOldcalia,1,4);
        //Kingdom Of Oldcalia
      kingdomOfOldcalia.adicionarLigacao(grandDuchyOfSmalia,1,1);
      kingdomOfOldcalia.adicionarLigacao(kingdomOfLastwatch,1,-2);
      kingdomOfOldcalia.adicionarLigacao(protectorateOfDogrove,1,3);
      kingdomOfOldcalia.adicionarLigacao(kingdomOfLegmod,1,2);
      kingdomOfOldcalia.adicionarLigacao(kingdomOfKalb,1,2);
      kingdomOfOldcalia.adicionarLigacao(aymarLeague,1,1);
      kingdomOfOldcalia.adicionarLigacao(defalsia,1,-3);
        //Kingdom Of Kalb
      kingdomOfKalb.adicionarLigacao(kingdomOfOldcalia,1,4);
      kingdomOfKalb.adicionarLigacao(aymarLeague,1,1);
      kingdomOfKalb.adicionarLigacao(vuneseOfEmpire,1,0);
        //Aymar League
      aymarLeague.adicionarLigacao(defalsia,1,-3);
      aymarLeague.adicionarLigacao(kingdomOfOldcalia,1,4);
      aymarLeague.adicionarLigacao(kingdomOfKalb,1,2);
      aymarLeague.adicionarLigacao(vuneseOfEmpire,1,0);
      aymarLeague.adicionarLigacao(chandirSultanate,1,1);
      aymarLeague.adicionarLigacao(bun,1,5);
      aymarLeague.adicionarLigacao(nargumun,1,0);
      aymarLeague.adicionarLigacao(principalityOfKarhora,1,-2);
        //Defalsia
      defalsia.adicionarLigacao(kingdomOfOldcalia,1,4);
      defalsia.adicionarLigacao(aymarLeague,1,1);
        //Vunese Of Empire
      vuneseOfEmpire.adicionarLigacao(kingdomOfKalb,1,2);
      vuneseOfEmpire.adicionarLigacao(aymarLeague,1,1);
      vuneseOfEmpire.adicionarLigacao(chandirSultanate,1,1);
        //Principality Of Karhora
      principalityOfKarhora.adicionarLigacao(aymarLeague,1,1);
      principalityOfKarhora.adicionarLigacao(nargumun,1,0);
        //Chandir Sultanate
      chandirSultanate.adicionarLigacao(vuneseOfEmpire,1,0);
      chandirSultanate.adicionarLigacao(aymarLeague,1,1);
      chandirSultanate.adicionarLigacao(bun,1,5);
      chandirSultanate.adicionarLigacao(principalityOfKasya,1,-7);
        //Bun
      bun.adicionarLigacao(nargumun,1,0);
      bun.adicionarLigacao(aymarLeague,1,1);
      bun.adicionarLigacao(chandirSultanate,1,1);
        //Principality of Kasya
      principalityOfKasya.adicionarLigacao(chandirSultanate,1,1);
        //Nargumun
      nargumun.adicionarLigacao(principalityOfKarhora,1,-2);
      nargumun.adicionarLigacao(aymarLeague,1,1);
      nargumun.adicionarLigacao(bun,1,5);

    // Executor do jogo
    jogarJogo(ubud, 3,0);
  }

  public static void jogarJogo(Cidade cidadeInicial, int dinheiroInicial,int poderDaJoiaInicial) {
        Cidade cidadeAtual = cidadeInicial;
        int dinheiro = dinheiroInicial;
        int poderJoia = poderDaJoiaInicial;
        List<Cidade> cidadesVisitadas = new ArrayList<>();

        System.out.println("- Vamos lá! Para começar, receba essas " + dinheiroInicial +
                " de transporte, use-as de maneira sábia!");

        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println("Você está em: " + cidadeAtual.nome);
            System.out.println("Você possui " + dinheiro + " moedas de transporte disponíveis.");
            System.out.println("O nível da jóia está em " + poderJoia + ".");
            System.out.println("-------------------------------------------");

            //Analista as cidades vizinhas e encerra o jogo se o usuário desejar viajar sem moedas.
            List<Fronteiras> ligacoes = cidadeAtual.ligacoes;
            if (ligacoes.isEmpty()) {
                System.out.println("Você não pode viajar para nenhuma cidade. Fim de jogo!");
                break;
            }

            System.out.println("Opções de cidades para viajar:");

            for (int i = 0; i < ligacoes.size(); i++) {
                Fronteiras viagem = ligacoes.get(i);
                System.out.println((i + 1) + ". Cidade " + viagem.destino.nome);
            }

            // Obter a escolha do jogador
            Scanner scanner = new Scanner(System.in);
            int escolha = scanner.nextInt();

            // Local de conversa com o mercador
            if (escolha < 1 || escolha > ligacoes.size()) {
                System.out.println("Escolha inválida");
                continue;
              //inserir conversa do mercador
            }

            //Cidade que o jogador escolhe:
            Fronteiras cidadeEscolhida = ligacoes.get(escolha - 1);

            // Verificar se o jogador possui dinheiro suficiente para viajar
            if (dinheiro < cidadeEscolhida.moedasDeTransporte) {
                System.out.println("Você não possui dinheiro suficiente para viajar para a cidade " + cidadeEscolhida.destino.nome);
                System.out.println("Fim de jogo!");
                break;
            }

            // Viajar para a cidade escolhida
            cidadeAtual = cidadeEscolhida.destino;
            dinheiro -= cidadeEscolhida.moedasDeTransporte;
            poderJoia = cidadeEscolhida.poderDaJoia;
            cidadesVisitadas.add(cidadeAtual);

            System.out.println("------------------------------------------------------");
            System.out.println("Viajando para a cidade " + cidadeAtual.nome);
            System.out.println("Custo da viagem: " + cidadeEscolhida.moedasDeTransporte);
            System.out.println("Alteração do nível da jóia para:  " + cidadeEscolhida.poderDaJoia);
            System.out.println("------------------------------------------------------");
        }

        // Exibir informações finais do jogo
        System.out.println("Cidades visitadas:");
        for (Cidade cidade : cidadesVisitadas) {
            System.out.print(cidade.nome + " -> ");
        }
        System.out.println("Fim");
        System.out.println("Total gasto: " + (dinheiroInicial - dinheiro));
        System.out.println("Última cidade visitada: " + cidadeAtual.nome);
    }
}