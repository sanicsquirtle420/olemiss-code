/* 09/25/24
This made me realize that I like Arrays more because 
ArrayLists make my brain not want to function. */
public class Group1 {

	private int counter = 0;
	private Person[] people = new Person[10];
	private String groupName1;
	
	public Group1 (String name) {
		groupName1 = name;
	}
	
	public void addPerson (String name, int id, int age) {
		people[counter] = new Person(name, id, age);
		counter++;	
	}
	
	public void PrintGroup1() {
		System.out.println("Group 1's name is: " + groupName1);
		for(int i = 0 ; i < counter ; i++) {
			System.out.println(people[i]) ;
		}
	}
	
	public void insertionSort() {
		for (int outerLoop = 1; outerLoop < counter ; outerLoop++) {
			Person key = people[outerLoop];

			int index = outerLoop - 1;
			while ((index > -1) && (people[index].getAge() < key.getAge())) {

				people[index + 1] =  people[index]  ;
				index--;
			}
			people[index + 1] = key ;
		}
	}
}
