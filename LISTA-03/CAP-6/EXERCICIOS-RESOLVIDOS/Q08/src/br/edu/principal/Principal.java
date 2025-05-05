package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        int[] X = new int[5];
        int[] Y = new int[5];
        int[] R = new int[10];
        int i, j, aux;

        Scanner sc = new Scanner(System.in);

        for(i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número para o vetor X: ");
            X[i] = sc.nextInt();
        } for(i = 0; i < 4; i++) {
            for(j = 0; j < 5 - i - 1; j++) {
                if(X[j] > X[j + 1]) {
                    aux = X[j];
                    X[j] = X[j + 1];
                    X[j + 1] = aux;
                }
            }
        } for(i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número para o vetor Y: ");
            Y[i] = sc.nextInt();
        } for(i = 0; i < 4; i++) {
            for(j = 0; j < 5 - i - 1; j++) {
                if(Y[j] > Y[j + 1]) {
                    aux = Y[j];
                    Y[j] = Y[j + 1];
                    Y[j + 1] = aux;
                }
            }
        } int k = 0;
        for(i = 0; i < 5; i++) {
            R[k] = X[i];
            k++;
            R[k] = Y[i];
            k++;
        } for(i = 0; i < 9; i++) {
            for(j = 0; j < 10 - i - 1; j++) {
                if(R[j] > R[j + 1]) {
                    aux = R[j];
                    R[j] = R[j + 1];
                    R[j + 1] = aux;
                }
            }
        }
        System.out.print("Vetor X: ");
        for(i = 0; i < 5; i++) {
            System.out.print(X[i]);
            if(i < 4) {
                System.out.print(" - ");
            }
        }
        System.out.println();
        System.out.print("Vetor Y: ");
        for(i = 0; i < 5; i++) {
            System.out.print(Y[i]);
            if(i < 4) {
                System.out.print(" - ");
            }
        }
        System.out.println();
        System.out.print("Vetor R: ");
        for(i = 0; i < 10; i++) {
            System.out.print(R[i]);
            if(i < 9) {
                System.out.print(" - ");
            }
        }
        System.out.println();
    }
}