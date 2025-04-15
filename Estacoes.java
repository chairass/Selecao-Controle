import java.util.Scanner;

public class Estacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês: ");
        int mes = scanner.nextInt();


        boolean isPrimavera = (mes == 9 && dia >= 22) || (mes == 10) || (mes == 11) || (mes == 12 && dia <= 21);

        if (isPrimavera){
            System.out.println("Está na primavera");
        }

        boolean isOutono = (mes == 3 && dia >= 20) || (mes == 4) || (mes == 5) || (mes == 6 && dia <= 21);

        if (isOutono){
            System.out.println("Est\u00E1 no outono");
        }
    }
}
