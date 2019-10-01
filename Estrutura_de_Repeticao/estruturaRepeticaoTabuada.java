package algoritmos_e_programação;

import java.util.Scanner;
/**
 * 
 * @author marcos
 */
public class estruturaRepeticaoTabuada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String digiteUmNumero = "Digite um numero: ";

        int n;
        int c = 1;//Inicialização

        System.out.printf("%s\n", digiteUmNumero);
        n = entrada.nextInt();

        while (c <= 10) {//Condição de Parada

            System.out.printf("\n%d X %d = %d\n", n, c, n * c);
            c++;//Incremento

        }

    }

}
