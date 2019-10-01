package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Reis
public class Exercicio21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int segundos, horas, minutos, minuto, segundosUsuario;

        System.out.println("Informe o tempo total em segundos: ");
        segundosUsuario = entrada.nextInt();

        segundos = segundosUsuario % 60;
        minutos = segundosUsuario / 60;
        minuto = minutos % 60;
        horas = minutos / 60;

        System.out.printf("%dh %dm %ds\n", horas, minuto, segundos);

    }
}
