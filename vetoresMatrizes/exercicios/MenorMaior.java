package vetoresMatrizes.exercicios;
import java.util.Arrays;
import java.util.Scanner;

public class MenorMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();

        int numeros[] = new int[tamanho];

        // Populando vetor
        for(int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número de %d: ", i+1, numeros.length);
            numeros[i] = sc.nextInt();
        }

        int soma = 0;
        int menor = numeros[0];
        int maior = numeros[0];
        
        for(int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
            
            if (numeros[i] < menor) {
                menor = numeros[i]; // novo menor
            } 
            if (numeros[i] > maior) {
                maior = numeros[i]; // novo maior
            }
        }

        int media = soma / numeros.length;

        // For
        System.out.println("\n\t\t----------------- Saídas -----------------");
        for(int i = 0; i < numeros.length; i++) {
            if (numeros[i] == menor) {
                System.out.printf("vet[%d] = %d <---- menor valor\n", i, numeros[i]);
            } else if (numeros[i] == maior) {
                System.out.printf("vet[%d] = %d <---- maior valor\n", i, numeros[i]);
            } else {
                System.out.printf("vet[%d] = %d", i, numeros[i]);
            }
        }

        // For Each
        System.out.println("\n\t\t----------------- Listando -----------------");
        for(int numero: numeros) {
            System.out.printf("O valor é: %d\n", numero);
        }
        
        // Arrays
        System.out.println("\n\t\t----------------- Listando -----------------");
        System.out.println(Arrays.toString(numeros));
        
        System.out.printf("\n%d é a soma dos valores.\n", soma);
        System.out.printf("%d é a média dos valores.\n", media);
        
        sc.close();
    }
}
