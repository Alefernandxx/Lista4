//Ler um número inteiro n. Decidir se n é um número primo e apresente o resultado.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("digite um número inteiro: ");
        int n = in.nextInt();

        if (n % 2 == 0) {
            System.out.printf("O número %d é primo", n);

        } else {
            System.out.printf("O número %d não é primo", n);
        }
    }
}
