package course.exercicies;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name:");
		String name = sc.next();
		System.out.println("How many beedrooms are there in your house?");
		int house = sc.nextInt();
		System.out.println("Enter product price: ");
		double priceProduct = sc.nextDouble();
		System.out.println("Enter your last name, age and height (same line):");
		String lastName = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		System.out.printf("Name: %s, House: %d, Price: %.2f, last_name, age, and height: %n%s, %d, %.2f", name, house,
				priceProduct, lastName, age, height);

		sc.close();

	}
}
