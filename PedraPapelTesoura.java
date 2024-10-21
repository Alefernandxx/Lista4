
import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("VOCÊ VAI JOGAR PEDRA, PAPEL, TESOURA CONTRA O COMPUTADOR" +
                "\nSEREMOS JUSTOS E SORTEAREMOS ALEATORIAMENTE UM VALOR PARA O COMPUTADOR " +
                "\nESCOLHA: " +
                "\n\t1. PEDRA " +
                "\n\t2. PAPEL " +
                "\n\t3. TESOURA ");

        // 3 RODADAS

        int usuario;
        int computador;
        int rodada;
        int usuarioGanhou = 0;
        int computadorGanhou = 0;

        int ganhou = 0;

        while (ganhou == 0) {
            usuario = in.nextInt();
            computador = aleatorio.nextInt(3) + 1;

            if (usuario == computador) {
                System.out.println("EMPATOU");

            } else if ((usuario == 1 && computador == 3) ||
                (usuario == 3 && computador == 2) ||
                (usuario == 2 && computador == 1)) 
            {
                
            usuarioGanhou++;
            System.out.println("usuario ganhou " + usuarioGanhou + " vezes! ");

            } else {
                computadorGanhou++;
                System.out.println("computador ganhou " + computadorGanhou + " vezes! ");
            }
            if (usuarioGanhou == 3) {
                ganhou = 1;
                System.out.println("USUÁRIO VENCEU A PARTIDA! ");
                
            } else if (computadorGanhou == 3) {
                ganhou = 1;
                System.out.println("COMPUTADOR GANHOU A PARTIDA! ");
                
            }

        }

    }
}
