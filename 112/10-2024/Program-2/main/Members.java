/* 10/02/24
needed to run the driver and test classes */
public class Members {
	//fields
	private String name;
	private String ID;
	private String classification;
	private String hometown;
	
	//constructors
	public Members() {
		name = "" ;
		ID = "" ;
		classification = "" ;
		hometown = "" ;
	}
	
	public Members(String name, String id, String classification, String hometown) {
		this.name = name;
		ID = id;
		this.classification = classification;
		this.hometown = hometown ;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(String id) {
		ID = id;
	}
	
	public void setClassification(String classification) {
		this.classification = classification;
	}
	
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	
	//getters
	public String getName() {
		return name ;
	}
	
	public String getID() {
		return ID ;
	}
	
	public String getClassification () {
		return classification ;
	}
	
	public String getHometown() {
		return hometown ;
	}
	
	//toString
	public String toString() {
		return String.format("%16s, ID Number: %s, is a %9s from %s: ", name , ID , classification , hometown);
	}
}
