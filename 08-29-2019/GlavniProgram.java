package fax;

import java.util.List;

public class GlavniProgram {

	public static void main(String[] args) {
		Student s1 = new Student("Milan", "Pavicevic", 1976, 3, 9.5);
		Student s3=new Student("Bojana", "Golubovic", 1979, 4, 10.00);
		Student s2=new Student("Petar", "Petrovic", 1985, 4, 9.0);
		Profesor p1 = new Profesor("Nebojisa", "Misevic", 1973, "profesor");
		Profesor p2=new Profesor("Dejan", "Zivkovic", 1978, "magistar");
		p1.povecajListu("Informatika");
		p1.povecajListu("Matematika");
		System.out.println(p1.ispis());
		System.out.println(s1.ispisStudenta());
		p2.povecajListu("Osnove Jave");
		p2.povecajListu("Java OOP");
		System.out.println(p2.ispis());
//		p1.smanjiListu("Matematika");
//		System.out.println(p1.ispis());
	}

}
