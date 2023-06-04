class Ponto {
    private float x;
    private float y;

    public Ponto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void SetX(float x) {
        this.x = x;
    }

    public void SetY(float y) {
        this.y = y;
    }
}

class Círculo extends Ponto {
    private float raio;

    public Círculo(float x, float y, float raio) {
        super(x, y);
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public void imprimir() {
        System.out.println("Círculo:");
        System.out.println("Centro: (" + getX() + ", " + getY() + ")");
        System.out.println("Raio: " + raio);
    }

    public float calcularÁrea() {
        return (float) (Math.PI * raio * raio);
    }

    public float calcularPerímetro() {
        return (float) (2 * Math.PI * raio);
    }
}

class Quadrado extends Ponto {
    private float lado;

    public Quadrado(float x, float y, float lado) {
        super(x, y);
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public void imprimir() {
        System.out.println("Quadrado:");
        System.out.println("Canto superior esquerdo: (" + getX() + ", " + getY() + ")");
        System.out.println("Lado: " + lado);
    }

    public float calcularÁrea() {
        return lado * lado;
    }

    public float calcularPerímetro() {
        return 4 * lado;
    }
}

class Cilindro extends Círculo {
    private float altura;

    public Cilindro(float x, float y, float d, float altura) {
        super(x, y, (float) d);
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void imprimir() {
        System.out.println("Cilindro:");
        System.out.println("Base: Centro (" + getX() + ", " + getY() + "), Raio: " + getRaio());
        System.out.println("Altura: " + altura);
    }

    public float calcularÁrea() {
        return 2 * super.calcularÁrea() + calcularÁreaLateral();
    }

    public float calcularVolume() {
        return super.calcularÁrea() * altura;
    }

    private float calcularÁreaLateral() {
        return (float) (2 * Math.PI * getRaio() * altura);
    }
}
