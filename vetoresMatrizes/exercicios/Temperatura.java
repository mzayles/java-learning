package vetoresMatrizes.exercicios;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float temperaturas[] = new float[7];

        for(int i = 0; i < temperaturas.length; i++) {
            System.out.printf("Digite a %dª temperatura: ", i+1);
            temperaturas[i] = sc.nextFloat();
        }

        System.out.println("\n--------------- Temperaturas ---------------");
        for(int i = 0; i < temperaturas.length; i++) {
            System.out.printf("%dª temperatura: %.2f° \n", i+1, temperaturas[i]);
        }
        System.out.println("--------------------------------------------");

        float soma = 0;
        float maior = temperaturas[0];

        for(int i = 0; i < temperaturas.length; i++) {
            soma += temperaturas[i];
            
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
        }

        System.out.printf("\nMaior temperatura registrada: %.2f°", maior);
        System.out.printf("\nMédia de temperaturas: %.2f°\n", (soma / temperaturas.length));

        sc.close();
    }
}
