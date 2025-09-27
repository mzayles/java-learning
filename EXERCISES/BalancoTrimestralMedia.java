package EXERCISES;

public class BalancoTrimestralMedia {
    public static void main(String[] args) {
        float gastosJaneiro = 15000f;
        float gastosFevereiro = 23000f;
        float gastosMarco = 17000f;

        float gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        float mediaMensal = gastosTrimestre / 3;

        System.out.printf("Gasto total do trimestre: %.2f\n", gastosTrimestre);
        System.out.printf("Valor da média mensal: %.2f\n", mediaMensal);
    }
}
