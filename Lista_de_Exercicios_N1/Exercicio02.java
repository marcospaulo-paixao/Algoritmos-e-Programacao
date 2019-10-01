package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Reis
public class Exercicio02 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        System.out.printf("O usuário %s informou que tem %d anos.\n", nome, idade);

    }
}
