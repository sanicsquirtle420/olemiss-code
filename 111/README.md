# Computer Science I (Java I)
Taken: Spring 2024

## Learned
- Java Basics (syntax, data types, etc.)
- Scanner, Random, and Math classes
- Formatting doubles with `printf`
- `if` / `else if` / `else`, `while`, and `for` loops
- `switch` statements
- Regular Object Classes
- Simple Debugging (logic and compile errors)

## Final Program
### Circle.java
```
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
```
[Source Code:](https://github.com/sanicsquirtle420/olemiss-code/blob/main/111/Apr%202024/Circle.java)
 This is an example of a regular object class
 ### CircleTest.java
 ```
import java.util.Scanner ;

public class CircleTest {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("Enter the radius of the circle: ") ;
		double r = input.nextDouble() ; 
		
		Circle myCircle = new Circle(r) ;
		
		double a = myCircle.getArea() ; 
		double d = myCircle.getDiameter() ;
		double c = myCircle.getCircumference() ;
		
		System.out.printf("\nThe area of the circle is: %.2f" , a) ;
		System.out.printf("\nThe diameter of the circle is: %.2f" , d) ;
		System.out.printf("\nThe circumference of the circle is: %.2f" , c) ;
	}
}
 ```
[Source Code: ](https://github.com/sanicsquirtle420/olemiss-code/blob/main/111/Apr%202024/CircleTest.java)
 This is a driver for the Circle class in `Circle.java`. 
