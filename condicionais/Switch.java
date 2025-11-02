package condicionais;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra de A a C: ");
        String op = sc.nextLine();

        switch(op) {
            case "A":
                System.out.println("Opção A");
                break;
            case "B":
                System.out.println("Opção B");
                break;
            case "C": 
                System.out.println("Opção C");
                break;
            default:
                System.out.println("Opção inválida.");
        }

        sc.close();
    }
}
