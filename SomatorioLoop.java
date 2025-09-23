import java.util.Scanner;

public class Somatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        double soma = 0;

        while (i < 5) {
            System.out.printf("Digite o %d número: ", (i + 1));
        }

        sc.close();
    }
}
