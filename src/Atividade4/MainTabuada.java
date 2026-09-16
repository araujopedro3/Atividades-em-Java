package Atividade4;

import java.util.Scanner;

public class MainTabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroTabuada;
        int resultado;

        System.out.println("Bem vindo a Tabuada");
        System.out.println("\nPara comerçarmos, digite o número para receber a Tabuada dele ate o 10");
        numeroTabuada = input.nextInt();
        input.nextLine();


        for (int i = 0; i <= 10; i++) {
            resultado = numeroTabuada * i;
            System.out.printf("%d X %d: %d\n", numeroTabuada, i, resultado);
        }
    }
}
