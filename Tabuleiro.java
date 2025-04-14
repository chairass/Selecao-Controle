import java.util.Scanner;

public class Tabuleiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Como vocês já sabem, o jogo funciona da seguinte forma. Você só pode jogar caso o número " +
                "sorteado seja maior que o do seu adversário. Informe os números a seguir");
        System.out.println("Jogador 1:");
        int jogador1 = scanner.nextInt();

        System.out.println("Jogador 2:");
        int jogador2 = scanner.nextInt();

        if(jogador2 > jogador1){
            System.out.println("É a sua vez de jogar Jogador 2");
        }else {
            System.out.println("É a sua vez de jogar Jogador 1");
        }
    }
}
