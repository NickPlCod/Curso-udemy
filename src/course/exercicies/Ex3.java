package course.exercicies;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Digite o primeiro n�mero da equa��o: ");
		a = sc.nextInt();
		System.out.println("Digite o segundo n�mero da equa��o: ");
		b = sc.nextInt();
		int soma = a + b;
		System.out.println(" Resultado da soma: " + soma);
	}

}
