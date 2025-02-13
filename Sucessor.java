import java.awt.*;
import java.util.Scanner;

public class Sucessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSomado;

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o sucessor dele: ");
        int sucessor = scanner.nextInt();

        numeroSomado = numero + 1;
        if (numero + 1 == sucessor) {
            System.out.printf("O número "+sucessor+ " é sucessor de "+numero);
        } else {
            System.out.printf("O número "+sucessor+ " não é sucessor de "+numero);
        }
    }
}