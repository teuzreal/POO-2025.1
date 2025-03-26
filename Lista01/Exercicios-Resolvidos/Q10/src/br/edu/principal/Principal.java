package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

        double area;
        double raio;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o raio do circulo: ");
        raio = sc.nextDouble();

        area = 3.1415 * (raio * raio);

        System.out.println("A área do circulo é, " + area);
    }
}