
/*
Escreva um algoritmo para ler uma senha. Se o usuário não digitar a senha correta
que é 12345, o algoritmo deve ler novamente, até que seja a senha correta. O
algoritmo deve também contar quantas vezes o usuário tentou digitar a senha
correta, ou seja, quantas tentativas de acerto aconteceram. Escrever essa
informação na tela.
 */
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int senhaCorreta = 12345;

        int maxTentativas = 3;
        int tentativas = 0;
        boolean senhaInvalida = false;

        while (tentativas < maxTentativas && !senhaInvalida) {
            System.out.println("Digite a senha: ");
            int senha = in.nextInt();
            tentativas++;

            if (senha == senhaCorreta) {
                System.out.println("Senha correta! ");
                senhaInvalida = true;

            } else {
                System.out.println("Senha incorreta! Tentativa " + tentativas + " de " + maxTentativas);
                if (tentativas == maxTentativas) {
                    System.out.println("Bloqueado por excesso de tentativas");

                }
            }

        }

    }

}
