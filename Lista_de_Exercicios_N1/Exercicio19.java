package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Reis
public class Exercicio19 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        float distancia, tempo, velocidade, litrosUsados;

        System.out.println("Informe a velocidade: ");
        velocidade = entrada.nextFloat();
        System.out.println("Informe o tempo(hrs):");
        tempo = entrada.nextFloat();

        distancia = tempo * velocidade;

        litrosUsados = distancia / 12;

        System.out.printf("Velocidade Média: %.2f\n", velocidade);
        System.out.printf("Tempo: %.2f\n", tempo);
        System.out.printf("Distância Percorrida: %.2f\n", distancia);
        System.out.printf("Quantidade de Litros utilizado na viagem: %.2f\n", litrosUsados);

    }
}
