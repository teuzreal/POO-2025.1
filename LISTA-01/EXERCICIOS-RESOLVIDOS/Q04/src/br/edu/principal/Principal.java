package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salário atual: ");
        double salario = sc.nextDouble();

        double aumento = salario * 25/100;
        double salarioNovo = salario + aumento;

        System.out.println("Seu salário atual é, R$ " + salarioNovo);
    }
}

