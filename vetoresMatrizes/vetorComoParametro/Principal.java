package vetoresMatrizes.vetorComoParametro;

public class Principal {
    public static void main(String[] args) {
        // Criação e inicialização do vetor
        int vet[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Chamada do método
        VetorParametro obj = new VetorParametro();

        obj.imprimirVetor(vet);
        obj.imprimirVetor2(vet);
    }
}
