public class Main {
    public static void main(String[] args){
        Funcionario gerente = new Gerente("Mario", 15000);
        Funcionario desenvolvedor = new Desenvolvedor("Carla", 12000, "Backend Java");

        ((Gerente) gerente).setBonus(1000);
        gerente.exibirInformacoes();
        gerente.reajustarSalario(2);
        ((Gerente) gerente).aprovarProjeto("uso de IA");

        desenvolvedor.exibirInformacoes();
        desenvolvedor.reajustarSalario();
    }
}