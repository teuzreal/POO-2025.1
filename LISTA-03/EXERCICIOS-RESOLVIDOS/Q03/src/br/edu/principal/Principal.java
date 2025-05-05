package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        int[] vtr1 = new int[10];
        int[] vtr2 = new int[10];
        int[] vtr3 = new int[20];

        int i, j = 0;

        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número pro primeiro vetor: ");
            vtr1[i] = sc.nextInt();
            vtr3[j] = vtr1[i];
            j++;

            System.out.print("Digite o " + (i + 1) + "º número pro segunddo vetor: ");
            vtr2[i] = sc.nextInt();
            vtr3[j] = vtr2[i];
            j++;
        }
        System.out.println(" ");
        System.out.println("Vetor intercalado:");

        for (i = 0; i < 20; i++) {
            if (i < 19) {
                System.out.print((i + 1) + ": " + vtr3[i] + " | ");
            } else {
                System.out.print((i + 1) + ": " + vtr3[i]);
            }
        }
    }
}