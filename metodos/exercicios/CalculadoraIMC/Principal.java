package CalculadoraIMC;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o seu peso: ");
        float peso = sc.nextFloat();

        System.out.print("Informe o sua altura: ");
        float altura = sc.nextFloat();

        float imc = peso / (altura * altura);

        Calculo.calcularImc(imc);

        sc.close();
    }
}