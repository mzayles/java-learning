package BuscarParImpar;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = sc.nextInt();

        // Chamando método
        Principal.BuscarParImpar(numero);

        sc.close();
    }  

    // Método privado: lido somente pela mesma classe.
    private static void BuscarParImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
}
