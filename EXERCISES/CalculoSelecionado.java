package EXERCISES;
import java.util.Scanner;

public class CalculoSelecionado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float operacao;

        System.out.print("Digite o 1º número: ");
        float numero1 = sc.nextFloat();

        System.out.print("Digite o 2º número: ");
        float numero2 = sc.nextFloat();

        sc.nextLine();

        System.out.print("Qual operação você deseja realizar? \n [A] Soma ou [B] Subtração \n");
        char op = sc.nextLine().charAt(0);

        switch(op) {
            case 'A': case 'a':
                operacao = numero1 + numero2;
                System.out.printf("\nA soma entre %.2f e %.2f é %.2f", numero1, numero2, operacao);
                break;
            case 'B': case 'b':
                operacao = numero1 - numero2;
                System.out.printf("\nA subtração entre %.2f e %.2f é %.2f", numero1, numero2, operacao);
                break;
            default:
                System.out.print("\nOpção inválida!");
        }

        sc.close();
    }
}