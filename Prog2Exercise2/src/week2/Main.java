package week2;

public class Main {

	public static void main(String[] args) {
		
		Class1 c = new Class1(); //create new object name as c
		System.out.println(c.x);
		System.out.println(c.s);
		c.printHi();
		
		Class1 d = new Class1(); //create second object name as d
		System.out.println(d.s);
		System.out.println(d.x);
		d.printHi();
		
		Class2 e = new Class2();
		e.printSum();
		e.printcgpa();
		
		Class3 f = new Class3();
		f.printFood();
	}

}
