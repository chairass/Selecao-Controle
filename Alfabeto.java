import java.util.Scanner;

public class Alfabeto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");

        String letra = scanner.next();

        if (letra.equalsIgnoreCase("A")
        || letra.equalsIgnoreCase("E")
        || letra.equalsIgnoreCase("I")
        || letra.equalsIgnoreCase("O")
        || letra.equalsIgnoreCase("U")){
            System.out.println("A letra é uma vogal '" + letra + "'");
        }
        else{
            System.out.println("A letra é uma consoante " + letra);
        }
    }
}
