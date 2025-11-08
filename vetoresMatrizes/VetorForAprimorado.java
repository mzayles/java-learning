package vetoresMatrizes;
import java.util.Arrays;
import java.util.Scanner;

public class VetorForAprimorado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        sc.nextLine(); // consumindo buffer de teclado
        
        String nomes[] = new String[tamanho];
        
        System.out.println("");
        
        for(int i = 0; i < nomes.length; i++) {
            System.out.printf("Digite o %d° nome: ", i+1);
            nomes[i] = sc.nextLine();
        }
        
        // Forma convencional
        System.out.println("\n----------------- Listando nomes -----------------");
        for(int i = 0; i < nomes.length; i++) {
            System.out.printf("%d° nome: %s\n", i+1, nomes[i]);
        }
        
        // Forma For Each 
        System.out.println("\n----------------- Listando nomes -----------------");
        for(String nome: nomes) {
            System.out.printf("O nome é: %s\n", nome);
        }
        
        // Forma Arrays
        System.out.println("\n----------------- Listando nomes -----------------");
        System.out.println(Arrays.toString(nomes));
        
        sc.close();
    }
}
