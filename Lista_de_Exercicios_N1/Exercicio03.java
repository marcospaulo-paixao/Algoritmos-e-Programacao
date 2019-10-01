package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio03 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String nomeMarido, nomeEsposa, sobrenomeMarido, sobrenomeEsposa;
        int ano, anosCasados;

        System.out.println("Nome do Marido: ");
        nomeMarido = entrada.nextLine();
        System.out.println("Sobrenome do Marido: ");
        sobrenomeMarido = entrada.nextLine();
        System.out.println("Nome da Esposa: ");
        nomeEsposa = entrada.nextLine();
        System.out.println("Sobrenome da Esposa: ");
        sobrenomeEsposa = entrada.nextLine();
        System.out.println("Ano da Data de casamento: ");
        ano = entrada.nextInt();
        anosCasados = 2019 - ano;

        System.out.printf("%s %s é casado com %s %s há %d anos.\n", nomeMarido, sobrenomeMarido, nomeEsposa, sobrenomeEsposa, anosCasados);

    }
}
