package introducao;
import java.util.Scanner;

public class ClasseScanner {
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

        System.out.println("\n----- Dados -----");
        System.out.printf("Olá, %s! Você mora em %s, tem %d anos e %.2f de altura.", nome, cidade, idade, altura);

        sc.close();
    }
}