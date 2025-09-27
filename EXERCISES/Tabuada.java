package EXERCISES;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a tabuada que deseja exibir: ");

        int tabuada = sc.nextInt();
        
        for(int i = 0; (i <= 10); i++) {
            System.out.printf("\n%d X %d = %d", tabuada, i, (tabuada * i));
        }

        System.out.println();

        sc.close();
    }
}
