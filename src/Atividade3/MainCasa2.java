package Atividade3;

public class MainCasa2 {

    public static void main(String[] args) {

        Casa2 c1 = new Casa2();

        Casa2 c2 = new Casa2("Rua Paraná, 1550", 189900.00, 250, "Casa Médio Padrão");

        System.out.println("Endereço: " + c2.endereco + "\nPreço: " + c2.preco + "\nArea: " + c2.area + "\nTipo: " + c2.tipo);
    }
}
