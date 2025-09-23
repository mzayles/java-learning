package CONDITIONALS;
import java.util.Scanner;

public class SwitchCharExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char op = sc.nextLine().charAt(0);
        sc.close();

        switch(op) {
            case 'A': case 'a':
                System.out.println("");
                break;
            case 'B': case 'b':
                System.out.println("");
                break;
            case 'C': case 'c':
                System.out.println("");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
