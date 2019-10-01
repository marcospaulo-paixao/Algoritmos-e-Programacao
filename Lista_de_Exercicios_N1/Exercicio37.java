package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio37 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;

        System.out.println("Informe a sua idade:");
        idade = entrada.nextInt();

        if (idade > 0 && idade <= 2) {

            System.out.println("Recém-Nascido");

        } else if (idade >= 3 && idade <= 11) {

            System.out.println("Criança");

        } else if (idade >= 12 && idade <= 19) {

            System.out.println("Adolescente");

        } else if (idade >= 20 && idade <= 55) {

            System.out.println("Adulto");

        } else if (idade > 55) {

            System.out.println("Idoso");

        } else {
            System.out.println("Idade Invalida!!!");
        }

    }
}
