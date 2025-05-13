import java.util.Scanner;

// Classe principal com tudo em um só arquivo
public class MediaNotas {

    // Classe interna que representa um aluno com 4 notas
    static class Aluno {
        double nota1;
        double nota2;
        double nota3;
        double nota4;

        // Construtor
        public Aluno(double nota1, double nota2, double nota3, double nota4) {
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
            this.nota4 = nota4;
        }

        // Método que calcula a média das notas
        public double calcularMedia() {
            return (nota1 + nota2 + nota3 + nota4) / 4;
        }
    }

    public static void main(String[] args) {
        // try-with-resources garante que o Scanner será fechado automaticamente
        try (Scanner scanner = new Scanner(System.in)) {

            // Leitura das notas
            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();

            System.out.print("Digite a terceira nota: ");
            double nota3 = scanner.nextDouble();

            System.out.print("Digite a quarta nota: ");
            double nota4 = scanner.nextDouble();

            // Criação do aluno e cálculo da média
            Aluno aluno = new Aluno(nota1, nota2, nota3, nota4);
            double media = aluno.calcularMedia();

            // Exibição do resultado
            System.out.println("A média do aluno é: " + media);
        }
    }
}