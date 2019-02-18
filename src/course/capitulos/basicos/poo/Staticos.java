package course.capitulos.basicos.poo;

import java.util.Locale;
import java.util.Scanner;

import course.capitulos.basicos.poo.util.Calculator;

public class Staticos {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		sc.useLocale(Locale.US);
		System.out.println();
	}

	void sc() {
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
	}
}
