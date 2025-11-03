package vetoresMatrizes.vetorComoParametro;
import java.util.Arrays;

public class VetorParametro {
    public void imprimirVetor(int vet[]) {
        // Imprimindo com o método toString da classe Arrays
        System.out.println(Arrays.toString(vet));
    }

    public void imprimirVetor2(int vet[]) {
        for(int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " - ");
        }
        System.out.println("\n");
    }
}
