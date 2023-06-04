public class Suco extends Bebidas {
    protected String sabor;

    public Suco(String sabor, String nome, float preco) {
        super(nome, preco);
        this.sabor = sabor;
    }

    public void mostraBebida() {
        System.out.println("Nome: " + getNome());
        System.out.println("Sabor: " + getSabor());
        System.out.println("Preço: " + getPreco());
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
