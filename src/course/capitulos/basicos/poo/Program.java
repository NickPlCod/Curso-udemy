package course.capitulos.basicos.poo;

import java.util.Locale;
import java.util.Scanner;

import course.capitulos.basicos.poo.entities.Employee;
import course.capitulos.basicos.poo.entities.Produto;
import course.capitulos.basicos.poo.entities.Rectangle;
import course.capitulos.basicos.poo.entities.Student;
import course.capitulos.basicos.poo.entities.Triangle;
import course.capitulos.basicos.poo.util.CurrencyConverter;

public class Program {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		product();
		sc.close();

	}

	public void test() {
		sc.useLocale(Locale.US);
		System.out.print("Qual o preço do DOLAR: ");

		double preço = sc.nextDouble();

		System.out.print("Quantos dollars vai comprar: ");

		double quant_dolar = sc.nextDouble();

		double result = CurrencyConverter.conversao(preço, quant_dolar);

		System.out.printf("%.2f", result);

	}

	public void triangleCalcule() {
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println(" Triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println(" Triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.calcularArea();
		double areaY = y.calcularArea();

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle X area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger Área: X");
		} else {
			System.out.println("Larger Área: Y");
		}
	}

	public static void product() {

		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.next();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Qtd in stock: ");
		int quantity = sc.nextInt();
		System.out.println();
		Produto p = new Produto(name, price);
		p.setName("Computer");
		System.out.println(" Updated name: " + p.getName());
		p.setPrice(2000);
		System.out.println(" Updated price: " + p.getPrice());
		System.out.println(" Product data: " + p);
		System.out.println();
		System.out.println(" Enter the number of products to be added in stock: ");
		int qtd = sc.nextInt();
		p.addProducts(qtd);
		System.out.println();
		System.out.println(" Product data: " + p);

		System.out.println();
		System.out.println(" Enter the number of products to be removed from stock: ");
		int remove = sc.nextInt();
		p.removeProducts(remove);
		System.out.println();
		System.out.println(" Product data: " + p);
	}

	public void RectangleEx() {
		System.out.println(" Enter retangule width and height: ");
		Rectangle rectangle = new Rectangle();
		rectangle.width = sc.nextInt();
		rectangle.height = sc.nextInt();
		System.out.println(rectangle);
	}

	public void employee() {
		Employee e = new Employee();
		System.out.println("Name: ");
		e.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		e.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		e.tax = sc.nextDouble();

		System.out.println(" Employee: " + e);

		System.out.println(" Which percentage to increase salary ? ");
		double tax = sc.nextDouble();

		e.increaseSalary(tax);
		System.out.println("Updated data: " + e);
	}

	public void student() {

		Student aluno = new Student();
		aluno.name = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();

		System.out.println(" Final graded: " + aluno.finallynote());
		if (aluno.finallynote() >= 60.0) {
			System.out.println(" Pass");
		} else {
			System.out.println(" FAILED ");
			System.out.println(" Missing " + aluno.MissingPoints() + " points");
		}
	}
}
