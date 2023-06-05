package Funcionario;


public class Funcionario {
    String nome;
    String função;
    float salário;
    float novoSalario;
    
    
    public Funcionario(String nome, String função, float salário){
        this.nome = nome;
        this.função = função;
        this.salário = salário;
    }

    public String alteraSalarioValor(float novoSalario){
        this.novoSalario = novoSalario;
        return "o funcionario " + nome + " passou por uma gratificação e seu salário foi para R$ " + novoSalario;
    }

    public String getImprimir(){
        return "o funcionario " + nome + " trabalha como " + função + " e possui um salário no valor de: R$ " + salário;
    }

    public char[] alteraSalarioValor() {
        return null;
    }
}



