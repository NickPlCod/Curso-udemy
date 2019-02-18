package course.capitulos.basicos.poo.util.copy;

public class CurrencyConverter {

	public static double conversao(double price, double amount) {
		double conversor = (price * amount) * 6 / 100 + (price * amount);
		return conversor;

	}
}
