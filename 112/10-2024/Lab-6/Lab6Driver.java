import java.util.ArrayList ;
import java.io.File ;
import java.io.FileNotFoundException ;
import java.util.Scanner ;

public class Lab6Driver {

    public static void main (String [] args) throws FileNotFoundException {
        /** notice that the left declaration is of Shape and the right is Square
         This is an example of Polymorphism */
        Shape box = new Square(9.7, 9.7);
        /** Square doesn't have a getArea method but Shape does, and since Shape is the super class, Square can use Shapes getArea method */
        System.out.println("The area of the square is: " + box.getArea() + " and it's perimeter is " + ((Square) box).getPerimeter());
        /** Because the variable box was defined as a Shape, but it was instantiated as a Square, we don't have access (can't call) the getPerimeter method
         To correct the error, hover your mouse over the red line and click on the "Cast qualifier to 'Square'" */
        System.out.println();
        System.out.println();

        ArrayList<Shape> shapes = new ArrayList<>();

        File file = new File("Lab6Data.txt") ;
        Scanner scan = new Scanner(file) ;
        int count = 0 ;
        while(scan.hasNextLine()) {
            String line = scan.nextLine() ;
            String[] items = line.trim().split(",") ;

            double val1 = Double.parseDouble(items[0]), val2 = Double.parseDouble(items[1]) ;
            if(count % 2 == 0) {
                shapes.add(count , new Square(val1 , val2)) ;
            }
            else {
                shapes.add(count , new Rectangle(val1 , val2)) ;
            }
            count++ ;
        }

        /** As stated before, neither Square or Rectangle have a getArea method but Shape does,
         so Square and Rectangle can use Shapes getArea method
         notice the casting to Square and Rectangle for the getPerimeter method call */
        for(int i = 0; i < shapes.size(); i++){
            if((i % 2)==0) {
                System.out.println("The area of the square is: " + shapes.get(i).getArea() + " and it's perimeter is " + ((Square) shapes.get(i)).getPerimeter());
            }
            else {
                System.out.println("\tThe area of the rectangle is: " + shapes.get(i).getArea() + " and it's perimeter is " + ((Rectangle) shapes.get(i)).getPerimeter());
            }
            System.out.println();
        }
    }
}
