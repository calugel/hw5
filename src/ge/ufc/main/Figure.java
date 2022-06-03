package ge.ufc.main;

public class Figure {

	// getter methods
	
	double getArea() {
		return -1;
	}
	
	double getPerimeter() {
		return -1;
	}
	
	
	
	// static method
	
	public final static void sayHello(String s) {
		System.out.println("Hello " + s);
	}
	
	
	// constructor methods
	
	public Figure(String word){
		System.out.println("this is a " + word);
	}
	
	public Figure() {
		
	}
	
}
