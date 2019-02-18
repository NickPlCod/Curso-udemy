package course.capitulos.basicos.poo.entities;

public class Triangle {

	public double a, b, c;

	public double calcularArea() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
