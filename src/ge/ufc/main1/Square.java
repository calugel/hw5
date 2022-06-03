package ge.ufc.main1;

import ge.ufc.main.Rectangle;
//import ge.ufc.main.Figure;

public final class Square extends Rectangle{
	
	// field variable
	
	private double side;
	
	
	
	// constructor methods
	
	public Square(double side) {
		this.side = side;
	}
	
	public Square(){
		
	}
	
	
	
	
	// getter methods
	
	@Override
	public double getArea() {
		return this.side * this.side;
	}
	
	@Override
	public double getArea(double x, double y) {
		return super.getArea(x,y);
	}
	
	
	
	
	@Override
	public double getPerimeter() {
		return 4 * this.side;
	}
	
	@Override
	public double getPerimeter(double x,double y) {
		return super.getPerimeter(x,y);
	}
	
	
	
	
	
	
	
	
}
