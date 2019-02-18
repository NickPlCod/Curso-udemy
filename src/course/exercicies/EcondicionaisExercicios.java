package course.exercicies;

import java.util.Scanner;

public class EcondicionaisExercicios {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// EX - 5
		double salario = sc.nextDouble();

		double imposto;
		if (salario <= 2000) {
		} else if (salario <= 3000) {

		} else if (salario <= 4500) {

		} else {

		}

		sc.close();
	}

	void ex1() {
		// EX - 1
		int number = sc.nextInt();
		if (number < 0) {
			System.out.println(" NEGATIVO");

		} else {
			System.out.println(" POSITIVO");
		}
	}

	void ex2() {
		// EX - 2
		System.out.println(" Digite o primeiro numero:");
		int a = sc.nextInt();
		System.out.println(" Digite o segundo numero:");
		int b = sc.nextInt();
		if (a % b == 0) {
			System.out.println(" Multiplos");
		} else {
			System.out.println(" Não são multiplos");
		}
	}

	void ex3() {

		// EX - 3
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int c1 = sc.nextInt();
		if (a1 > b1 && a1 > c1) {
			System.out.println("Numero maior é... " + a1);
		} else if (b1 > c1) {
			System.out.println("Numero maior é... " + b1);
		} else {
			System.out.println("Numero maior é... " + c1);
		}
	}

	void ex4() {
		int comeco = sc.nextInt();
		int finalle = sc.nextInt();
		int durou;
		if (comeco < finalle) {
			durou = finalle - comeco;
		} else {
			durou = 24 - comeco + finalle;
		}
		System.out.println("JOGO DUROU " + durou);
	}

	void ex5() {
		int pedido = sc.nextInt();
		int quantidade = sc.nextInt();
		double preco = 0;
		if (pedido == 1) {
			preco = 4;
		} else if (pedido == 2) {
			preco = 4.50;
		} else if (pedido == 3) {
			preco = 5;
		} else if (pedido == 4) {
			preco = 2;
		} else if (pedido == 5) {
			preco = 1.50;
		} else {
			System.out.println(" Pedido não reconhecido");
		}

		double conta = preco * quantidade;

		System.out.println("Total: " + conta);
	}

	void ex6() {
		boolean b = true;
		while (b) {
			int n1 = sc.nextInt();
			sc.nextLine();
			if (n1 >= 0 && n1 < 25) {
				System.out.println(n1);
				System.out.println(" Intervalo [0, 25]");
			} else if (n1 >= 25 && n1 < 50) {
				System.out.println(" Intervalo [25, 50]");
			} else if (n1 >= 50 && n1 < 75) {
				System.out.println(" Intervalo [50, 75]");
			} else if (n1 >= 75 && n1 < 100) {
				System.out.println(" Intervalo [75, 100]");
			} else {
				System.out.println(" Nenhum dos intervalos  !");
				b = false;
			}
		}
	}

	void ex7() {
		double x, y;
		x = sc.nextDouble();
		y = sc.nextDouble();

		if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else {
			System.out.println("ORIGEM");
		}

	}
}
