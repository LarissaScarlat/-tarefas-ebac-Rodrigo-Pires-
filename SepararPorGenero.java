import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SepararPorGenero {
    public static void main(String[] args) {
        // Listas para armazenar os nomes por gênero
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        // Ler entrada
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite os nomes com sexo separados por vírgula (ex: Ana-F, João-M):");
            String entrada = scanner.nextLine();

            // Separar cada pessoa
            String[] pessoas = entrada.split(",");

            for (String pessoa : pessoas) {
                String[] dados = pessoa.trim().split("-"); // Separar nome e sexo
                if (dados.length == 2) {
                    String nome = dados[0].trim();
                    String sexo = dados[1].trim().toUpperCase();

                    switch (sexo) {
                        case "M":
                            masculino.add(nome);
                            break;
                        case "F":
                            feminino.add(nome);
                            break;
                        default:
                            System.out.println("Sexo inválido para " + nome + ". Use M ou F.");
                            break;
                    }
                } else {
                    System.out.println("Formato inválido: " + pessoa);
                }
            }
        }

        // Imprimir os grupos
        System.out.println("\nGrupo Feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }

        System.out.println("\nGrupo Masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }
    }
}
