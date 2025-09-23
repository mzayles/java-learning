package CONDITIONALS;
import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra de A a C: ");
        String op = sc.nextLine();

        sc.close();

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
    }
}
