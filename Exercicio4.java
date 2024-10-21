/*
Escreva um programa que apresente quatro opções: (a) consulta saldo, (b) saque e
(c) depósito e (d) sair. O saldo deve iniciar em R$ 0,00. A cada saque ou depósito o
valor do saldo deve ser atualizado.
*/

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String opcao;

        double saldo = 0;

        System.out.println("aperte a para saldo, b para saque, c para depósito e d para sair ");
        opcao = in.nextLine();

        while (!opcao.equals("d")) {
            if (opcao.equals("a")) {
                System.out.println("Seu saldo é: " + saldo);

            }
            else if (opcao.equals("b")) {
                System.out.println("Informe o valor do saque: ");
                double saque = in.nextDouble();
                saldo = saldo - saque;
                in.nextLine();
            }
            else if (opcao.equals("c")) {
                System.out.println("Informe o valor do depósito: ");
                double deposito = in.nextDouble();
                saldo = saldo + deposito;
                in.nextLine();
            }
            System.out.println("aperte a para saldo, b para saque, c para depósito e d para sair ");
            opcao = in.nextLine();
            

            

        }
        System.out.println("Fim da execução! ");

        in.close();

    }
}
