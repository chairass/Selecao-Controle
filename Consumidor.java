import java.util.Scanner;

public class Consumidor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor da compra para ver a porcentagem de desconto: ");
        float totalCompra = scanner.nextFloat();

        if (totalCompra >= 0 && totalCompra < 50) {
            double desconto = totalCompra - (totalCompra * 0.05);
            System.out.printf("Compras de até R$ 49,99 têm 5%% de desconto. Valor final: R$ %.2f\n", desconto);
        }
        else if (totalCompra >= 50 && totalCompra < 100) {
            double desconto = totalCompra - (totalCompra * 0.10);
            System.out.printf("Compras de R$ 50,00 até R$ 99,99 têm 10%% de desconto. Valor final: R$ %.2f\n", desconto);
        }
        else if (totalCompra >= 100 && totalCompra < 200) {
            double desconto = totalCompra - (totalCompra * 0.20);
            System.out.printf("Compras de R$ 100,00 até R$ 199,99 têm 20%% de desconto. Valor final: R$ %.2f\n", desconto);
        }
        else if (totalCompra >= 200 && totalCompra < 500) {
            double desconto = totalCompra - (totalCompra * 0.25);
            System.out.printf("Compras de R$ 200,00 até R$ 499,99 têm 25%% de desconto. Valor final: R$ %.2f\n", desconto);
        }
        else {
            double desconto = totalCompra - (totalCompra * 0.30);
            System.out.printf("Compras a partir de R$ 500,00 têm 30%% de desconto. Valor final: R$ %.2f\n", desconto);
        }

        scanner.close();
    }
}
