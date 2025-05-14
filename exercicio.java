public class exercicio {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int valorPrimitivo = scanner.nextInt();

        Integer valorWrapper = valorPrimitivo; // autoboxing
        System.out.println("Valor como tipo Wrapper (Integer): " + valorWrapper);

        scanner.close();
    }
}
