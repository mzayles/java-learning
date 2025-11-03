package Calculadora;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double n1 = 10;
        double n2 = 5;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para calcular o dobro dele: ");
        double numero = sc.nextInt();
        
        Calculo obj = new Calculo();
        
        double soma = obj.calcularSoma(n1, n2);
        double dobro = obj.calcularDobro(numero);
        
        System.out.println("\nA soma de " + n1 + " e " + n2 + " é " + soma + "!");   
        System.out.println("O dobro de " + numero + " é " + dobro + "!");

        sc.close();
    }
}
