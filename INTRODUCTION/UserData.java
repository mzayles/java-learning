package INTRODUCTION;

public class UserData {
    public static void main(String[] args) {
        String nome;
        String cidade;
        int idade;
        float altura;

        nome = "Mariana Alves de Souza";
        cidade = "São Paulo";
        idade = 18;
        altura = 1.62f; // f: para falar que é float, se não ele entende que é double.

        System.out.println("\nDados\n");
	    System.out.printf("Nome: %s \nCidade: %s \nIdade: %d anos \nAltura: %.2f cm", nome, cidade, idade, altura);
	    // %c: char, %s: string, %f: reais (double ou float), %d: int e long.
    }
}
