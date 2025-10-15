import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgruparPorSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Listas para armazenar os nomes por sexo
        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();

            // Encerra o loop se o usuário digitar "sair"
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo (M/F): ");
            String sexo = scanner.nextLine();

            // Verifica e adiciona à lista correspondente
            if (sexo.equalsIgnoreCase("M")) {
                masculinos.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                femininos.add(nome);
            } else {
                System.out.println("Sexo inválido! Use M para masculino ou F para feminino.");
            }
        }

        // Exibe os resultados
        System.out.println("\n--- Grupo Masculino ---");
        for (String nome : masculinos) {
            System.out.println(nome);
        }

        System.out.println("\n--- Grupo Feminino ---");
        for (String nome : femininos) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
