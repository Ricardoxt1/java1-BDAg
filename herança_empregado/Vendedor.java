package herança_empregado;

import java.util.Scanner;

class Vendedor extends Empregado {
    protected float salario_base;
    protected float valor_vendas_mes;
    protected float perc_comissao;
    protected float salario_total;

    public Vendedor() {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Insira o valor do salário base: ");
            salario_base = myObj.nextFloat();

            System.out.println("Insira o valor da venda do mês:");
            valor_vendas_mes = myObj.nextFloat();

            System.out.println("Insira o valor da porcentagem da comissão:");
            perc_comissao = myObj.nextFloat();
        }
        Empregado.getNome();
        Empregado.getNumero();
    }

    public float calcularSalario() {
        return salario_total = salario_base + valor_vendas_mes * perc_comissao;
    }
}
