/*
Faça um programa que receba a 5 notas de um aluno, através do comando while, e
que apresente ao final a média dessas 5 notas. Você deverá ter apenas uma
variável nota, e uma variável média.
*/

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nota = 0;
        int media;
        int contador = 0;

        while (contador < 5) {
            System.out.println("Digite a nota " + (contador + 1) + ": ");
            nota += in.nextInt();
            contador++;
            

        }
        media = nota / 5;
        System.out.println("A média é: " + media);
    }
}
