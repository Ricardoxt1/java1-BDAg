
import java.util.Scanner;

public class Bebidas {
    protected static String nome;
    protected static float preco;

    public Bebidas(String nome, float preco) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Digite o nome: ");
            this.nome = myObj.nextLine();

            System.out.println("Digite o preço: ");
            this.preco = myObj.nextFloat();
        }
    }

    protected static String getNome() {
        return nome;
    }

    protected static float getPreco() {
        return preco;
    }

    protected void setPreco(double d) {
        Bebidas.preco = (float) d;
    }

    protected void setNome(String nome) {
        Bebidas.nome = nome;
    }
}
