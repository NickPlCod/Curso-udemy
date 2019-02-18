package course.capitulos.basicos;

import java.util.Scanner;

public class Cp11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

		int time = sc.nextInt();

		if (time <= 12) {
			System.out.println("Good Morning !");
		} else if (time <= 18) {
			System.out.println("Good afternoon!");
		} else {
			System.out.println("Good evening!");
		}

		sc.close();
	}
}
