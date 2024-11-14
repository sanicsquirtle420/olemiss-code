import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BikeEvent {

    private String eventName;
    private ArrayList<CycleClub> clubs;
    //scans file

    public BikeEvent() {
        eventName = "";
        clubs = new ArrayList<>();
    }

    public BikeEvent(String event) {
        eventName = event;
        clubs = new ArrayList<>();
    }

    public void setEventName(String event){
        eventName = event;
    }

    public String getEventName(){
        return eventName;
    }
    public void readData() throws FileNotFoundException {
        File file = new File("ClubList.txt") ;
        Scanner scan = new Scanner(file) ;
        //reads in file and creates club and riders objects
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] token = line.split(",");
            if (token.length == 2) {
                clubs.add(new CycleClub(token[0], token[1]));
            } else {
                clubs.get(clubs.size() - 1).addRiders(token[0], token[1], Integer.parseInt(token[2]), Integer.parseInt(token[3]));
            }
        }
        scan.close();
    }

    public void sortData() {
        //sorts the data
        for (int i = 0; i < clubs.size(); i++) {
            clubs.get(i).sortRiders();
        }
    }
    public void printData() {
        System.out.println("The standings of the " + eventName + " event are:");
        System.out.println("---------------------------------------------");
        System.out.println();
        for (int i = 0; i < clubs.size() ; i++) {
            clubs.get(i).printInfo();
            System.out.println();
        }
    }


}
