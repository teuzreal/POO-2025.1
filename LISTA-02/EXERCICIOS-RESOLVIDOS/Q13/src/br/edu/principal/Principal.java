package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        int n, num, i, j, fat;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantos números quer calcular o fatorial: ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.print("Digite o número inteiro positivo: ");
            num = sc.nextInt();
            fat = 1;

            for (j = 1; j <= num; j++) {
                fat = fat * j;
            }
            System.out.println("Número: " + num + " | O fatorial é, " + fat);
        }
    }
}
