package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio40 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;

        System.out.println("Informe sua idade: ");
        idade = entrada.nextInt();

        if (idade <= 16) {
            System.out.printf("Você não é eleitor! Idade: %s\n", idade);
        } else if (idade >= 18 && idade <= 65) {
            System.out.printf("Eleitor obrigatorio! Idade: %s\n", idade);
        } else if (idade > 16 || idade < 18 || idade > 65) {
            System.out.printf("Eleitor Facultativo! Idade: %s\n", idade);
        } else {
            System.out.printf("Erro de Logica %s\n", idade);
        }
    }
}
