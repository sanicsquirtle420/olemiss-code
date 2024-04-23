/*
04/23/24
This program is needed for RectangleTest.java because
this is the Rectangle class
*/
public class Rectangle {
	private double length ;
	private double width ; // data fields
	
	public Rectangle() { 	// constructors
		length = 0.0 ; 	// no-arg constructors initalizes variables
		width = 0.0 ;
	}
	
	public Rectangle(double len, double wid) { 	// overloaded constructor
		length = len ;
		width = wid ;
	}
	
	public void setLength (double len) { 	// setters (mutator methods)
		length = len ;
	}
	
	public void setWidth (double wid) {
		width = wid ;
	}
	
	public double getLength () { 	// getters (accessor methods)
		return length ;
	}
	
	public double getWidth () { 
		return width ;
	}
	
	public double getArea () { 
		return length * width ;
	}
}
