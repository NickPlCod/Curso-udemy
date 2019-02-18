package course.capitulos.basicos;

public class Cp6 {

	public static void main(String[] args) {
		double n1 = 10;
		double n2 = 30;
		String s = "ABC";
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		System.out.println("-------------");
		n1 *= 2;
		n2 += n1;
		s += "DEF";
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);

		int a = 10;
		a++;
		System.out.println(a);

		int a1 = 10;
		int b1 = a++;
		System.out.println(a1);
		System.out.println(b1);

		int a2 = 10;
		int b2 = ++a2;
		System.out.println(a2);
		System.out.println(b2);

	}
}
