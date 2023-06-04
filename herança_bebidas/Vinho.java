public class Vinho extends Bebidas {
    protected int ano;

    public Vinho(int ano, String name, float preco) {
        super(nome, preco);
        this.ano = 2018;
    }

    protected void mostrarBebida() {
        System.out.println("Ano do vinho: " + this.ano);
    }

    public int getAno() {
        return ano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
