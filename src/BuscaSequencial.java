import java.util.Random;
import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        int busca, achado = -1;

        Random randomico = new Random();
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = randomico.nextInt(100);
        }

        System.out.println("Digite um numero para ser buscado no vetor");
        busca = ler.nextInt();

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] == busca) {
                achado = i;
                break;
            }
        }

        System.out.println("Vetor randomico: ");

        for(int num:vetor)
            System.out.println(num);

        if (achado != -1){
            System.out.println("Número " + busca + " achado na posição " + achado);
        } else {
            System.out.println("Número " + busca + " não foi achado em nenhuma posição");
        }

    }
}
