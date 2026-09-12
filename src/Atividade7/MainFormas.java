package Atividade7;

public class MainFormas {
    public static void main(String[] args) {

        System.out.println("Seja bem vindo ao calculador de Formas Geométricas!");

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(5);
            double perimetroQ = quadrado.calcularPerimetro();
            double areaQ = quadrado.calcularArea();
        System.out.printf("\nQuadrado - Perímetro: %.2f, Área: %.2f%n", perimetroQ, areaQ);

        Triangulo triangulo = new Triangulo();
        triangulo.setLado(8);
            double perimetroT = triangulo.calcularPerimetro();
            double areaT = triangulo.calcularArea();
        System.out.printf("\nO Triangulo - Perímetro: %.2f, Área: %.2f%n", perimetroT, areaT);

        Circulo circulo = new Circulo();
        circulo.setRaio(15);
            double perimetroC = circulo.calcularPerimetro();
            double areaC = circulo.calcularArea();
        System.out.printf("\nO Circulo - Perímetro: %.2f, Área: %.2f%n", perimetroC, areaC);

    }
}
