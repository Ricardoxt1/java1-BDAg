package Veiculo;

public class Principal {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Sedan", "Toyota", 2018);

        System.out.println(veiculo.getImprimir());
        System.out.println(veiculo.getFabricacao());
    }
}
