package herança_empregado;

import java.util.Scanner;

class Horista extends Empregado {
    protected float valor_hora;
    protected float horas_trabalhadas;
    protected float salario_total;

    public Horista() {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Insira o valor da hora: ");
            valor_hora = myObj.nextFloat();
            System.out.println("Insira o valor das horas trabalhadas:");
            horas_trabalhadas = myObj.nextFloat();
        }
        Empregado.getNome();
        Empregado.getNumero();
    }

    public float calcularSalario() {
        return salario_total = valor_hora * horas_trabalhadas;
    }
}