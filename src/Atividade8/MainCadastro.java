package Atividade8;

import java.util.Scanner;

public class MainCadastro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nomeAluno;
        int idadeAluno;
        double rendaFamiliar;
        boolean auxilioEstudantil;
        String projetoExtensao;

        String nomeProfessor;
        int anosExperiencia;
        String temPos;
        boolean temPosGraduacao;
        String ehBacharel;
        boolean bacharel;

        int opcao;

        do {
            System.out.println("--- Sistema de Cadastro Escolar ---");
            System.out.println("- Escolha qual com opção você deseja prosseguir:");
            System.out.println("\n1 - Cadastrar um novo Aluno");
            System.out.println("2 - Cadastrar um novo Professor");
            System.out.println("3 - Sair");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do aluno:");
                    nomeAluno = input.nextLine();
                    System.out.println("Digite a idade do aluno:");
                    idadeAluno = input.nextInt();
                    input.nextLine();
                    if (idadeAluno >= 16 && idadeAluno <= 99) {
                        System.out.printf("O aluno %s pode se matricular no Ensino Superior", nomeAluno);
                        System.out.println("\nO aluno participa do Projeto de Extensão? (S) ou (N)");
                        projetoExtensao = input.nextLine();

                        if (projetoExtensao.equalsIgnoreCase("S")) {
                            auxilioEstudantil = true;
                        } else {
                            auxilioEstudantil = false;
                        }
                        System.out.println("Digite a renda familiar do Aluno: ");
                        rendaFamiliar = input.nextDouble();
                        if (rendaFamiliar < 1500 || auxilioEstudantil) {
                            System.out.printf("O aluno %s tem direito ao programa de Auxilío Estudantil!", nomeAluno);
                        } else {
                            System.out.println("O aluno não tem direito ao Auxilío Estudantil");
                        }

                        System.out.println("\nAluno cadastrado com sucesso!\n");

                    } else {
                        System.out.printf("O aluno %s não pode se matricular no Ensino Superior", nomeAluno);
                    }
                    break;

                case 2:
                    System.out.println("Digite o nome do professor:");
                    nomeProfessor = input.nextLine();
                    System.out.printf("O Professor %s, tem quantos anos de Experiência?:", nomeProfessor);
                    anosExperiencia = input.nextInt();
                    input.nextLine();
                    System.out.println("Tem Pós Graduação? (S) ou (N)");
                    temPos = input.nextLine();

                    if (temPos.equalsIgnoreCase("S")) {
                        temPosGraduacao = true;
                    } else {
                        temPosGraduacao = false;
                    }

                    System.out.println("É Bacharel? (S) ou (N)");
                    ehBacharel = input.nextLine();

                    if (ehBacharel.equalsIgnoreCase("S")) {
                        bacharel = true;
                    } else {
                        bacharel = false;
                    }

                    if (anosExperiencia > 2 && (temPosGraduacao || bacharel)) {

                        System.out.println("Professor cadastrado na modalidade Efetivo!\n");
                    } else {
                        System.out.println("Professor cadastrado na modalidade Temporário\n");
                    }

                    System.out.println("Professor cadastrado com sucesso!\n");
                    break;

                case 3:
                    System.out.println("Programa finalizado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 3);

        input.close();
    }
}