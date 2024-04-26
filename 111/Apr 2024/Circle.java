/*
04/26/2024
Program Description: This program contains the Circle class. 
*/
public class Circle {
	private double radius ;
	
	public Circle() { 	// no-arg constructor
		radius = 0.0 ;
	}
	
	public Circle(double rad) { 	// overloaded constructor
		radius = rad ;
	}
	
	public void setRadius(double rad) {
		radius = rad ;
	}
	
	public double getRadius() {
		return radius ;
	}
	
	public double getArea() {
		return radius * radius * Math.PI ;
	}
	
	public double getDiameter() {
		return 2 * radius ;
	}
	
	public double getCircumference() {
		return 2 * Math.PI * radius ;
	}
}
