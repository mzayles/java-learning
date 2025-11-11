package IndiceCorporal;

public class Calculo {
    public static void calcularImc(float imc) {
        System.out.printf("\nIMC: %.2f", imc);

        if (imc < 18.5) {
            System.out.printf("\nClassificação: MAGREZA | Grau de obesidade: 0\n");
        } else if (imc <= 24.9) {
            System.out.printf("\nClassificação: NORMAL | Grau de obesidade: 0\n");
        } else if (imc <= 24.9) {
            System.out.printf("\nClassificação: SOBREPESO | Grau de obesidade: I\n");
        } else if (imc <= 24.9) {
            System.out.printf("\nClassificação: OBESIDADE | Grau de obesidade: II\n");
        } else {
            System.out.printf("\nClassificação: OBESIDADE GRAVE | Grau de obesidade: III\n");
        }
    }
}