import java.util.ArrayList;

public class CycleClub {
	private String teamName;
	private String teamAbv;
	private Riders[] riders;
	private int logicalLength;

	public CycleClub() {
		teamName = " ";
		teamAbv = " ";
		riders = new Riders[50];
	}

	public CycleClub(String name, String teamAbv) {
		teamName = name;
		this.teamAbv = teamAbv;
		riders = new Riders[50];
	}
	//getters and setters
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamAbv() {
		return teamAbv;
	}

	public void setTeamAbv(String teamAbv) {
		this.teamAbv = teamAbv;
	}
	
	public Riders[] getRider() {
		return riders ;
	}

	//add riders to arraylist
	public void addRiders(String name, String town, int id, int lapscomp) {
		riders[logicalLength] = new Riders(name, town, id, lapscomp);
		logicalLength++ ;

	}
	//printsInfo on team and riders
	public void printInfo() {
		System.out.println("\tTeam Name: " + teamName + " (" + teamAbv + ")");
		for(int i = 0; i < logicalLength ; i++) {
			System.out.println(riders[i].toString());
		}
		System.out.println("\tHad a total lap count of: " + calcTotalLaps());
		System.out.println("-------------------------------------");
	}

	public void sortRiders() {
		quickSort(0, logicalLength - 1);
	}

	public void quickSort(int min, int max){
		int pivot;
		if(min < max) {
			pivot = partition(min, max);
			quickSort(min, (pivot-1));
			quickSort((pivot + 1), max);
		}
	}
	
	public int partition(int min, int max){
		Riders pivot = riders[min] ;
		int left = min;
		int right = max;
		while(left < right){
			while(riders[left].getLapscomp() >= pivot.getLapscomp() && left < right){
				left++;
			}
			while(riders[right].getLapscomp() < pivot.getLapscomp()){
				right--;
			}
			if(left < right){
				swap(left, right);
			}
		}
		swap(min, right);

		return right;
	}

	public void swap(int left, int right){
		Riders temp = riders[left];
		riders[left] = riders[right];
		riders[right] = temp;
	}

	//calculates total laps
	public int calcTotalLaps() {
		int laps = 0 ;
		for(int i = 0; i < logicalLength ; i++) {
			laps += riders[i].getLapscomp() ;
		}
		return laps;
	}

}
