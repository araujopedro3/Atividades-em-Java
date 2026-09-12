package Atividade7;

public class Triangulo extends FormaGeometrica {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 3;
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(3) / (4) * (lado * lado));
    }
}
