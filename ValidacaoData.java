import java.util.Scanner;

public class ValidacaoData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        boolean isDataValida = true;
        if (mes < 1 || mes > 12){
            isDataValida = false;
        }
        else {
            int[] diasNoMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
                diasNoMes[1] = 29;
            }
            if (dia < 1 || dia > diasNoMes[mes - 1]){
                isDataValida = false;
            }
        }

    }
}
