import java.util.Scanner;

public class Avaliacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Para saber sua media informe a nota das provas");

        System.out.print("Prova 1: ");
        float prova1 = scanner.nextFloat();

        System.out.print("Prova 2: ");
        float prova2 = scanner.nextFloat();

        System.out.print("Prova 3: ");
        float prova3 = scanner.nextFloat();

        float media = (prova1 + prova2 + prova3) / 3;

        if (media >= 7){
            System.out.println("Parabéns, você está aprovado!");
        }
        else {
            System.out.println("Poxa, dessa vez você ficou em recuperação...");
        }
    }
}
