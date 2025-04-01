package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        double base;
        double altura;
        double area;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a base do triângulo: ");
        base = sc.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        altura = sc.nextDouble();

        area = (base * altura) / 2;

        System.out.println("A área do triângulo é, " + area);
    }
}
