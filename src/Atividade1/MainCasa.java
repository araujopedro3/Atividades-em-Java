package Atividade1;

public class MainCasa {
    public static void main(String[] args) {
        Casa c1 = new Casa();
        Casa c2 = new Casa();

        c1.preco = 350000;
        c1.area = 125.0;

        c2.preco = 150000;
        c2.area = 95.0;

        double valorMetroQuadrado = c1.preco / c1.area;
        double valorMetroQuadrado2 = c2.preco / c2.area;

        System.out.printf("O valor por metro quadrado da casa é: %.2f ", valorMetroQuadrado);
        System.out.printf("\nO valor por metro quadrado da casa 2 é: %.2f ", valorMetroQuadrado2);
    }
}
