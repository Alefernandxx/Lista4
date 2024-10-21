//Ler um número inteiro n. Escrever a soma de todos os números de 1 até n

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("digite um numero inteiro");
        int n = in.nextInt();

        int soma = 0;
        int i = 1;

        // += --> soma

        while (i <= n) {
            soma += i;
            i++;

        }
        System.out.println("a soma de todos os numeros de 1 até " + n + " é " + soma);

        in.close();

    }
}
