package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio04 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, quociente, resto;

        System.out.println("Dividendo:");
        num1 = entrada.nextInt();
        System.out.println("Divisor: ");
        num2 = entrada.nextInt();
        quociente = num1 / num2;
        resto = num1 %= num2;
        System.out.printf("Quociente = %d \n", quociente);
        System.out.printf("Resto = %d \n", resto);

    }
}
