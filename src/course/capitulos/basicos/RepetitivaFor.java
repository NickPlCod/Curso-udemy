package course.capitulos.basicos;

public class RepetitivaFor {

	public static void main(String[] args) {
		System.out.println("Quantos numeros você quer somar?");
		java.util.Scanner s = new java.util.Scanner(System.in);
		int n = s.nextInt();

		int sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Soma #1: ");
			int x = s.nextInt();
			sum += x;
		}
		System.out.println("Soma igual a: " + sum);
		s.close();

	}
}
