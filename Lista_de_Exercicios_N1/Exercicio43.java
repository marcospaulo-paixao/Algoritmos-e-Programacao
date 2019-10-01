package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio43 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu salario: ");
        double salario = entrada.nextDouble();
        System.out.println("Informe o código correspondente ao cargo do funcionário: ");
        int codigo = entrada.nextInt();

        double aumento1 = salario * 0.50;
        double aumento2 = salario * 0.35;
        double aumento3 = salario * 0.20;
        double aumento4 = salario * 0.10;
        double aumento5 = salario * 0.00;

        if (codigo == 1) {
            System.out.println("Cargo: Escriturario, Salario: R$ " + salario + ", Percentual de aumento: 50%, Valor do aumento: R$ " + aumento1);
        } else if (codigo == 2) {
            System.out.println("Cargo: Secretario, Salario: R$ " + salario + ", Percentual de aumento: 35%, Valor do aumento: R$ " + aumento2);
        } else if (codigo == 3) {
            System.out.println("Cargo: Caixa, Salario: R$ " + salario + ", Percentual de aumento: 20%, Valor do aumento: R$ " + aumento3);
        } else if (codigo == 4) {
            System.out.println("Cargo: Gerente, Salario: R$ " + salario + ", Percentual de aumento: 10%, Valor do aumento: R$ " + aumento4);
        } else if (codigo == 5) {
            System.out.println("Cargo: Diretor, Salario: R$ " + salario + ", Percentual de aumento: 00%, Valor do aumento: R$ " + aumento5);
        } else {
            System.out.println("Você informou um codigo não cadastrado: " + codigo);
        }
    }
}
