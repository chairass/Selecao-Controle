import java.util.Scanner;

public class Cores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nivel de cinza (0 a 255): ");
        int cinza = scanner.nextInt();

        if(cinza < 0 || cinza > 255){
            System.out.println("Digite um numero válido");
        }
        else {
            if (cinza < 128){
                System.out.println("É um tom escuro");
            }
            else {
                System.out.println("É um tom claro");
            }
        }
    }
}
