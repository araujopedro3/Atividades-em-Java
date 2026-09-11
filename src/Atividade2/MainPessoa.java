package Atividade2;

import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pessoa p1 = new Pessoa();

        System.out.println("-- Olá Usuário --");
        System.out.println("\nDigite seu nome: ");
        String nome = input.nextLine();

        System.out.println("\nE insira sua Idade para verificar se você");
        System.out.println("É apto para ter carteira de Motorista (CNH)");
        int idade = input.nextInt();

        p1.setNome(nome);
        p1.setIdade(idade);

        System.out.printf("\nOlá %s!, voce tem %d anos!", nome, idade);

        if (p1.getIdade() < 18) {
            System.out.println("Infelizmente você não pode tirar sua CNH ainda");
        } else {
            System.out.println("\ne Você pode tirar sua CNH!!");
        }

    input.close();
    }
}
