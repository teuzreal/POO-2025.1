package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        int[] voo = new int[13];
        int[] lugares = new int[13];
        String[] origem = new String[13];
        String[] destino = new String[13];

        Scanner sc = new Scanner(System.in);
        int i, op, op2, nVoo;
        String local;

        for (i = 1; i <= 12; i++) {
            System.out.print("Digite o número do voo: ");
            voo[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite a origem do voo: ");
            origem[i] = sc.nextLine();
            System.out.print("Digite o destino do voo: ");
            destino[i] = sc.nextLine();
            System.out.print("Digite a quantidade de lugares: ");
            lugares[i] = sc.nextInt();
            sc.nextLine();
        }

        do {
            System.out.println("1 - Consultar");
            System.out.println("2 - Reservar");
            System.out.println("3 - Finalizar");
            System.out.print("Digite sua opção: ");
            op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.println("1 - Consulta por voo");
                System.out.println("2 - Consulta por origem");
                System.out.println("3 - Consulta por destino");
                System.out.print("Digite sua opção: ");
                op2 = sc.nextInt();
                sc.nextLine();

                if (op2 == 1) {
                    System.out.print("Digite o número do voo: ");
                    nVoo = sc.nextInt();
                    sc.nextLine();
                    i = 1;
                    while (i <= 12 && voo[i] != nVoo) {
                        i++;
                    } if (i > 12) {
                        System.out.println("Voo inexistente!");
                    } else {
                        System.out.println("Número do voo: " + voo[i]);
                        System.out.println("Origem: " + origem[i]);
                        System.out.println("Destino: " + destino[i]);
                        System.out.println("Lugares disponíveis: " + lugares[i]);
                    }
                } if (op2 == 2) {
                    System.out.print("Digite o local de origem: ");
                    local = sc.nextLine();
                    for (i = 1; i <= 12; i++) {
                        if (local.equals(origem[i])) {
                            System.out.println("Número do voo: " + voo[i]);
                            System.out.println("Origem: " + origem[i]);
                            System.out.println("Destino: " + destino[i]);
                            System.out.println("Lugares disponíveis: " + lugares[i]);
                        }
                    }
                } if (op2 == 3) {
                    System.out.print("Digite o local de destino: ");
                    local = sc.nextLine();
                    for (i = 1; i <= 12; i++) {
                        if (local.equals(destino[i])) {
                            System.out.println("Número do voo: " + voo[i]);
                            System.out.println("Origem: " + origem[i]);
                            System.out.println("Destino: " + destino[i]);
                            System.out.println("Lugares disponíveis: " + lugares[i]);
                        }
                    }
                }
            } if (op == 2) {
                System.out.print("Digite o número do voo desejado: ");
                nVoo = sc.nextInt();
                sc.nextLine();
                i = 1;
                while (i <= 12 && voo[i] != nVoo) {
                    i++;
                } if (i > 12) {
                    System.out.println("Número do voo não encontrado!");
                } else {
                    if (lugares[i] == 0) {
                        System.out.println("Voo lotado!");
                    } else {
                        lugares[i]--;
                        System.out.println("Reserva confirmada!");
                    }
                }
            }
        } while (op != 3);
    }
}