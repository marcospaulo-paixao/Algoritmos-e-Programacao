package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio42 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //
        double a, b, c, x, y;
        int codigo;

        //
        System.out.println("Informe o código da Operação/ Formula: ");
        codigo = entrada.nextInt();

        // 
        if (codigo < 5 && codigo > 0) {
            // 
            System.out.println("Informe o valor de A: ");
            a = entrada.nextDouble();
            System.out.println("Informe o valor de B: ");
            b = entrada.nextDouble();
            System.out.println("Informe o valor de C: ");
            c = entrada.nextDouble();
            System.out.println("Informe o valor de X: ");
            x = entrada.nextDouble();
            switch (codigo) {
                case 1: {
                    double y1 = (a * Math.pow(x, 2) - b * x + c);
                    double y2 = (b * x - c);
                    y = y1 / y2;
                    if (y2 > 0) {
                        System.out.printf("Valor da operação:  %.2f\n", y);
                    } else {
                        System.out.println("Erro na operação! \n");
                    }
                    break;
                }
                case 2:
                    y = (a * Math.pow(x, 2) + b * x + c);
                    System.out.printf("Valor da operação:  %.2f\n", y);
                    break;
                case 3: {
                    double y1 = (a * x + c * Math.pow(x, 3));
                    double y2 = (4 * x);
                    y = y1 / y2;
                    if (y2 != 0) {
                        System.out.printf("Valor da operação:  %.2f\n", y);
                    } else {
                        System.out.println("Erro na operação! \n");
                    }
                    break;
                }
                case 4:
                    y = (b * Math.pow(x, 4) - 1);
                    System.out.printf("Valor da operação:  %.2f\n", y);
                    break;
                default:
                    System.out.printf("Erro! Você informou um código invalido! Código: %s\n", codigo);
                    break;
            }
        } else {
            System.out.printf("Erro! Você informou um código invalido! Código: %s.\n A sequencia de codigos é:\n Código: 1 Operação: Y = (AX^2 - BX + C)/(BX - C) ||\n "
                    + "Código: 2 Operação: Y = AX^2 + BX + C ||\n "
                    + "Código: 3 Operação: Y = (AX + CX^3)/(4X) ||\n"
                    + " Código: 4 Operação: Y = BX^4 - 1\n",
                     codigo);
        }
    }
}
