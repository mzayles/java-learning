package INTRODUCAO_001;

public class ex001 {
    public static void main(String[] args) {
        String nome = "Mariana Alves de Souza";
        String cidade = "São Paulo";
        int idade = 18;
        float altura = 1.62f; // f: para falar que é float, se não ele entende que é double.

        System.out.println("\nDados\n");
	    System.out.printf("Nome: %s \nCidade: %s \nIdade: %d anos \nAltura: %.2f cm", nome, cidade, idade, altura);
	    // %c: char, %s: string, %f: reais (double ou float), %d: int e long.
    }
}
