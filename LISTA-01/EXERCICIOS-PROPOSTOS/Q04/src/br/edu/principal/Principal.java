package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

        double nota1, nota2;
        double pesos, media;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        nota2 = sc.nextDouble();

        pesos = 2 + 3;
        media = (nota1 * 2 + nota2 * 3) / pesos;

        System.out.println("A sua média ponderada é, " + media);
    }
}
