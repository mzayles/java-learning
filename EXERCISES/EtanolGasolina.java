package EXERCISES;
import java.util.Scanner;

public class EtanolGasolina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o preço do litro do etanol: R$ ");
        float precoEtanol = sc.nextFloat();

        System.out.print("Informe o preço do litro da gasolina: R$ ");
        float precoGasolina = sc.nextFloat();

        float razao = precoEtanol / precoGasolina;
        System.out.printf("Razão etanol/gasolina: %.2f\n", razao);

        if (razao < 0.7) {
            System.out.println("Utilize Etanol. É a opção mais barata!");
        } else if (razao == 0) {
            System.out.println("Tanto faz abastecer com Etanol ou Gasolina.");
        } else {
            System.out.println("Utilize gasolina. É a opção mais barata!");
        }

        sc.close();
    }
}