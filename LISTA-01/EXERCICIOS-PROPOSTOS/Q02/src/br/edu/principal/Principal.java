package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

        double n1, n2, n3, mult;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextDouble();
        System.out.print("Digite o terceiro número: ");
        n3 = sc.nextDouble();

        mult = n1 * n2 * n3;
        System.out.println("A multiplicação dos três números é, " + mult);
    }
}
