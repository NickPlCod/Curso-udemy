package course.capitulos.basicos;

public class EscopoVariable {

	public static void main(String[] args) {

		// VARIAVEIS NAO INICIADAS N�O PODEM SER UTILIZADAS
		double price = 400.00;
		if (price > 200.00) {
			// toda variavel criada, s� pode ser usada enquanto estiver no escopo da
			// estrutura
			double disconto = price * 0.1;
		}

		// O sistema acima s� funcionaria se fosse assim
		// Ou at� se fosse inciada anteriormente
		double disconto;
		if (price > 400) {
			disconto = price;
		} else {
			disconto = 9.9;
		}
		System.out.println(disconto);
	}
}
