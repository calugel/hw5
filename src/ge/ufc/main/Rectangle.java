package ge.ufc.main;

public class Rectangle extends Figure {

		private double width;
		private double length;
		
		
		private static double maxWidth;
		private static double maxLength;

		
		
		static
		{
		maxWidth = 200;
		maxLength = 300;
		}
		
		
		
		// setter methods
		
		public void setWidth(double width) {
			if (width > maxWidth) {
				this.width = maxWidth; 
			}else {
				this.width = width;
			}
		}
		
		
		public void setLength(double length) {
			if(length > maxLength) {
				this.length = maxLength;
			}else {
				this.length = length;
			}
		}
		
		
		
		// getter methods
		
		protected double getWidth() {
			return width;
		}
				
		protected double getLength() {
			return length;
		}
		
		
		@Override
		protected double getArea() {
			return width * length;
		}
		
		protected double getArea(double width, double length) {
			return width * length;
		}
		
		protected int getArea(int width, int length) {
			return width * length;
		}
		
		
		
		@Override
		protected double getPerimeter() {
			return 2 * (width + length);
		}
		
		protected double getPerimeter(double width, double length) {
			return 2 * (width + length);
		}
		
		protected double getPertimeter(int width, int length) {
			return 2 * (width + length);
		}

		
		
		
		// constructor methods
		
		public Rectangle(double width, double length) {
			setWidth(width);
			setLength(length);
		}
			
		
		public Rectangle() {
			this(3,4);
		}
		
			
		
}

	

