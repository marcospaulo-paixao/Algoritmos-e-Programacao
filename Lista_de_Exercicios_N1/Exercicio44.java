package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio44 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codigo;

        System.out.println("Informe o código do produto: ");
        codigo = entrada.nextInt();

        if (codigo == 1) {
            System.out.printf("Código: %s - Classificação: Aliemnto não - perecível\n", codigo);
        } else if (codigo == 2 || codigo == 3 || codigo == 4) {
            System.out.printf("Código: %s - Classificação: Aliemnto perecível\n", codigo);
        } else if (codigo == 5 || codigo == 6) {
            System.out.printf("Código: %s - Classificação: Vestuario\n", codigo);
        } else if (codigo == 7) {
            System.out.printf("Código: %s - Classificação: Higiene pessoal\n", codigo);
        } else if (codigo >= 8 || codigo <= 15) {
            System.out.printf("Código: %s - Classificação: Limpeza e utensilios domésticos\n", codigo);
        } else {
            System.out.println("Codigo invalido: " + codigo);
        }
    }
}
