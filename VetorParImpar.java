import java.util.Scanner;

public class VetorParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números deseja inserir? ");
        int n = scanner.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Aplica a regra par/ímpar
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                vetor[i] = vetor[i] * 2;
            } else {
                vetor[i] = (int) Math.pow(vetor[i], 2);
            }
        }

        System.out.print("\nNovo vetor: [");
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");

        scanner.close();
    }
}
