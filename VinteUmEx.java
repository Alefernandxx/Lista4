
import java.util.Random;
import java.util.Scanner;

public class VinteUmEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeroRodada = 1;
        int jogadorAtual = 1;
        int maiorPontuacao = 0;
        int jogadorMaiorPontuacao = 0;
        boolean continuarJogo = true;

        while (continuarJogo) {
            System.out.println("Rodada " + numeroRodada + "- Jogador " + jogadorAtual);
            int pontuacaoJogador = 0;
            boolean jogadorContinuando = true;

            while (jogadorContinuando) {
                System.out.println("Sua pontuação atual é: " + pontuacaoJogador);
                System.out.println("Escolha os numeros (1) Baixa, (2) Media, (3) Alta, (4) Parar ");
                int escolha = in.nextInt();

                if (escolha == 1) {
                    int carta = aleatorio.nextInt(5) + 1;
                    pontuacaoJogador += carta;
                    System.out.println("Você escolheu a carta baixa ");
                } else if (escolha == 2) {
                    int carta = aleatorio.nextInt(4) + 6;
                    pontuacaoJogador += carta;
                    System.out.println("Você escolheu a carta média ");

                } else if (escolha == 3) {
                    int carta = aleatorio.nextInt(4) + 10;
                    pontuacaoJogador += carta;
                    System.out.println("Você escolheu a carta alta ");

                } else if (escolha == 4) {
                    jogadorContinuando = false;
                    System.out.println("Você decidiu parar com a pontuação " + pontuacaoJogador + " pontos. ");

                } else {
                    System.out.println("Opção Inválida! Escolha novamente. ");
                }

                if (pontuacaoJogador == 21) {
                    System.out.println("Parabéns! Você atingiu 21 pontos!!! ");
                    jogadorContinuando = false;

                }

            }
            // verificar maior pontuação

            if (pontuacaoJogador > maiorPontuacao && pontuacaoJogador <= 21) {
                maiorPontuacao = pontuacaoJogador;
                jogadorMaiorPontuacao = jogadorAtual;

            }
            System.out.println("Deseja continuar jogando? (s/n)");
            String resposta = in.next();

            if (resposta.equalsIgnoreCase("n")) {
                continuarJogo = false;

            }

        }
        numeroRodada++;
        jogadorAtual++;

        System.out.println("Jogo encerrado!");
        if (jogadorMaiorPontuacao > 0) {
            System.out.println("O jogador que fez mais pontos foi o Jogador " + jogadorMaiorPontuacao + " com "
            + maiorPontuacao + " pontos.");
        } else {
            System.out.println("Nenhum jogador conseguiu uma pontuação válida.");
        }

    }
}
