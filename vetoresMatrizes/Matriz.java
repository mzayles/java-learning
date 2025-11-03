package vetoresMatrizes;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // matriz.length: indica a quantidade de linhas.
        // matriz[i].length: indica a quantidade de colunas da i.ézima linha.

        // Declarando matriz
        int matriz[][] = new int[2][4];

        // Populando matriz
        for(int i = 0; i < matriz.length; i++) {
            System.out.printf("Informe os elementos da %dª linha: \n", i + 1);
            
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.printf("m[%d][%d]: - ", i, j);
                matriz[i][j] = sc.nextInt();
            }

            System.out.println(""); // Quebra de linha quando o laço encerrar.
        }

        // Listando matriz
        for(int i = 0; i < matriz.length; i++) {
            System.out.printf("%dª linha: \n", i + 1);
            
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d - ", matriz[i][j]);
            }

            System.out.println("\n");
        }

        sc.close();
    }
}
