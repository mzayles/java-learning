package LOOPS;
import java.util.Scanner;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de X?");
        int x = sc.nextInt();
        sc.close();

        do {
            if (x % 2 == 0) {
                System.out.println(x);
            }

            x++;
        } while (x <= 100);

        System.out.println("\nLaço encerrado.");
    }
}

// While: executa se a condição for verdadeira. 
// Do While: executa o bloco de execução pelo menos uma vez - ex: "Deseja continuar?".
// While, Do While, For, For It.
// 1 única linha não é necessário abrir mais contâiners.
