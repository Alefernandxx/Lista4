
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nome;

        System.out.println("Digite seu nome ou s para sair: ");
        nome = in.nextLine();

        while (!nome.equals("s")) {
            System.out.printf("Bem-vindo! %s\n", nome);
            System.out.println("Digite seu nome ou s para sair: ");
            nome = in.nextLine();

        }
        System.out.println("Fim da execução! ");
    }
}
