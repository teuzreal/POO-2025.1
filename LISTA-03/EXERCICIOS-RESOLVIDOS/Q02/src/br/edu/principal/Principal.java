package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        int[] qtd = new int[10];
        double[] preco = new double[10];
        double totGeral = 0, totVend, comissao;
        int maior, ind;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a quantidade vendida do objeto " + (i + 1) + ": ");
            qtd[i] = sc.nextInt();
            System.out.print("Digite o preço do objeto " + (i + 1) + ": R$ ");
            preco[i] = sc.nextDouble();
        }

        System.out.println("Relatório de Vendas: ");
        for (int i = 0; i < 10; i++) {
            totVend = qtd[i] * preco[i];
            System.out.println("Objeto " + (i + 1) + " - Quantidade: " + qtd[i] + " | Preço: R$ " + preco[i] + " | Total: R$ " + totVend);
            totGeral += totVend;
        }

        comissao = totGeral * 5 / 100;
        System.out.println("Valor total das vendas: R$ " + totGeral);
        System.out.println("Comissão (5%): R$ " + comissao);

        maior = qtd[0];
        ind = 0;

        for (int i = 1; i < 10; i++) {
            if (qtd[i] > maior) {
                maior = qtd[i];
                ind = i;
            }
        }
        System.out.println("");
        System.out.println("Objeto mais vendido: Objeto " + (ind + 1));
        System.out.println("Quantidade vendida: " + maior);
        System.out.println("Valor unitário: R$ " + preco[ind]);
    }
}