import java.util.Scanner;

public class IBGE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Estamos fazendo uma pesquisa de mercado para saber o preço médio dos produtos, informe o " +
                "preço do produto baseado nos mercados proximos: ");

        double mercado1 = scanner.nextDouble();
        double mercado2 = scanner.nextDouble();
        double mercado3 = scanner.nextDouble();
        double mercado4 = scanner.nextDouble();
        double mercado5 = scanner.nextDouble();

        double precoMedio = (mercado1 + mercado2 + mercado3 + mercado4 + mercado5) / 5;

        if (mercado1 > precoMedio){
            System.out.println(mercado1);
        }
        if (mercado2 > precoMedio){
            System.out.println(mercado2);
        }
        if (mercado3 > precoMedio){
            System.out.println(mercado3);
        }
        if (mercado4 > precoMedio){
            System.out.println(mercado4);
        }
        if (mercado5 > precoMedio){
            System.out.println(mercado5);
        }
        scanner.close();
    }
}