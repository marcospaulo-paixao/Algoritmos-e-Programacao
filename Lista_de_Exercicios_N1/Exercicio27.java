package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio27 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c, menor = 0, maior = 0, inter = 0;

        System.out.println("Informe o valor de A:");
        a = entrada.nextInt();
        System.out.println("Informe o valor de B:");
        b = entrada.nextInt();
        System.out.println("Informe o valor de C:");
        c = entrada.nextInt();

        if (a < b && a < c) {
            menor = a;

        } else if (b < a && b < c) {
            menor = b;

        } else if (c < b && c < a) {
            menor = c;

        }
        if (a > b && a > c) {
            maior = a;

        } else if (b > a && b > c) {
            maior = b;

        } else if (c > b && c > a) {
            maior = c;

        }
        if (a <= b && a > c) {
            inter = a;
            maior = b;

        } else if (b < a && b >= c || c == a) {
            menor = c;
            inter = b;
            maior = a;

        } else if (c < b && c >= a) {
            inter = c;
            maior = b;
        } else if (b <= c && b > a) {
            inter = b;
            maior = c;

        }
        if (a > b && a < c) {
            inter = a;

        } else if (a < a && b > c) {
            inter = b;
        }
        System.out.printf("MENOR = %d \nINTER = %d \nMAIOR = %d\n", menor, inter, maior);
    }

}
