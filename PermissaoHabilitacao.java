import java.util.Scanner;

public class PermissaoHabilitacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        System.out.printf("Olá, %s! Você tem %d anos, portanto: \n", nome, idade);

        if (idade < 18) {
            System.out.println("Você não possui permissão para dirigir.");
        } else {
            System.out.println("Você possui permissão para dirigir.");
        }

        sc.close();
    }
}