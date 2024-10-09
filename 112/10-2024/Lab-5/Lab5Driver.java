import java.util.Scanner; // 10/09/24

public class Lab5Driver {
    public static void main (String[] args){

        SearchAndManipulate work = new SearchAndManipulate();

        System.out.println(" *******  Part 1  *******");
        System.out.println();
        work.addStudent("D.Va", "Ed", 45);
        work.addStudent("Sigma", "EE", 50);
        work.addStudent("Ana", "EE", 69);
        work.addStudent("Sombra", "CS", 72);
        work.addStudent("Winston", "CS", 74);
        work.addStudent("Juno", "CS", 77);
        work.addStudent("Kiriko", "ME", 78);
        work.addStudent("Soldier 76", "CS", 81);
        work.addStudent("Ashe", "CS", 83);
        work.addStudent("Cassidy", "CS", 86);
        work.addStudent("Tracer", "CS", 89);
        work.addStudent("Mauga", "CS", 90);
        work.addStudent("Junkrat", "CS", 93);
        work.addStudent("Venture", "CS", 95);
        work.addStudent("Mei", "EE", 99);
        work.addStudent("Mercy", "CS", 100); // overwatch characters ?!

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the grade finder section!");
        System.out.println();
        System.out.println("Enter a grade to search for or -1 to exit");

        int grade = keyboard.nextInt();

        while(grade != -1){
            int index = work.binarySearch(grade);
            if(index == -1){
                System.out.println("The grade " + grade + " wasn't earned by any student.");
            }
            else {
                System.out.println("\t" + grade + " was earned by:");
                System.out.println("\t" + work.getStudent(index));
            }
            System.out.println("Enter a grade to search for or -1 to exit");
            grade = keyboard.nextInt();
        }

        System.out.println();


        System.out.println(" *****   Part 2   *******");
        System.out.println();
        System.out.println("The follow is the Pig Latin creator section");
        System.out.println();
        keyboard.nextLine(); // clears the buffer of any leftover enter/return

        System.out.println("Would you like to convert a phrase to Pig Latin? y/n");
        char convert = keyboard.nextLine().toLowerCase().charAt(0);

        while(convert != 'n') {
             System.out.println("Enter the phrase without punctuations (just characters and spaces only) you'd like to convert to Pig Latin");
             String phrase = keyboard.nextLine();

             String conversion = work.convertPhrase(phrase);
             System.out.println();
             System.out.println("\tThe phrase in Pig Latin:");
             System.out.println("\t"+ conversion);
             System.out.println();
             System.out.println();

             System.out.println("Would you like to convert another phrase to Pig Latin? y/n");
             convert = keyboard.nextLine().toLowerCase().charAt(0);
        }

        
        System.out.println();
        System.out.println("Thank you for using the grade finder and Pig Latin program");
    }
}
