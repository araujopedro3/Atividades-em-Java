package Atividade7;

public class Quadrado extends FormaGeometrica {
    private double  lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
