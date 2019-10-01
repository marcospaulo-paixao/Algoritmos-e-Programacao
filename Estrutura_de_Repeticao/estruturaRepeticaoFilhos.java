package algoritmos_e_programação;

import java.util.Scanner;

/**
 *
 * @author marcos
 */
public class estruturaRepeticaoFilhos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String txt1 = "Quantos filhos a pessoa";
        String txt2 = "Quantidade de Filhos inválido, informe novamente!!!";
        String txt3 = "pessoas possuem até 2 filhos.";
        String txt4 = "pessoas possuem mais de 2 filhos";

        int filhos;
        int filhosAte2 = 0;
        int filhosMais2 = 0;
        int cont = 1;

        while (cont <= 20) {
            System.out.printf("%s %d tem?\n", txt1, cont);
            filhos = entrada.nextInt();

            while (filhos < 0) {
                System.out.printf("%s\n", txt2);
                filhos = entrada.nextInt();

            }
            if (filhos >= 0 && filhos < 2) {
                filhosAte2++;

            } else {
                filhosMais2++;
            }
            cont++;
        }
        System.out.printf("%d %s\n", filhosAte2, txt3);
        System.out.printf("%d %s\n", filhosMais2, txt4);
    }

}
