/*
04/24/24
CarDemo.java is needed to test this class.
*/
public class Car {
	private String make ;
	private String yearModel ;
	
	public Car(String m , String ym) {
		make = m ;
		yearModel = ym ;
	}
	
	public void setMake(String m) {
		make = m ;
	}
	
	public void setYearModel (String ym) {
		yearModel = ym ;
	}
	
	public String getMake() {
		return make ;
	}
	
	public String getYearModel () {
		return yearModel ;
	}
}
