package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio05 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        double base, altura, area, perimetro;
        System.out.println("Informe a Base do Retangulo: ");
        base = entrada.nextDouble();
        System.out.println("Informe a altura do Retangulo: ");
        altura = entrada.nextDouble();
        area = base * altura;
        perimetro = (2 * base) + (2 * altura);
        System.out.printf("A area do Retangulo é: %.2f\n", area);
        System.out.printf("O perimetro do Retangulo é: %.2f\n", perimetro);

    }
}
