package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        int[] X = new int[10];
        int[] Y = new int[10];
        int[] U = new int[20];
        int[] D = new int[10];
        int[] S = new int[10];
        int[] P = new int[10];
        int[] IT = new int[10];
        int contU = 0, contD = 0, contI = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número para X: ");
            X[i] = sc.nextInt();
            System.out.print("Digite o " + (i + 1) + "º número para Y: ");
            Y[i] = sc.nextInt();
        } for (int i = 0; i < 10; i++) {
            int j = 0;
            while (j < contU && X[i] != U[j]) {
                j++;
            } if (j >= contU) {
                U[contU] = X[i];
                contU++;
            }
        } for (int i = 0; i < 10; i++) {
            int j = 0;
            while (j < contU && Y[i] != U[j]) {
                j++;
            } if (j >= contU) {
                U[contU] = Y[i];
                contU++;
            }
        }
        System.out.println("");

        System.out.println("União:");
        for (int i = 0; i < contU; i++) {
            System.out.println((i + 1) + "º valor: " + U[i]);
        } for (int i = 0; i < 10; i++) {
            int j = 0;
            while (j < 10 && X[i] != Y[j]) {
                j++;
            } if (j == 10) {
                int k = 0;
                while (k < contD && X[i] != D[k]) {
                    k++;
                } if (k >= contD) {
                    D[contD] = X[i];
                    contD++;
                }
            }
        }
        System.out.println("");

        System.out.println("Diferença (X - Y):");
        for (int i = 0; i < contD; i++) {
            System.out.println((i + 1) + "º valor: " + D[i]);
        } for (int i = 0; i < 10; i++) {
            S[i] = X[i] + Y[i];
            P[i] = X[i] * Y[i];
        }
        System.out.println("");

        System.out.println("Soma dos elementos (X + Y):");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "º valor: " + S[i]);
        }
        System.out.println("");

        System.out.println("Produto dos elementos (X * Y):");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "º valor: " + P[i]);
        } for (int i = 0; i < 10; i++) {
            int j = 0;
            while (j < 10 && X[i] != Y[j]) {
                j++;
            } if (j < 10) {
                int k = 0;
                while (k < contI && IT[k] != X[i]) {
                    k++;
                } if (k >= contI) {
                    IT[contI] = X[i];
                    contI++;
                }
            }
        }
        System.out.println("");
        System.out.println("Interseção:");
        for (int i = 0; i < contI; i++) {
            System.out.println((i + 1) + "º valor: " + IT[i]);
        }
    }
}