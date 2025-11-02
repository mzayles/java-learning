package condicionais;
import java.util.Scanner;

public class IfElseIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float media;

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a 1º nota: ");
        float nota1 = sc.nextFloat();

        System.out.print("Digite a 2º nota: ");
        float nota2 = sc.nextFloat();

        media = (nota1 + nota2) / 2;
        System.out.printf("\nA média do aluno %s é %.2f.", nome, media);

        // Estrutura condicional composta
        if (media < 2) {
            System.out.println("\nPéssimo! Aluno reprovado!");
        } else if (media < 4) {
            System.out.println("\nRuim! Aluno reprovado!");
        } else if (media < 6) {
            System.out.println("\nRegular. Aluno reprovado!");
        } else if (media < 8) {
            System.out.println("\nMuito bom! Aluno aprovado!");
        } else if (media < 9) {
            System.out.println("\nÓtimo! Aluno aprovado!");
        } else {
            System.out.println("\nExcelente! Aluno aprovado!");
        }

        sc.close();
    }
}