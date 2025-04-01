package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

        double salario;
        double percentual;
        double aumento;
        double novoSalario;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu salário atual: ");
        salario = sc.nextDouble();

        System.out.print("Digite o percentual: ");
        percentual = sc.nextDouble();

        aumento = salario * percentual / 100;
        novoSalario = salario + aumento;

        System.out.println("Seu novo salário com o percentual inserido é, R$ " + novoSalario);
    }
}