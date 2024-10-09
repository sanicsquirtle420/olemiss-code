import java.util.ArrayList; // 10/09/24

public class SearchAndManipulate {
    private ArrayList<Student> students = new ArrayList<Student>();

    private StringBuilder sBuilder1 = new StringBuilder();
    private StringBuilder sBuild2 = new StringBuilder();
    private int count = 0 ;

    // Creating the addStudent method
    public void addStudent(String n , String m , int g) {
        students.add(count, new Student(n , m , g)) ;
        count++ ;
    }

    // Using a binary search to go through the ArrayList
    public int binarySearch(int value) {
        int firstIndex = 0 , lastIndex = count - 1 , middleIndex , position = -1 ;
        boolean found = false ;

        while(!found && firstIndex <= lastIndex){
            middleIndex = (firstIndex + lastIndex) / 2 ;

            if(students.get(middleIndex).getGrade() == value){
                found = true ;
                position = middleIndex ;
            }
            else if(students.get(middleIndex).getGrade() > value) {
                lastIndex = middleIndex - 1 ;
            }
            else {
                firstIndex = middleIndex + 1 ;
            }
        }

        return position ;
    }


    // creating the getStudent method
    public Student getStudent(int index){
        return students.get(index) ;
    }


    // creating a method to convert english into pig latin
    public String convertPhrase(String p) {
        StringBuilder result = new StringBuilder() ;
        String[] words = p.split(" ") ;
        String str = "" ;
        for(int i = 0 ; i < words.length ; i++){
            char firstChar = words[i].charAt(0) ;
            if(words[i].charAt(0) == 'a' || words[i].charAt(0) == 'e' ||
                words[i].charAt(0) == 'i' || words[i].charAt(0) == 'o' ||
                words[i].charAt(0) == 'u' ) {

                sBuilder1 = new StringBuilder(words[i]) ;
                sBuilder1.append("ay") ;

                result.append(" " + sBuilder1) ;
            }
            else {
                sBuild2= new StringBuilder(words[i]) ;
                sBuild2.delete(0 , 1) ;
                sBuild2.append(firstChar + "ay") ;

                result.append(" " + sBuild2) ;
            }
            str = result.toString() ;
        }
        return str.toUpperCase() ;
    }
}
