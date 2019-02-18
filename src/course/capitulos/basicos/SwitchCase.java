package course.capitulos.basicos;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String day;
		if (x == 1) {
			day = "Sunday";
		} else if (x == 2) {
			day = "Monday";
		} else if (x == 3) {
			day = "Tuesday";
		} else if (x == 4) {
			day = "Wednesday";
		} else if (x == 5) {
			day = "Thursday";
		} else if (x == 6) {
			day = "Friday";
		} else if (x == 7) {
			day = "Saturday";
		} else {
			day = "Invalid value";
		}
		System.out.println("Day: " + day);

		// SWITCH - ALTERNATIVO
		int y = sc.nextInt();
		String d;
		switch (y) {
		case 1:
			d = "Cachorro";
			break;
		case 2:
			d = "Gato";
			break;
		case 3:
			d = "Tuesday";
			break;
		case 4:
			d = "Wednesday";
			break;
		case 5:
			d = "Thursday";
			break;
		case 6:
			d = "Friday";
			break;
		case 7:
			d = "Saturday";
			break;
		default:
			d = "Invalid value";
		}
		System.out.println("Day: " + d);
	}
}
