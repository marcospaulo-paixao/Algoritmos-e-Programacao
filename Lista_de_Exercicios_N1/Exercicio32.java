package listadeexerciciosn1;

import java.util.Scanner;

// @author Marcos Paulo Pereira & Anisberto dos Rei
public class Exercicio32 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double mediaAluno;

        System.out.println("Informe a sua media na disciplina.");
        mediaAluno = entrada.nextDouble();

        if (mediaAluno >= 0 && mediaAluno <= 4.9) {
            System.out.println("O conceito na disciplina é D");
        } else if (mediaAluno >= 5 && mediaAluno <= 6.9) {
            System.out.println("O conceito na disciplina é C");
        } else if (mediaAluno >= 7 && mediaAluno <= 8.9) {
            System.out.println("O conceito na disciplina é B");
        } else if (mediaAluno >= 9 && mediaAluno <= 10) {
            System.out.println("O conceito na disciplina é A");
        } else {
            System.out.println("Error!!!\nEsta nota não está no conceito da disciplina");
        }

    }
}
