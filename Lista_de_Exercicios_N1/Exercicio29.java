package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio29 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        String nome;

        System.out.println("Digite seu nome.");
        nome = entrada.nextLine();
        System.out.printf("%s, Informe a sua idade:\n", nome);
        idade = entrada.nextInt();

        if (idade >= 18) {
            System.out.println(nome + "é maior de idade!!!");
        } else {
            System.out.println(nome + " é menor de idade!!!");
        }

    }
}
