//Ler um número inteiro n. Escrever a soma de todos os números pares de 2 até n

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("digite o numero inteiro: ");
        int n = in.nextInt();

        int soma = 0;
        int pares = 2;

        while (pares <= n) {
            soma += pares;
            pares +=2;

            
        }
        if (n % 2 == 0) {
            System.out.println("é par");

        } else {
            System.out.println("impar");
        }
        System.out.println("a soma de todos os pares é: " + soma);

    }

}
