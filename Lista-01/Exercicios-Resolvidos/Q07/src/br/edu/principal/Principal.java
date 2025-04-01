package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

        double salario;
        double salReceber;
        double grat;
        double imposto;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu salário atual: ");
        salario = sc.nextDouble();

        grat = salario * 5/100;
        imposto = salario * 10/100;
        salReceber = salario + grat - imposto;

        System.out.println("Seu salário a receber é, R$ " + salReceber);

    }
}
