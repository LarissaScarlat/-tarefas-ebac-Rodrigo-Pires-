import java.util.Arrays;
import java.util.Scanner;

public class OrdenaNomes {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // 1. Ler nomes separados por vírgula
            System.out.println("Digite os nomes separados por vírgula:");
            String entrada = scanner.nextLine();

            // 2. Separar os nomes
            String[] nomes = entrada.split(",");

            // Remover espaços antes/depois de cada nome
            for (int i = 0; i < nomes.length; i++) {
                nomes[i] = nomes[i].trim();
            }

            // 3. Ordenar os nomes em ordem alfabética
            Arrays.sort(nomes);

            // 4. Imprimir no console
            System.out.println("Nomes ordenados:");
            for (String nome : nomes) {
                System.out.println(nome);
            }
        }
    }
}
