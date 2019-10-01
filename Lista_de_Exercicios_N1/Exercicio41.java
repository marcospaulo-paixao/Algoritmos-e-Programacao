package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio41 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int residencial = 1, comercial = 2, industrial = 3;
        int consumidor, consumo = (int) (20 * 0.3);

        System.out.println("Informe o tipo de consumidor 1-Residencial | 2-Comercial | 3-Industrial: ");
        consumidor = entrada.nextInt();

        if (consumidor == 1) {
            double conta = 5 + (0.05 * consumo);
            System.out.printf("A conta a ser paga é: %.2f\n", conta);
        } else if (consumidor == 2) {
            if (consumo < 80) {
                double conta = 500;
                System.out.printf("A conta a ser paga é: %.2f\n", conta);
            } else {
                double conta = 500 + (0.25 * consumo);
                System.out.printf("A conta a ser paga é: %.2f\n", conta);
            }
        } else if (consumidor == 3) {
            if (consumo < 100) {
                double conta = 800;
                System.out.printf("A conta a ser paga é: %.2f\n", conta);
            } else {
                double conta = 500 + (0.04 * consumo);
                System.out.printf("A conta a ser paga é: %.2f\n", conta);
            }
        } else {
            System.out.println("Erro no Codigo!");
        }
    }
}
