package vetoresMatrizes;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = sc.nextInt();

        // Declarando vetor
        double vet[] = new double[tamanho];

        // Populando vetor
        for(int i = 0; i < vet.length; i++) {
            System.out.printf("Informe o %dº número: ", i+1);
            vet[i] = sc.nextInt();
        }

        // Listando vetor
        System.out.println("\n--------- Listando elementos do vetor ---------");

        for(int i = 0; i < vet.length; i++) {
            System.out.printf("%dº número: %.0f \n", i+1, vet[i]);
        }

        sc.close();
    }
}
