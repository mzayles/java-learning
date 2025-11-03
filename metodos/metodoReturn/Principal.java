package metodoReturn;

public class Principal {
    public static void main(String[] args) {
        String nome = "Mariana Alves";
        int idade = 18;
        
        // InsTância de classe
        Aluno al = new Aluno();
        
        System.out.println(al.mostrarNome(nome));
        System.out.println(al.mostrarIdade(idade));
    }
}
