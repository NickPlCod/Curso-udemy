package course.capitulos.basicos.poo.entities;

public class Student {

	public String name;
	public double nota1, nota2, nota3;

	public double finallynote() {
		return nota1 + nota2 + nota3;
	}

	public double MissingPoints() {
		return 60.0 - finallynote();
	}
}
