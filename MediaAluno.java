import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Entrada das notas
            System.out.print("Digite a primeira nota: ");
            double n1 = sc.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double n2 = sc.nextDouble();

            System.out.print("Digite a terceira nota: ");
            double n3 = sc.nextDouble();

            System.out.print("Digite a quarta nota: ");
            double n4 = sc.nextDouble();

            // Cálculo da média
            double media = (n1 + n2 + n3 + n4) / 4;

            // Saída da média
            System.out.println("Média final: " + media);

            // Estrutura condicional
            if (media >= 7) {
                System.out.println("Aluno aprovado!");
            } else if (media >= 5) {
                System.out.println("Aluno em recuperação.");
            } else {
                System.out.println("Aluno reprovado.");
            }
        }
    }
}
