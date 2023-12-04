package Java04;
import java.util.Scanner;

public class Pratica02{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine().trim();

        scanner.close();

        if (texto.isEmpty()) {
            System.out.println("O texto está vazio.");
        } else {
            String[] palavras = texto.split("\\s+");
            int numeroPalavras = palavras.length;

            System.out.println("Numero de palavras: " + numeroPalavras);
        }
    }
}