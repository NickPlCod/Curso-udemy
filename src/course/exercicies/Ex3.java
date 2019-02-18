package course.exercicies;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Digite o primeiro número da equação: ");
		a = sc.nextInt();
		System.out.println("Digite o segundo número da equação: ");
		b = sc.nextInt();
		int soma = a + b;
		System.out.println(" Resultado da soma: " + soma);
	}

}
