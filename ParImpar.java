import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jogador 1, escolha um numero de dedos 0 a 5 ");
        int jogador1 = scanner.nextInt();

        System.out.println("Jogador 2, escolha um numero de dedos 0 a 5 ");
        int jogador2 = scanner.nextInt();

        if (jogador1 >= 0 && jogador1 <= 5 && jogador2 >= 0 && jogador2 <= 5) {
            int soma = jogador1 + jogador2;
            String resultado;

            if (soma % 2 == 0) {
                resultado = "par";
            } else {
                resultado = "ímpar";
            }

            System.out.println("A soma dos dedos é " + soma + ", que é " + resultado + ".");
        } else {
            System.out.println("Número inválido! Escolha um valor entre 0 e 5.");
        }

    }
}
