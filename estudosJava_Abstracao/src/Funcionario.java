public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public void exibirInformacoes(){
        System.out.printf("Funcionario: %s - Cargo: %s - Salário: %.2f", nome, cargo, salario);
    }

    public void reajustarSalario(double percentual){
        salario += salario * (percentual / 1000 );
        System.out.printf("\n Novo salario de %s é %.2f", nome, salario);
    }
}
