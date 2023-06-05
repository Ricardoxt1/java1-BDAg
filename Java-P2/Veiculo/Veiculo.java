package Veiculo;

import java.util.Calendar;
// realizar o método construtor para ler todos os valores;
// imprimir os dados do modelo, marca e ano do veiculo
// metodo para realizar o retorno da idade do veiculo;

class Veiculo {
    private String modelo;
    private String marca;
    private int fabricacao;

    public Veiculo(String modelo, String marca, int fabricacao) {
        this.modelo = modelo;
        this.marca = marca;
        this.fabricacao = fabricacao;
    }

    public String getImprimir() {
        return "O modelo do veículo " + modelo + " tem como marca " + marca + " e o ano de fabricação " + fabricacao;
    }

    public String getFabricacao() {
        Calendar calendario = Calendar.getInstance();
        int anoAtual = calendario.get(Calendar.YEAR);
        int idade = anoAtual - fabricacao;
        return "A idade do veículo é: " + idade + " anos";
    }
}
