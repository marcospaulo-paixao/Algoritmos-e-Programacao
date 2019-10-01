package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio30 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        String nome;

        System.out.println("Digite seu nome.");
        nome = entrada.nextLine();
        System.out.printf("%s, Informe a sua idade:\n", nome);
        idade = entrada.nextInt();

        if (idade >= 18) {
            System.out.print(nome + "é maior de idade!!!");
            if (idade >= 65) {
                System.out.println("E idoso.");
            }
        } else {
            System.out.print(nome + " é menor de idade!!!");
            if (idade <= 12) {
                System.out.println("E menor que 12 anos.");
            }
        }

    }
}
