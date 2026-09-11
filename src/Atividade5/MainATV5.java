package Atividade5;

public class MainATV5 {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();

        f1.setNome("Pedro Araujo");
        f1.setIdade(18);
        f1.setEmail("pedro.santos@univel.br");
        f1.setSalario(5000);
        f1.setCargo("Dev Pleno");
        f1.setDepartamento("TI");

        if (f1.getIdade() <= 16) {
            f1.setAprendiz(true);
        } else {
            f1.setAprendiz(false);
        }

        System.out.println("Informações do Funcionário:\n");
        System.out.printf("Nome: %s\n", f1.getNome());
        System.out.printf("Idade: %d\n", f1.getIdade());
        System.out.printf("Email: %s\n", f1.getEmail());
        System.out.printf("Salario: R$ %.2f\n", f1.getSalario());
        System.out.printf("Cargo: %s\n", f1.getCargo());
        System.out.printf("Departamento: %s\n", f1.getDepartamento());
        System.out.printf("Aprendiz: %b\n", f1.isAprendiz());

    }
}
