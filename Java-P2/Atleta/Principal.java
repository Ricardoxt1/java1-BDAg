package Atleta;

public class Principal {
    public static void main(String[] args) {
        Atleta atleta = new Atleta("Rogerio", "Masculino", 50, (float) 1.75);

        System.out.println(atleta.getImprimir());
        System.out.println(atleta.calcularIMC());
    }
}
