package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio07 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        double valorProduto, desconto, valorDesconto;

        System.out.println("Informe o valor do produto: ");
        valorProduto = entrada.nextDouble();
        System.out.println("Informe a porcentagem de desconto: ");
        desconto = entrada.nextDouble();
        valorDesconto = valorProduto - (valorProduto * (desconto / 100));
        System.out.printf("O valor do produto é: R$ %.2f\n", valorProduto);
        System.out.printf("O valor do produto com desconto: R$ %.2f \n", valorDesconto);

    }
}
