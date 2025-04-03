package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

         double preco, desc, precoDesc;

         Scanner sc = new Scanner(System.in);
         System.out.print("Digite o preço do produto: ");
         preco = sc.nextDouble();

         desc = preco * 10/100;
         precoDesc = preco - desc;

         System.out.println("Desconto de 10% adicicionado, R$ " + precoDesc);
    }
}
