package introducao.exercicios;

public class BalancoTrimestral {
    public static void main(String[] args) {
        float gastosJaneiro = 15000f;
        float gastosFevereiro = 23000f;
        float gastosMarco = 17000f;

        float gastosTrimestre = (gastosJaneiro + gastosFevereiro + gastosMarco);
        System.out.printf("Gasto total do trimestre: %.2f", gastosTrimestre);
    }
}
