package Atividade6;

public class CalculadoraFinanceira {

    public double calcularDesconto(double valorTotal, double percentualDesconto) {
        double valorFinal = valorTotal - (valorTotal * (percentualDesconto / 100));
        return valorFinal;
    }

    public void calcularDesconto(double valorTotal, double percentualDescontos, int parcelas) {
        double valorFinal =  valorTotal - (valorTotal * (percentualDescontos / 100));
        double valorParcela = valorFinal / parcelas;

        System.out.printf("\nValor final com desconto: R$ %.2f%n", valorFinal);
        System.out.printf("Valor de cada parcela (%dx): R$ %.2f%n", parcelas, valorParcela);
    }

}
