import java.util.Random;
import java.util.Scanner;

public class Rifas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite a quantidade maxima de bilhetes: ");
        int qtdBilhetes = scanner.nextInt();

        System.out.print("Digite o numero do seu bilhete (entre 1 " + qtdBilhetes + "): ");
        int bilhete = scanner.nextInt();

        int sorteado = random.nextInt(qtdBilhetes) + 1;

        System.out.println("O numero sorteado: " + sorteado);

        if (bilhete == sorteado){
            System.out.println("Você ganhou a aposta");
        }
        else {
            System.out.println("Não foi dessa vez");
        }
    }
}
