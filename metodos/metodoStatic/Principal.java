public class Principal {
    public static void main(String[] args) {
        String nome = "Mariana Alves";
        int idade = 18;

        // Método estático
        exemploStatic(nome); 
     
        // Objetos de instância: trocam informações entre as classes.
        Principal obj = new Principal(); 
        obj.mostrarNome(nome);
        
        MostraNomeIdade objeto = new MostraNomeIdade();
        objeto.NomeIdade(nome, idade);
    }
    
    // Método estático: não precisam de instâncias para serem chamados.
    public static void exemploStatic(String nome) {
        System.out.printf("Olá, %s!\n", nome);
    }
    
    // Método de instância: podem ser utilzados em outras classes.
    public void mostrarNome(String nome) {
        System.out.printf("Olá, %s!", nome);
    }
}
