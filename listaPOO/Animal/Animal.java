package Animal;
//atributo nome, tipo e raça;

//construtor que receba os parametros dos animais;
//imprimir os dados dos animais;

//principal falando sobre o nome: mel, tipo: cachorro e raça: poodle;
class Animal {
    private String nome;
    private String tipo;
    private String raça;

    public Animal(String nome, String tipo, String raça) {
        this.nome = nome;
        this.tipo = tipo;
        this.raça = raça;
    }

    public String getImprimir() {
        return "O nome do " + tipo + " é " + nome + " e a raça " + raça;
    }
}
