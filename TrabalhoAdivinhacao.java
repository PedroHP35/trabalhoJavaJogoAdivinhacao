


// TRABALHO FEITO EM CONJUNTO
// PEDRO HENRIQUE PIOVEZAN 1135911
// HENRIQUE PANISSON AGOSTINETO 1136301



import java.util.Random;
import java.util.Scanner;

public class TrabalhoAdivinhacao {
    public static void main(String[] args) {
    Random geradorAleatorio = new Random();
    int numeroResposta = geradorAleatorio.nextInt(101);
    int tentativas = 0;
    Scanner lerTeclado = new Scanner(System.in);
    do {
        System.out.println("Digite sua tentativa: ");
        int chute = lerTeclado.nextInt();
        if (chute == numeroResposta) {
            System.out.println("Você acertou!");
            break;
        }
        else if (chute < numeroResposta) {
            System.out.println("A resposta é maior que o número digitado.");
        }
        else if (chute > numeroResposta) {
            System.out.println("A resposta é menor que o número digitado.");
        }
        tentativas = tentativas + 1;
    } while (tentativas < 15);
    if (tentativas == 15) {
        System.out.println("Você perdeu!");
        System.out.println("A resposta correta era " + numeroResposta);
    } 
    else {
        System.out.println("Restaram " + (14 - tentativas) + " tentativas");
    }
    lerTeclado.close();
}
}