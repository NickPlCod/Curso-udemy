package course.capitulos.basicos;

public class StringFunctions {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG   ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		// ELIMINAR OS ESPAÇOS DO FINAL
		String s03 = original.trim();
		// gera uma nova string do index até a seguir
		String s04 = original.substring(2);
		// (2,9) gera uma nova string do index até o limite
		String s05 = original.substring(2, 9);
		// troca o a minusculo por x
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		// Mostra o index onde se encontra os parametros
		int i = original.indexOf("bc");
		// Mostra o index onde se encontra os parametros NO FINAL
		int j = original.lastIndexOf("bc");
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);

		String s = "Potato apple orange lemon";

		String[] split = s.split(" ");
		System.out.println(split[0] + "," + split[1] + "," + split[2] + "," + split[3]);
	}
}
