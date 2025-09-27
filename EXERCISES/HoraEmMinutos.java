package EXERCISES;

import java.util.Scanner;

public class HoraEmMinutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a hora (00-23h): ");
        int hora = sc.nextInt();
        System.out.print("Informe os minutos (00-59m): ");
        int minutos = sc.nextInt();

        int totalMinutos = (hora * 60);

        System.out.printf("\nA hora %d em minutos: %d minutos.", hora, totalMinutos);

        sc.close();
    }
}