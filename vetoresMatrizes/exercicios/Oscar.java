package vetoresMatrizes.exercicios;

public class Oscar {
    public static void main(String[] args) {
        String filmes[] = {"Anora", "Oppenheimer", "Tudo em Todo Lugar ao Mesmo Tempo", "No Ritmo do Coração", "Nomadland", "Parasita", "Green Book: O Guia", "A Forma da Água", "Moonlight: Sob a Luz do Luar", "Spotlight: Segredos Revelados"};

        int anos[] = {2025, 2024, 2023, 2022, 2021, 2020, 2019, 2018, 2017, 2016};

        String diretores[] = {"Sean Baker", "Christopher Nolan", "Daniel Kwan e Daniel Scheinert", "Siân Heder", "Chloé Zhao", "Bong Joon-ho", "Peter Farrelly", "Guillermo del Toro", "Barry Jenkins", "Tom McCarthy"};
        
        System.out.println("--------------- Filmes Vencedores do Oscar ---------------");
        for(int i = 0; i < filmes.length; i++) {
            System.out.printf("Filme: %s \nDiretor: %s \nAno vencedor: %d \n\n", filmes[i], diretores[i], anos[i]);
        }
    }
}
