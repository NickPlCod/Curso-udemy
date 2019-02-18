package course.capitulos.basicos;

import java.util.Locale;
import java.util.Scanner;

public class DoWhileSistema {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		char resp;
		do {
			System.out.print(" Enter a number: ");
			double n = s.nextDouble();
			double sq = Math.sqrt(n);
			System.out.printf("Square root = %.3f%n", sq);

			System.out.println(" Repeat S/N");
			resp = s.next().charAt(0);
		} while (resp != 'N');

		s.close();
	}
}
