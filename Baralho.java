import java.util.Scanner;

public class Baralho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero de 1 a 13: ");

        int numero = scanner.nextInt();

        String carta;

        if (numero == 1) {
           carta = "Às";
        }
        else if (numero == 11) {
          carta = "Valete";
        }
        else if (numero == 12){
            carta = "Rainha";
        }
        else if(numero == 13){
            carta = "Rei";
        }
        else if(numero >= 2 && numero <= 10){
            carta = String.valueOf(numero);
        }
        else {
           carta = "Numero invalido digite novamente";
        }

        System.out.print("A carta escolhida foi: " + carta);
    }
}
