package EXERCISES;

public class BalancoTrimestral {
    public static void main(String[] args) {
        float gastosJaneiro;
        float gastosFevereiro;
        float gastosMarco;
        float gastosTrimestre;
        
        gastosJaneiro = 15000f;
        gastosFevereiro = 23000f;
        gastosMarco = 17000f;

        gastosTrimestre = (gastosJaneiro + gastosFevereiro + gastosMarco);
        System.out.printf("Gasto total do trimestre: %.2f", gastosTrimestre);
    }
}
