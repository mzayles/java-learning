package metodoVoid;

public class Funcionario {
    String nome = null;
    double salario = 1000;
    
    public void mostrarNome(String nome) {
        this.nome = nome;
        
        System.out.printf("\nNome: %s\n", this.nome);
    }
    
    public void reajustarSalario(double salario) {
        this.salario = salario;
        double salarioReajustado = salario  * 1.10;
        
        System.out.printf("\nSalário reajustado: R$ %.2f\n", salarioReajustado);
    }
}
