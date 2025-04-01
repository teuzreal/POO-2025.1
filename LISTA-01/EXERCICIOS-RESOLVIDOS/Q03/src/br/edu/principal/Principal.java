package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

        double nota1, nota2, nota3;
        double peso1, peso2, peso3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite o peso da primeira nota: ");
        peso1 = sc.nextDouble();

        System.out.print("Digite sua segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.print("Digite o peso da segunda nota: ");
        peso2 = sc.nextDouble();

        System.out.print("Digite sua terceira nota: ");
        nota3 = sc.nextDouble();
        System.out.print("Digite o peso da terceira nota: ");
        peso3 = sc.nextDouble();

        double pesos = peso1 + peso2 + peso3;
        double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / pesos;

        System.out.println("Sua média ponderada é, " + media);
    }
}
