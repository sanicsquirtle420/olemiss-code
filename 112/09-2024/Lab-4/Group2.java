/* 09/25/2024
These sorting functions were also kinda goofy */
import java.util.ArrayList; // <- I hate you

public class Group2 {

	private ArrayList<Person> people2 = new ArrayList<Person>();
	private String groupName2;
	
	public Group2 (String name) {
		groupName2 = name;
	}
	
	public void addPerson (String name, int id, int age) {
		people2.add(new Person(name, id, age));	
	}
	
	public void PrintGroup2() {
		System.out.println("Group 2's name is: " + groupName2);
		for(int i = 0 ; i < people2.size() ; i++) {
			System.out.println(people2.get(i).toString()) ;
		}
		
	}
	
	public void selectionSort() {
		int i ;
		for(int outer= 0; outer < people2.size() - 1 ; outer++) {
			i = outer ;
			for(int inner = outer + 1; inner< people2.size() ; inner++) {
				if( people2.get(inner).getAge() < people2.get(i).getAge()) {
					i = inner ;
				}
			}
			Person temp = people2.get(outer) ;
			people2.set(outer , people2.get(i)) ;
			people2.set(i , temp) ;
		}
	}
}
