package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Reis
public class Exercicio23 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int hora;

        System.out.println("Informe a hora:");
        hora = entrada.nextInt();

        int total = hora * 60;

        System.out.printf("Passaram %d minuto(s) desde o inicio do dia.\n", total);

    }
}
