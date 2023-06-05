package Veiculo;

public class Principal {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("GT-R", "Nissan", 2022);

        System.out.println(veiculo.getImprimir());
        System.out.println(veiculo.getFabricacao());
    }
}
