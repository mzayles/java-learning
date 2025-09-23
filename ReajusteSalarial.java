import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do seu salário atual: R$ ");
        float salario = sc.nextFloat();

        System.out.print("Digite o percentual de reajuste: ");
        int percentual = sc.nextInt();

        float novoSalario = salario + (salario * percentual / 100);
        System.out.printf("\nSeu salário atual agora é de R$ %.2f", novoSalario);

        sc.close();
    }
}
