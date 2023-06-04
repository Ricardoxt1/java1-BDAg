package herança_empregado;
import java.util.Scanner;

public class Empregado {

    protected static String nome;
    protected static int numero;

    public Empregado() {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Insira seu nome: ");
            nome = myObj.nextLine();
            System.out.println("Insira o número do empregado: ");
            numero = myObj.nextInt();
        }
        
    }

    public static int getNumero() {
        return numero;
    }

    public static String getNome() {
        return nome;
    }

    
}
