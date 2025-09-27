package EXERCISES;

import java.util.Scanner;

public class Somatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        double soma = 0;

        while (i < 5) {
            System.out.printf("Digite o %dº número: ", (i + 1));
            int numero = sc.nextInt();
            soma += numero;
            i++;
        }

        System.out.printf("A soma dos 5 valores é %.2f", soma);

        sc.close();
    }
}
