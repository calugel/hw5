package ge.ufc.main;
import ge.ufc.main1.Square;


public class Main {
	public static void main(String[] args) {
		
		/* FIGURE */
		
		Figure.sayHello("World");		// Hello World
		
		Figure f = new Figure();
		System.out.println(f.getArea());		//-1
		
		Figure f1 = new Figure("figure");		//this is a figure
		System.out.println(f1.getPerimeter());		//-1
		
		
		/* RECTANGLE */
		
		Rectangle r = new Rectangle(20,25);
		System.out.println(r.getArea());		//500
		System.out.println(r.getArea(4.5, 10.5));		//47.25
		System.out.println(r.getArea(5,6));		//30
		System.out.println(r.getPerimeter());		//90   =    2 * (20 + 25)
		System.out.println(r.getPerimeter(25.5,24.5));		//100

		
		Rectangle r1 = new Rectangle();		// 3,4 default parameters
		System.out.println(r1.getArea());		//12	
		
		
		
		/* INSTANCEOF */
		
		System.out.println(r instanceof Rectangle);		//true
		System.out.println(f instanceof Rectangle);		//false
		System.out.println(r instanceof Figure);		//true
		System.out.println(f instanceof Figure);		//true
		
		
		/* SQUARE */
		
		// getters from class square, called by parent(super) class  - overridden methods
		Square s = new Square();
		System.out.println(s.getArea(5,7));		//35
		System.out.println(s.getPerimeter(6,7));		//26
		
		
		//getters called from Square - overridden methods
		Square s1 = new Square(5);
		System.out.println(s1.getArea());		//25
		System.out.println(s1.getPerimeter());		//20


		
	}
}
