import java.sql.SQLOutput;
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("\nJorat: \n\n- Olá Maxwell, seja bem vindo a essa incrível jornada! Precisamos da sua ajuda para a Jóia chegar até Nargumun!");
        //Cria as cidades do Mapa
        Cidade ubud = new Cidade("Ubud | Poder da Jóia = 0");
        Cidade kingdomOfLegmod = new Cidade("Kingdom Of Legmod | Poder da Jóia = +2");
        Cidade principalityOfNekikh = new Cidade("Principality Of Nekikh | Poder da Jóia = +1");
        Cidade principalityOfGritesthr = new Cidade("Principality Of Gritesthr | Poder da Jóia = +5");
        Cidade protectorateOfDogrove = new Cidade("Protectorate Of Dogrove | Poder da Jóia = +3");
        Cidade kingdomOfLastwatch = new Cidade("Kingdom Of Lastwatch | Poder da Jóia = -2");
        Cidade grandDuchyOfSmalia = new Cidade("Grand Duchy Of Smalia | Poder da Jóia = +1");
        Cidade kingdomOfOldcalia = new Cidade("Kingdom Of Oldcalia | Poder da Jóia = +4");
        Cidade kingdomOfKalb = new Cidade("Kingdom Of Kalb | Poder da Jóia = +2");
        Cidade aymarLeague = new Cidade("Aymar League | Poder da Jóia = +1");
        Cidade defalsia = new Cidade("Defalsia | Poder da Jóia = -3");
        Cidade vuneseOfEmpire = new Cidade("Vunese Of Empire | Poder da Jóia = 0");
        Cidade principalityOfKarhora = new Cidade("Principality Of Karhora | Poder da Jóia = -2");
        Cidade chandirSultanate = new Cidade("Chandir Sultanate | Poder da Jóia = +1");
        Cidade bun = new Cidade("Bun | Poder da Jóia = +5");
        Cidade principalityOfKasya = new Cidade("Principality Of Kasya | Poder da Jóia = -7");
        Cidade nargumun = new Cidade("Nargumun | Poder da Jóia = 0");

        // Cidades e suas fronteiras:
        //Ubud
        ubud.adicionarLigacao(kingdomOfLegmod, 1, 2);
        ubud.adicionarLigacao(principalityOfNekikh, 1, 1);
        //Kingdom of Legmod
        kingdomOfLegmod.adicionarLigacao(ubud, 1, 0);
        kingdomOfLegmod.adicionarLigacao(principalityOfNekikh, 1, 1);
        kingdomOfLegmod.adicionarLigacao(principalityOfGritesthr, 1, 5);
        kingdomOfLegmod.adicionarLigacao(protectorateOfDogrove, 1, 3);
        kingdomOfLegmod.adicionarLigacao(kingdomOfOldcalia, 1, 4);
        //Principality of Nekikh
        principalityOfNekikh.adicionarLigacao(ubud, 1, 0);
        principalityOfNekikh.adicionarLigacao(kingdomOfLegmod, 1, 2);
        principalityOfNekikh.adicionarLigacao(principalityOfGritesthr, 1, 5);
        //Principality of Gritesthr
        principalityOfGritesthr.adicionarLigacao(principalityOfNekikh, 1, 1);
        principalityOfGritesthr.adicionarLigacao(kingdomOfLegmod, 1, 2);
        principalityOfGritesthr.adicionarLigacao(protectorateOfDogrove, 1, 3);
        principalityOfGritesthr.adicionarLigacao(kingdomOfLastwatch, 1, -2);
        //Protectorate of Dogrove
        protectorateOfDogrove.adicionarLigacao(kingdomOfLegmod, 1, 2);
        protectorateOfDogrove.adicionarLigacao(principalityOfGritesthr, 1, 5);
        protectorateOfDogrove.adicionarLigacao(kingdomOfLastwatch, 1, -2);
        protectorateOfDogrove.adicionarLigacao(kingdomOfOldcalia, 1, 4);
        //Kingdom of Lastwatch
        kingdomOfLastwatch.adicionarLigacao(principalityOfGritesthr, 1, 5);
        kingdomOfLastwatch.adicionarLigacao(protectorateOfDogrove, 1, 3);
        kingdomOfLastwatch.adicionarLigacao(kingdomOfOldcalia, 1, 4);
        kingdomOfLastwatch.adicionarLigacao(grandDuchyOfSmalia, 1, 1);
        //Grand Duchy Of Smalia
        grandDuchyOfSmalia.adicionarLigacao(kingdomOfLastwatch, 1, -2);
        grandDuchyOfSmalia.adicionarLigacao(kingdomOfOldcalia, 1, 4);
        //Kingdom Of Oldcalia
        kingdomOfOldcalia.adicionarLigacao(grandDuchyOfSmalia, 1, 1);
        kingdomOfOldcalia.adicionarLigacao(kingdomOfLastwatch, 1, -2);
        kingdomOfOldcalia.adicionarLigacao(protectorateOfDogrove, 1, 3);
        kingdomOfOldcalia.adicionarLigacao(kingdomOfLegmod, 1, 2);
        kingdomOfOldcalia.adicionarLigacao(kingdomOfKalb, 1, 2);
        kingdomOfOldcalia.adicionarLigacao(aymarLeague, 1, 1);
        kingdomOfOldcalia.adicionarLigacao(defalsia, 1, -3);
        //Kingdom Of Kalb
        kingdomOfKalb.adicionarLigacao(kingdomOfOldcalia, 1, 4);
        kingdomOfKalb.adicionarLigacao(aymarLeague, 1, 1);
        kingdomOfKalb.adicionarLigacao(vuneseOfEmpire, 1, 0);
        //Aymar League
        aymarLeague.adicionarLigacao(defalsia, 1, -3);
        aymarLeague.adicionarLigacao(kingdomOfOldcalia, 1, 4);
        aymarLeague.adicionarLigacao(kingdomOfKalb, 1, 2);
        aymarLeague.adicionarLigacao(vuneseOfEmpire, 1, 0);
        aymarLeague.adicionarLigacao(chandirSultanate, 1, 1);
        aymarLeague.adicionarLigacao(bun, 1, 5);
        aymarLeague.adicionarLigacao(nargumun, 1, 0);
        aymarLeague.adicionarLigacao(principalityOfKarhora, 1, -2);
        //Defalsia
        defalsia.adicionarLigacao(kingdomOfOldcalia, 1, 4);
        defalsia.adicionarLigacao(aymarLeague, 1, 1);
        //Vunese Of Empire
        vuneseOfEmpire.adicionarLigacao(kingdomOfKalb, 1, 2);
        vuneseOfEmpire.adicionarLigacao(aymarLeague, 1, 1);
        vuneseOfEmpire.adicionarLigacao(chandirSultanate, 1, 1);
        //Principality Of Karhora
        principalityOfKarhora.adicionarLigacao(aymarLeague, 1, 1);
        principalityOfKarhora.adicionarLigacao(nargumun, 1, 0);
        //Chandir Sultanate
        chandirSultanate.adicionarLigacao(vuneseOfEmpire, 1, 0);
        chandirSultanate.adicionarLigacao(aymarLeague, 1, 1);
        chandirSultanate.adicionarLigacao(bun, 1, 5);
        chandirSultanate.adicionarLigacao(principalityOfKasya, 1, -7);
        //Bun
        bun.adicionarLigacao(nargumun, 1, 0);
        bun.adicionarLigacao(aymarLeague, 1, 1);
        bun.adicionarLigacao(chandirSultanate, 1, 1);
        //Principality of Kasya
        principalityOfKasya.adicionarLigacao(chandirSultanate, 1, 1);
        //Nargumun
        nargumun.adicionarLigacao(principalityOfKarhora, 1, -2);
        nargumun.adicionarLigacao(aymarLeague, 1, 1);
        nargumun.adicionarLigacao(bun, 1, 5);

        // Executor do jogo, com os valores iniciais
        jogarJogo(ubud, 10, 0);
    }

    public static void jogarJogo(Cidade cidadeInicial, int dinheiroInicial, int poderDaJoiaInicial) {
        Cidade cidadeAtual = cidadeInicial;
        int dinheiro = dinheiroInicial;
        int poderJoia = poderDaJoiaInicial;
        List<Cidade> cidadesVisitadas = new ArrayList<>();


        System.out.println("- Vamos lá! Para começar, receba essas " + dinheiroInicial +
                " de transporte, use-as de maneira sábia!");
        while (true) {
            System.out.println("------------------------------------------------------");
            System.out.println("Você está em: " + cidadeAtual.nome);
            System.out.println("Você possui " + dinheiro + " moedas de transporte disponíveis.");
            System.out.println("O nível da jóia está em " + poderJoia + ".");
            System.out.println("------------------------------------------------------");

            //Analisa as cidades vizinhas e encerra o jogo se o usuário desejar viajar sem moedas.
            List<Fronteiras> ligacoes = cidadeAtual.limites;
            if (ligacoes.isEmpty()) {
                System.out.println("Você não pode viajar para nenhuma cidade. Fim de jogo!");
                break;
            }
            System.out.println("Opções de cidades para viajar:");
            for (int i = 0; i < ligacoes.size(); i++) {
                Fronteiras viagem = ligacoes.get(i);
                System.out.println((i + 1) + ". Cidade " + viagem.destino.nome);
            }
            // Recebe a escolha de viagem do jogador
            Scanner scanner = new Scanner(System.in);
            int escolha = scanner.nextInt();
            // Local de conversa com o mercador
            if (escolha < 1 || escolha > ligacoes.size()) {
                System.out.println("Escolha inválida");
                continue;
            }
            //Cidade que o jogador escolhe:
            Fronteiras cidadeEscolhida = ligacoes.get(escolha - 1);
            // Verificar se o jogador possui dinheiro suficiente para viajar
            if (dinheiro < cidadeEscolhida.moedasDeTransporte) {
                System.out.println("Você não possui dinheiro suficiente para viajar para a cidade " + cidadeEscolhida.destino.nome);
                System.out.println("Fim de jogo!");
                break;
            }
            // Viaja entre cidades, executa o pagamento da moeda e alteração do poder da Jóia.
            cidadeAtual = cidadeEscolhida.destino;
            dinheiro -= cidadeEscolhida.moedasDeTransporte;
            poderJoia += cidadeEscolhida.poderDaJoia;
            cidadesVisitadas.add(cidadeAtual);
            //Mercador e perguntas
            System.out.println("Olá! Eu sou o mercador de " + cidadeAtual.nome + "!");
            System.out.println("Huum, posso ver que você possui " + dinheiro + " moedas de transporte.");
            System.out.println("Vi que você passou por:");
            for (Cidade cidade : cidadesVisitadas) {
                System.out.print("Ubud |" + " " + cidade.nome + " -> \n");
                System.out.println("Deseja trocar suas moedas por limiar na jóia?");
                System.out.println("1.SIM");
                System.out.println("2.NÃO");
                Scanner mercador = new Scanner(System.in);
                int mercadortroca = scanner.nextInt();
                if (mercadortroca == 1) {
                    int aceitarTroca = poderJoia + dinheiro;
                    int aceitarTrocaDinheiro = dinheiro - dinheiro;
                    System.out.println("Ótimo! O poder da jóia está em " + aceitarTroca + ".");
                    System.out.println("Você agora possui" + aceitarTrocaDinheiro + " moedas.");
                    continue;
                }
                if (mercadortroca == 2) {
                    System.out.println("Tudo bem, faça uma boa viagem!");
                    break;
                }
            }
                //Confere se há missões disponíveis na cidade atual e aciona as missões das cidades que possuem.
                String kalbMissao = "Kingdom Of Kalb | Poder da Jóia = +2";
                if (kalbMissao.contains(cidadeAtual.nome)) {
                    System.out.println("Temos uma missão disponível na cidade, você deseja aceitar?");
                    System.out.println("1 - SIM");
                    System.out.println("2 - NÃO");
                    Scanner missao = new Scanner(System.in);
                    int aceitarMissao = missao.nextInt();
                    if (aceitarMissao == 1) {
                        System.out.println("Por aceitar, receba essas 4 moedas!");
                        System.out.println("Agora, vá até a cidade de Grand Duchy of Smalia\nLá, você receberá as luvas do poder!");
                        int moedasAceitarMissao = 4;
                        dinheiro = dinheiro + moedasAceitarMissao;
                        continue;
                    }
                    if (aceitarMissao == 2) {
                        System.out.println("Que pena! Faça uma boa viagem.");
                    }
                }
                String defalsiaMissao = "Defalsia | Poder da Jóia = -3";
                if (defalsiaMissao.contains(cidadeAtual.nome)) {
                    System.out.println("Temos uma missão disponível na cidade, você deseja aceitar?");
                    System.out.println("1 - SIM");
                    System.out.println("2 - NÃO");
                    Scanner missaoDefalsia = new Scanner(System.in);
                    int aceitarMissaoDefalsia = missaoDefalsia.nextInt();
                    if (aceitarMissaoDefalsia == 1) {
                        System.out.println("Por aceitar, receba essas 6 moedas!");
                        System.out.println("Agora, vá até a cidade de Principality Of Kasya\nLá, você receberá as botas do poder!");
                        int moedasAceitarMissaoDefalsia = 6;
                        dinheiro = dinheiro + moedasAceitarMissaoDefalsia;
                        continue;
                    }
                    if (aceitarMissaoDefalsia == 2) {
                        System.out.println("Que pena! Faça uma boa viagem.");
                    }
                }
                String vuneseMissao = "Vunese Of Empire | Poder da Jóia = 0";
                if (vuneseMissao.contains(cidadeAtual.nome)) {
                    System.out.println("Temos uma missão disponível na cidade, você deseja aceitar?");
                    System.out.println("1 - SIM");
                    System.out.println("2 - NÃO");
                    Scanner missaoVunese = new Scanner(System.in);
                    int aceitarMissaoVunese = missaoVunese.nextInt();
                    if (aceitarMissaoVunese == 1) {
                        System.out.println("Por aceitar, receba essa moeda!");
                        System.out.println("Agora, vá até a cidade de Ubud\nE você receberá a Glória dos Retornados!");
                        int moedasAceitarMissaoVunese = 1;
                        dinheiro = dinheiro + moedasAceitarMissaoVunese;
                        continue;
                    }
                    if (aceitarMissaoVunese == 2) {
                        System.out.println("Que pena! Faça uma boa viagem.");
                    }
                }
                //Confere a cada viagem as alterações do poder da Jóia:
                if (poderJoia < 0) {
                    poderJoia = 0;
                }
                if (poderJoia >= 8) {
                    System.out.println("A jóia ultrapassou o limite máximo de poder, você morreu!\n");
                    break;
                }
                //Encerra o jogo se o usuário chegar até a cidade final.
                String vencerJogo = "Nargumun | Poder da Jóia = 0";
                if (vencerJogo.contains(cidadeAtual.nome)) {
                    System.out.println("Parabéns! Você chegou a Nargumun!\nA jóia foi entregue!");
                    break;
                }
            }

        }
    }



