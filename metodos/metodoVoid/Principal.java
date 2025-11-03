package metodoVoid;

public class Principal {
    public static void main(String[] args) {
        String nome = "Mariana Alves";
        double salario = 1000;
        
        Funcionario fn = new Funcionario();
        
        fn.mostrarNome(nome);
        fn.reajustarSalario(salario);
    }
}
