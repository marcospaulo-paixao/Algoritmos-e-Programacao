package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio31 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char letra;
        char a = 'a', e = 'e', i = 'i', o = 'o', u = 'u';
        char A = 'A', E = 'E', I = 'I', O = 'O', U = 'U';

        System.out.println("Digite uma letra:");
        letra = entrada.next().charAt(0);

        if (letra == a || letra == A) {
            System.out.println("A letra digitada é uma VOGAL");

        } else if (letra == e || letra == E) {
            System.out.println("A letra digitada é uma VOGAL");

        } else if (letra == i || letra == I) {
            System.out.println("A letra digitada é uma VOGAL");

        } else if (letra == o || letra == O) {
            System.out.println("A letra digitada é uma VOGAL");

        } else if (letra == u || letra == U) {
            System.out.println("A letra digitada é uma VOGAL");

        } else {
            System.out.println("A letra digitada é uma CONSOANTE");
        }

    }

}
