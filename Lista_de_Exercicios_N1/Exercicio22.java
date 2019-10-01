package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Reis
public class Exercicio22 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor3dig, centena, dezena, unidade;

        System.out.println("Informe um valor de 3 digitos:");
        valor3dig = entrada.nextInt();

        unidade = valor3dig % 10;
        valor3dig = valor3dig / 10;
        dezena = valor3dig % 10;
        valor3dig = valor3dig / 10;
        centena = valor3dig % 10;

        System.out.printf("Digito das Centenas: %d\n", centena);
        System.out.printf("Digito das Dezenas:  %d\n", dezena);
        System.out.printf("Digito das Unidades: %d\n", unidade);
        System.out.printf("%d%d%d\n", unidade, dezena, centena);
    }
}
