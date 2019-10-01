package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio26 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A, B, result;

        System.out.println("Informe o Valor de A");
        A = entrada.nextInt();

        System.out.println("Informe o Valor de B");
        B = entrada.nextInt();

        result = A %= B;
        if (result == 0) {
            System.out.println("DIVISIVEL");

        } else if (result != 0) {
            System.out.println("NAO DIVISIVEL");
        }
    }

}
