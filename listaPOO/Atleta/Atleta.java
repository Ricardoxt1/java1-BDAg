package Atleta;

//atributo nome, sexo, peso e altura;

//construtor para ler os valores;

//imprimir os dados do atleta;

//calcular IMC peso/altura*altura
// <=17 "muito baixo";
// entre 17 e 18,49 "abaixo do peso";
// entre 18,5 e 24,99 "peso normal";
// entre 25 e 29,99 "acima do peso";
// entre 30 e 34,99 "obesidade 1";
// entre 35 e 39,99 "obesidade 2 (severa)";
// acima 40 "obesidade 3 (mórbida)"

public class Atleta {
    private String nome;
    private String sexo;
    private float peso;
    private float altura;

    public Atleta(String nome, String sexo, float peso, float altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getImprimir() {
        return "atleta com nome " + nome + " tem seu sexo " + sexo + " e peso " + peso
                + " completamentando com sua altura" + altura;
    }

    public String calcularIMC() {
        float imc = peso / (altura * altura);

        if (imc <= 17) {
            return "IMC: " + imc + " - Muito baixo";
        } else if (imc >= 17 && imc <= 18.49) {
            return "IMC: " + imc + " - Abaixo do peso";

        } else if (imc >= 18.5 && imc <= 24.99) {
            return "IMC: " + imc + " - Peso normal";

        } else if (imc >= 25 && imc <= 29.99) {
            return "IMC: " + imc + " - Acima do peso";

        } else if (imc >= 30 && imc <= 34.99) {
            return "IMC: " + imc + " - Obesidade 1";

        } else if (imc >= 35 && imc <= 39.99) {
            return "IMC: " + imc + " - Obesidade 2 (severa)";

        } else {
            return "IMC: " + imc + " - Obesidade 3 (mórbida)";

        }
    }
}
