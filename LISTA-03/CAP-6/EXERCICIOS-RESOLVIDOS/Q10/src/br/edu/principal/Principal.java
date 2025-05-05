package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] gabarito = new String[10];
        String[] resposta = new String[10];
        int num, pontos, totAp = 0;
        double percAp;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a resposta da questão " + (i + 1) + ": ");
            gabarito[i] = sc.nextLine();
        } for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número do " + (i + 1) + "º aluno: ");
            num = sc.nextInt();
            sc.nextLine();
            pontos = 0;

            for (int j = 0; j < 10; j++) {
                System.out.print("Digite a resposta dada pelo aluno " + num + " à " + (j + 1) + "ª questão: ");
                resposta[j] = sc.nextLine().toUpperCase();
                if (resposta[j].equals(gabarito[j])) {
                    pontos++;
                }
            }
            System.out.println("A nota do aluno " + num + " foi " + pontos);
            if (pontos >= 6) {
                totAp++;
            }
        }
        percAp = totAp * 100 / 10;
        System.out.println("O percentual de alunos aprovados é " + percAp + "%");
    }
}