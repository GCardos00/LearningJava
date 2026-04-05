public class Main {
    public static void main(String[] args){
        Funcionario funcionario2 = new Funcionario("João", 8500);
        funcionario2.setCargo("Desenvolvedor");

        System.out.println("Funcionario tem o cargo " + funcionario2.getCargo());
        System.out.println("Funcionario tem o nome " + funcionario2.getNome());
        System.out.println("Funcionario tem o salario " + funcionario2.getSalario());

        funcionario2.exibirInformacoes();
        funcionario2.reajustarSalario(5);
    }
}