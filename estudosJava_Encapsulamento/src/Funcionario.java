public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private int controleReajuste = 0;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    //Seção de getters
    public String getCargo(){
        return cargo;
    }

    public  String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    //Seção de setters
    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public void exibirInformacoes(){
        System.out.printf("Funcionario: %s - Cargo: %s - Salário: %.2f", nome, cargo, salario);
    }

    public void reajustarSalario(double percentual){

        //Controle para que não possa ter mais de um reajuste
        if (controleReajuste >= 1){
            System.out.println("Salário já reajustado");
        } else {
            controleReajuste++;
            salario += salario * (percentual / 1000);
            System.out.printf("\n Novo salario de %s é %.2f", nome, salario);
        }

    }
}
