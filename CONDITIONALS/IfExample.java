package CONDITIONALS;
import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float media;

        System.out.println("Digite a 1º nota: ");
        float nota1 = sc.nextFloat();

        System.out.println("Digite a 2º nota: ");
        float nota2 = sc.nextFloat();

        media = (nota1 + nota2) / 2;
        System.out.printf("A média do aluno é %.2f", media);

        sc.close();

        if (media >= 6) {
            System.out.println("\nAprovado!");
        } else {
            System.out.println("\nReprovado!");
        }
    }
}
