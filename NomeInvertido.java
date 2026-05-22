import java.util.Scanner;

public class NomeInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = scanner.nextLine();

        char[] letras = nome.toCharArray();
        char[] invertido = new char[letras.length];

        for (int i = 0; i < letras.length; i++) {
            invertido[i] = letras[letras.length - 1 - i];
        }

        System.out.println("Nome invertido: " + new String(invertido));
        scanner.close();
    }
}
