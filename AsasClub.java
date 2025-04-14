import java.util.Scanner;


public class AsasClub {
    public static void main(String[] args) {
        System.out.println("Digite o valor do ingresso: ");
        Scanner scanner = new Scanner(System.in);
        double valorIngresso = scanner.nextDouble();

        System.out.println("Informe o sexo do cliente:\n M: Masculino   F: Feminino");
        String sexo = scanner.next();
        boolean isFeminino = sexo.equalsIgnoreCase("F");
        boolean isMasculino = sexo.equalsIgnoreCase("M");

        System.out.println("Informe a hora da entrada (0 a 23):");
        int horas = scanner.nextInt();

        double valorFinal;

        if (isFeminino){
            if (horas < 22){
                System.out.println("Entrada gratuita");
            } else {
                valorFinal = valorIngresso * 0.5;
                System.out.printf("O valor do ingresso é R$ %.2f", valorFinal);
            }
        }
        else if (isMasculino){
         if (horas < 22){
             valorFinal = valorIngresso * 0.7;
             System.out.printf("O valor do ingresso é R$ %.2f", valorFinal);
         }
         else {
             System.out.printf("Desconto encerrado, o valor do ingresso integral R$ %.2f", valorIngresso);
         }
        }
        else {
            System.out.println("Sexo invalido. Digite 'M' para masculino e 'F' para feminino");
        }
    }
}
