package course.exercicies;

import java.util.Scanner;

public class WhileExercicies {

	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		s.close();
	}

	void ex1() {
		System.out.println("Digite a senha correta: ");
		String senha = s.nextLine();

		while (!senha.equalsIgnoreCase("2002")) {
			System.out.println(" Senha incorreta");
			senha = s.nextLine();
		}
		System.out.println("Acesso permitido");
	}

	void ex2() {
		double x, y;
		x = s.nextDouble();
		y = s.nextDouble();
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			}
			x = s.nextDouble();
			y = s.nextDouble();
		}

	}

	void ex3() {
		System.out.println(" Dê sua votação: 1 (Alcool) 2 (Gasolina) 3 (Diesel) 4 (Fim)");

		int option = s.nextInt();
		int alcool = 0, gasolina = 0, diesel = 0;
		while (option != 4) {
			if (option == 1) {
				alcool += 1;
			} else if (option == 2) {
				gasolina += 1;
			} else if (option == 3) {
				diesel += 1;
			} else {
				System.err.println(" Dê sua votação: 1 (Alcool) 2 (Gasolina) 3 (Diesel) 4 (Fim)");
			}
			option = s.nextInt();
		}
		System.out.println(" Muito obrigado! ");
		System.out.println(" Resultados: ");
		System.out.println(" Alcool: " + alcool);
		System.out.println(" Gasolina " + gasolina);
		System.out.println(" Diesel " + diesel);
		System.out.println("---------------");
	}
}
