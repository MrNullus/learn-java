import java.util.Scanner;

public class EntradaTeclado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroDigitado = 0;

        System.out.println("Digite um numero: ");
        numeroDigitado = entrada.nextInt();
        System.out.println("Você entrou com o numero > " + numeroDigitado);
    }
}