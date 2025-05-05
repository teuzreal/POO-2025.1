package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        int[] vtr = new int[8];
        int i = 0, j, z, aux;

        Scanner sc = new Scanner(System.in);

        while(i < 8){
            System.out.print("Digite o " + (i + 1) + "º número pro vetor: ");
            aux = sc.nextInt();

            j = 0;
            while(j < i && vtr[j] < aux){
                j++;
            }
            z = i;
            while(z > j){
                vtr[z] = vtr[z - 1];
                z--;
            }
            vtr[j] = aux;
            i++;
        } for(i = 0; i < 8; i++){
            System.out.print(vtr[i]);
            if (i < 7) {
                System.out.print(" - ");
            }
        }
    }
}