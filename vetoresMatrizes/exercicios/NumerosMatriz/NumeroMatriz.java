package vetoresMatrizes.exercicios.NumerosMatriz;

public class NumeroMatriz {
    public static void main(String[] args) {
        int matriz[][] = new int[3][];

        matriz[0] = new int[2];
        matriz[1] = new int[5];
        matriz[2] = new int[3];

        matriz[0][0] = 10;
        matriz[0][1] = 20;

        matriz[1][0] = 30;
        matriz[1][1] = 40;
        matriz[1][2] = 50;
        matriz[1][3] = 60;
        matriz[1][4] = 70;

        matriz[2][0] = 90;
        matriz[2][1] = 20;
        matriz[2][2] = 100;

        for(int i = 0; i < matriz.length; i++) {
            System.out.printf("%dª linha: ", i+1);

            for(int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d - ", matriz[i][j]);
            }

            System.out.println("\n");
        }
    }
}
