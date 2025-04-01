package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

        double deposito;
        double taxa;
        double rendimento;
        double total;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o depósito: ");
        deposito = sc.nextDouble();
        System.out.print("Digite a taxa: ");
        taxa = sc.nextDouble();

        rendimento = deposito * taxa / 100;
        total = deposito + rendimento;

        System.out.println("Seu rendimento é, R$ " + rendimento);
        System.out.println("O total é, R$ " + total);
    }
}
