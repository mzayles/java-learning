package condicionais;
import java.util.Scanner;

public class SwitchChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char op = sc.nextLine().charAt(0);

        switch(op) {
            case 'A': case 'a':
                System.out.println("Você escolheu A");
                break;
            case 'B': case 'b':
                System.out.println("Você escolheu B");
                break;
            case 'C': case 'c':
                System.out.println("Você escolheu C");
                break;
            default:
                System.out.println("Opção inválida.");
        }

        sc.close();
    }
}
