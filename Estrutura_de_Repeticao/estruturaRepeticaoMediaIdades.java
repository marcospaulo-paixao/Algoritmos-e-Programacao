package algoritmos_e_programação;

import java.util.Scanner;

/**
 *
 * @author marcos
 */
public class estruturaRepeticaoMediaIdades {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String txt1 = "Informe a quantidade de pessoas a serem entrevistadas:";
        String txt2 = "Digite a idade da pessoa ";
        String txt3 = "A media das idades eh:";
        
        int cont = 1;
        int idade;
        int qntPessoas;
        double media, soma = 0;

        System.out.printf("%s\n", txt1);
        qntPessoas = entrada.nextInt();

        while (cont <= qntPessoas) {

            System.out.printf("%s %d:\n", txt2, cont);
            idade = entrada.nextInt();

            soma = soma + idade;
            cont++;
        }
        media = soma / qntPessoas;

        System.out.printf("%s,%.2f\n", txt3, media);
    }

}

