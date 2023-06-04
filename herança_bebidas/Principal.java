import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] Refrigerantes = new String[3];
        String[] Sucos = new String[3];
        String[] Vinhos = new String[3];

        while (true) {
            System.out.println("Bebidas");
            System.out.println("1. Cadastrar");
            System.out.println("   A. Refrigerante");
            System.out.println("   B. Suco");
            System.out.println("   C. Vinho");
            System.out.println("2. Imprimir");
            System.out.println("   A. Refrigerante");
            System.out.println("   B. Suco");
            System.out.println("   C. Vinho");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Digite o nome do(a) refrigerante: ");
                    String refrigerante = scanner.nextLine();
                    cadastrarBebida(Refrigerantes, refrigerante);

                    System.out.print("Digite o nome do(a) suco: ");
                    String suco = scanner.nextLine();
                    cadastrarBebida(Sucos, suco);

                    System.out.print("Digite o nome do(a) vinho: ");
                    String vinho = scanner.nextLine();
                    cadastrarBebida(Vinhos, vinho);

                    break;
                case "2":
                    System.out.println("Refrigerantes:");
                    mostraBebida(Refrigerantes);
                    System.out.println("Sucos:");
                    mostraBebida(Sucos);
                    System.out.println("Vinhos:");
                    mostraBebida(Vinhos);
                    break;
                case "3":
                    System.out.println("Encerrando o programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void mostraBebida(String[] refrigerantes) {
    }

    private static void cadastrarBebida(String[] vetor, String bebida) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == null) {
                vetor[i] = bebida;
                System.out.println("Bebida cadastrada com sucesso.");
                return;
            }
        }
        System.out.println("O limite de bebidas foi atingido. Não é possível cadastrar mais.");
    }

    private static void imprimirBebidas(String[] vetor) {
        for (String bebida : vetor) {
            if (bebida != null) {
                System.out.println(bebida);
            }
        }
    }
}
