package vetoresMatrizes.exercicios;
import java.util.Scanner;

public class CalculoSalarial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quantos salários você deseja reajustar em 15%: ");
        int quantidade = sc.nextInt();
        
        double salarios[] = new double[quantidade];

        for(int i = 0; i < salarios.length; i++) {
            System.out.printf("Informe o %dº salário: ", i+1);
            salarios[i] = sc.nextInt();
        }

        System.out.println("\n-------------- Salários atuais --------------");

        for(int i = 0; i < salarios.length; i++) {
            System.out.printf("%dº salário: %.2f \n", i+1, salarios[i]);
        }

        System.out.println("\n-------- Salários reajustados em 15% --------");

        for(int i = 0; i < salarios.length; i++) {
            System.out.printf("%dº salário: %.2f \n", i+1, (salarios[i] * 1.15));
        }

        sc.close();
    }
}
