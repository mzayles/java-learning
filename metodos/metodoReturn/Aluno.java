package metodoReturn;

public class Aluno {
    String nome;
    int idade;
    
    // Construção do método
    public String mostrarNome(String nome) {
        this.nome = nome;

        return String.format("O nome é: %s", this.nome);
    }

    public String mostrarIdade(int idade) {
        this.idade = idade;
        
        return String.format("A idade é: %d", this.idade);
    }
}