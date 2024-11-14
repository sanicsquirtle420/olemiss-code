import java.text.DecimalFormat;

public class Riders {
	//variables
	private String name;
	private String town;
	private int id;
	private int lapsComp;

	public Riders() {
		name = " ";
		town = " ";
		id = 0;
		lapsComp = 0;
	}

	public Riders(String name, String town, int id, int lapscomp) {
		this.name = name;
		this.town = town;
		this.id = id;
		this.lapsComp = lapscomp;
	}
	//getters and setters
	public String getName() {
		return name;
	}

	public String getTown() {
		return town ;
	}

	public int getId() {
		return id;
	}

	public int getLapscomp() {
		return lapsComp;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public void setLapscomp(int lapsComp) {
		this.lapsComp = lapsComp ;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("Name: %-20s  From: %18s, ID#: %d - Laps Completed: %d", name , town , id , lapsComp);
	}
}
