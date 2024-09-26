/* 09/25/24
I did not change the people's names to Overwatch
characters... they just magically happened to be
Overwatch characters. */
public class Lab4Driver {

	public static void main(String[] args) {
		
		Group1 group1 = new Group1("Supports");
		
		group1.addPerson("Juno", 2763, 19);
		group1.addPerson("Lucio", 8750, 28);
		group1.addPerson("Moria", 6523, 50);
		group1.addPerson("Kiriko", 1343, 21);
		group1.addPerson("Lifeweaver", 7623, 31);
		
		group1.PrintGroup1();
		
		System.out.println();
		System.out.println("****************    The data for Group 1 is now sorted    ********************");
		System.out.println();
		
		group1.insertionSort() ;
		group1.PrintGroup1();

		System.out.println(); // Start of Part 2
		System.out.println("###################    Part 2     #############################");
		System.out.println();
		
		Group2 group2 = new Group2("Tanks");

		group2.addPerson("Mauga", 8634, 37);
		group2.addPerson("Doomfist", 6354, 47);
		group2.addPerson("D.Va", 7233, 21);
		group2.addPerson("Winston", 2397, 31);
		group2.addPerson("Zarya", 6192, 30);
		
		group2.PrintGroup2();
		
		System.out.println();
		System.out.println("****************    The data for Group 2 is now sorted    ********************");
		System.out.println();
		
		group2.selectionSort() ;
		group2.PrintGroup2() ;

	}

}
