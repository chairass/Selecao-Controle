import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura do dia: ");
        float temperatura = scanner.nextFloat();

        if (temperatura <= 17){
            System.out.println("Frio da moléstia");
        }
        else {
            System.out.println("Tudo normal nas terras de Cuçumarim");
        }
    }
}
