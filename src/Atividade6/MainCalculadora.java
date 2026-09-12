package Atividade6;

public class MainCalculadora {
    public static void main(String[] args) {

        System.out.println("Seja bem vindo a calculadora!");

        CalculadoraFinanceira calculadora = new CalculadoraFinanceira();

        System.out.println("\nO valor da compra é: ");
        double resultado = calculadora.calcularDesconto(1000, 15);
        System.out.printf("R$ %.2f%n", resultado);

        System.out.println("\nE o valor da segunda Compra parcelada é: ");
        calculadora.calcularDesconto(500, 15, 10);
    }
}
