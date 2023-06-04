
public class Principal {

	public static void main(String[] args) {
		Círculo[] círculos = new Círculo[3];
		círculos[0] = new Círculo(1, 2, 3);
		círculos[1] = new Círculo(-1, 0, (float) 2.5);
		círculos[2] = new Círculo(5, 5, 1);

		for (Círculo c : círculos) {
			c.imprimir();
			System.out.println("Área: " + c.calcularÁrea());
			System.out.println("Perímetro: " + c.calcularPerímetro());
			System.out.println();
		}

		Cilindro[] cilindros = new Cilindro[3];
		cilindros[0] = new Cilindro(1, 2, 3, 4);
		cilindros[1] = new Cilindro(-1, 0, (float) 2.5, 2);
		cilindros[2] = new Cilindro(5, 5, 1, (float) 3.5);

		for (Cilindro cil : cilindros) {
			cil.imprimir();
			System.out.println("Área: " + cil.calcularÁrea());
			System.out.println("Volume: " + cil.calcularVolume());
			System.out.println();
		}

		Quadrado[] quadrados = new Quadrado[3];
		quadrados[0] = new Quadrado(1, 2, 5);
		quadrados[1] = new Quadrado(-1, 0, 2);
		quadrados[2] = new Quadrado(5, 5, 3);

		for (Quadrado q : quadrados) {
			q.imprimir();
			System.out.println("Área: " + q.calcularÁrea());
			System.out.println("Perímetro: " + q.calcularPerímetro());
			System.out.println();
		}

	}

}
