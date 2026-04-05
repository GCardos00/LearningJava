import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){

        /*
        Código de Estudo:
        //Utiliza ordenação e permite duplicidade
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("João");

        System.out.println(funcionarios);

        //Não permite duplicidade e não utiliza ordenação
        Set<String> produtos = new HashSet<>();
        produtos.add("Água");
        produtos.add("Coca-Cola");

        System.out.println(produtos);

        //Sobrescreve os valores dependendo do valor ID
        Map<Integer, String> cliente = new HashMap<>();
        cliente.put(1, "Maria");
        cliente.put(2, "Marcos");
        cliente.put(3, "Ana");

        System.out.println(cliente);
         */

        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda");

        List<String> funcionariosLetraA = funcionarios.stream()
                .filter(f -> f.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(funcionarios);
        System.out.println(funcionariosLetraA);

        List<Double> valorVendas = List.of(500.0, 1800.0, 6200.0);
        List<Double> comissao = valorVendas.stream()
                .map(v -> v *0.5)
                .collect(Collectors.toList());

        System.out.println(valorVendas);
        System.out.println(comissao);

        double totalVendas = valorVendas.stream()
                .reduce(0.0, Double::sum);

        System.out.println("Total vendas: " + totalVendas);
    }
}
