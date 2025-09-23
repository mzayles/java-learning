package INTRODUCTION;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua cidade: ");
        String cidade = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite sua altura: ");
        float altura = sc.nextFloat();

        sc.close();

        System.out.println("\nDados:");
        System.out.printf("Olá, %s! Você mora em %s, tem %d anos e %.2f de altura.", nome, cidade, idade, altura);
    }
}
