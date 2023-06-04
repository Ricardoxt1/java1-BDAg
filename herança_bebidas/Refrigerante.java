
public class Refrigerante extends Bebidas {
    protected Boolean retornavel;

    public Refrigerante(Boolean retornavel, String nome, float preco) {
        super(nome, preco);
        this.retornavel = retornavel;
    }

    protected void mostraBebida() {
        if (retornavel.equals(true)) {
            System.out.println("A bebida " + nome + " é retornável e o preço é: " + preco);
        } else {
            System.out.println("A bebida " + nome + " não é retornável");
        }
    }

    protected Boolean getRetornavel() {
        return retornavel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
