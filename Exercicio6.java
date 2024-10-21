
/*
Escreva um algoritmo para ler um valor entre 1 (inclusive) e 10 (inclusive). Se o valor
lido não estiver entre 1 (inclusive) e 10 (inclusive), deve ser lido um novo valor. Após
a leitura do valor, escrever o valor lido na tela
*/
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor;
        System.out.println("Digite o valor: ");
        valor = in.nextInt();

        while (valor >= 1 && valor <= 10) {
            System.out.println("O valor está entre 1 e 10");
            System.out.println("Digite outro valor");
            valor = in.nextInt();

        }
        if (valor != 1 && valor != 10) {
            System.out.println("O valor é DIFERENTE");
            System.out.println("O valor é: " + valor);

        }

    }
}
