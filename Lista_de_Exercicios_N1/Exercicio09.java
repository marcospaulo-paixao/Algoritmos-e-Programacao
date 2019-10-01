package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio09 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        double valorProduto,desconto,valorDesconto;
        
        System.out.println("Informe o valor do Produto: ");
        valorProduto = entrada.nextDouble();
        
        System.out.println("Informe a percentagem de desconto: ");
        desconto = entrada.nextDouble();
        
        valorDesconto = valorProduto-(valorProduto*(desconto/100));
        
        System.out.printf("valor do Produto: R$ %.2f\n",valorProduto);
        System.out.printf("Valor do Produto com desconto de %.0f%% : R$ %.2f\n",desconto,valorDesconto);
        
    }
}
