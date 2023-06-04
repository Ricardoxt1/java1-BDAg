package herança_empregado;
import java.util.Scanner;

class Gerente extends Empregado {
    protected float salario_mensal;
    protected float salario_total;

    public Gerente() {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Insira o valor do salário mensal: ");
            salario_mensal = myObj.nextFloat();
        }
        Empregado.getNome();
        Empregado.getNumero();
    }

    public float calcularSalario() {
        return salario_total = salario_mensal;
    }
}