package Funcionario;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Ricardo", "Programador", 3000); //
        System.out.println(funcionario.getImprimir());

        try (// Solicitar novo salário
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o novo salário: ");
            float novoSalario = scanner.nextFloat();

            // Alterar salário e imprimir novamente
            String mensagem = funcionario.alteraSalarioValor(novoSalario);
            System.out.println(mensagem);
        }
    }//
}