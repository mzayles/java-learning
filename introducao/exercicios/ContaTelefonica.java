package introducao.exercicios;
import java.util.Scanner;

public class ContaTelefonica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de minutos locais: ");
        int qtdMinutosLocais = sc.nextInt();

        System.out.print("Informe a quantidade de minutos para celular: ");
        int qtdMinutosCelular = sc.nextInt();

        float assinatura = 17.90f;
        float chamadaLocal = 0.04f;
        float chamadaCelular = 0.20f;
        float interurbanos = 34.29f;

        float minutosLocais = chamadaLocal * qtdMinutosLocais;
        float minutosCelular = chamadaCelular * qtdMinutosCelular;

        System.out.print("\n-----Custos-----\n");
        System.out.printf("Assinatura: R$ %.2f \nChamada local:R$ %.2f \nChamada para celular: R$ %.2f \nInterurbanos: R$ %.2f", assinatura, minutosLocais, minutosCelular, interurbanos);
        System.out.printf("\n\nCusto total: %.2f", assinatura + minutosLocais + minutosCelular + interurbanos);

        sc.close();
    }
}