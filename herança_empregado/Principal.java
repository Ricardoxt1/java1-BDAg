package herança_empregado;

class Principal {
    public static void main(String[] args) {
        Vendedor e1 = new Vendedor();
        Gerente e2 = new Gerente();
        Horista e3 = new Horista();

        String nome = Empregado.getNome();

        if (e1.salario_total > e2.salario_total && e1.salario_total > e3.salario_total) {
            System.out.println("O empregado com maior salário " + nome + ", com cargo de vendedor");
        } else if (e2.salario_total > e3.salario_total && e2.salario_total > e1.salario_total) {
            System.out.println("O empregado com maior salário " + nome + ", com cargo de gerente");
        } else if (e3.salario_total > e1.salario_total && e3.salario_total > e2.salario_total) {
            System.out.println("O empregado com maior salário " + nome + ", com cargo de horista");
        }
    }
}
