/**
 * Programa básico para uso das estruturas de controle => if, else, else-if
 */
public class FLuxoDeControle {
    public static void main(String[] args) {
        int nota = 5;

        System.out.print("Usando if, else-if, else => ");
        if (nota >= 8 && nota <= 10) {
            System.out.println("Você foi aprovado!");
        } else if (nota >= 5 && nota <= 7) {
            System.out.println("Passou raspando, é bom fazer uma atividade extra");
        } else {
            System.out.println("Você está de recuperação!");
        }

        String resultado = (nota >= 8 && nota <= 10) ? "Aprovado" : "Reprovado";
        System.out.println("Usando ternario => " + resultado);

        System.out.print("Usando switch-case => ");
        int posicao = 1
        switch (posicao) {
            case 1:
                System.out.println("Primeiro Lugar");
                break;
            case 2:
                System.out.println("Segundo Lugar");
                break;
            case 3:
                System.out.println("Terceiro Lugar");
                break;
        }
    }
}