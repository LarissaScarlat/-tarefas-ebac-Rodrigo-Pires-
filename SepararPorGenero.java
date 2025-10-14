import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SepararPorGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Listas para armazenar os nomes por gênero
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        // Ler entrada
        System.out.println("Digite os nomes com sexo separados por vírgula (ex: Ana-F, João-M):");
        String entrada = scanner.nextLine();

        // Separar cada pessoa
        String[] pessoas = entrada.split(",");

        for (String pessoa : pessoas) {
            String[] dados = pessoa.trim().split("-"); // Separar nome e sexo
            if (dados.length == 2) {
                String nome = dados[0].trim();
                String sexo = dados[1].trim().toUpperCase();

                if (sexo.equals("M")) {
                    masculino.add(nome);
                } else if (sexo.equals("F")) {
                    feminino.add(nome);
                } else {
                    System.out.println("Sexo inválido para " + nome + ". Use M ou F.");
                }
            } else {
                System.out.println("Formato inválido: " + pessoa);
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

        scanner.close();
    }
}
