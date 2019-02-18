package course.exercicies;

import java.util.Scanner;

public class EstruturaForExercicios {

	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		ex5();
		s.close();
	}

	void ex1() {
		int impares = s.nextInt();
		for (int i = 1; i < impares; i++) {
			if (i % 2 != 0) {
				System.out.println("" + i);
			}
		}
	}

	void ex2() {
		System.out.println(" NUMEROS ENTRE (10, 20): QUANTIDADE");
		int numero = s.nextInt();
		int in = 0, out = 0;
		for (int i = 0; i < numero; i++) {
			int numeros = s.nextInt();
			if (numeros >= 10 && numeros <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		System.out.println(in + " IN");
		System.out.println(out + " OUT");
	}

	static void ex3() {
		System.out.println(" Quantos numeros quer dividir?");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			int a = s.nextInt(), b = s.nextInt();
			if (b != 0) {
				double resultado = (double) a / b;
				System.out.println("Resultado " + resultado);
			} else {
				System.out.println(" Impossivel dividir !");
			}
		}
	}

	static void ex4() {
		int n = s.nextInt();
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				int divisores = i;
				System.out.println(divisores);
			}
		}
	}

	static void ex5() {
		int numero = s.nextInt();
		for (int i = 1; i <= numero; i++) {
			int quadrado = i * i;
			int cubo = quadrado * i;
			System.out.println(i + " " + quadrado + " " + cubo);
		}
	}
}
