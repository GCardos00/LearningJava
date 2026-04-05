public abstract class Funcionario {
    protected String nome;
    protected double salario;
    private int controleReajuste = 0;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    //Seção de getters
    public  String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    public void exibirInformacoes(){
        System.out.printf("Funcionario: %s - Salário: %.2f", nome, salario);
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

    public void reajustarSalario(){
        salario += 500;
        System.out.printf("\n Salario com dissidio de %s é %.2f", nome, salario);
    }

    public abstract void calcularPLR();

}
