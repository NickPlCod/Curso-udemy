package course.capitulos.basicos.poo;

import java.util.Scanner;

import course.capitulos.basicos.poo.entities.Conta;

public class Temp4Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String titular = sc.next();
		System.out.print("Is there na initial deposit (y/n) ? ");
		Conta c = new Conta(accountNumber, titular);
		sc.nextLine();
		char confirmar = sc.next().charAt(0);
		if (confirmar == 'y') {
			System.out.print("Enter initial deposit: ");
			double deposit = sc.nextDouble();
			c = new Conta(accountNumber, titular, deposit);
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(c);
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		c.depositar(deposit);
		System.out.println();
		System.err.println("Updated account data: ");
		System.err.println(c);
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		c.saque(saque);
		System.out.print("Updated account data: ");
		System.out.print(c);

		sc.close();
	}
}
