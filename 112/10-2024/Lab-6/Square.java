public class Square extends Shape {
    private double height , width ;
    double perimeter  , area;

    public Square(double h , double w) {
        super(h , h) ;
        height = h ;
        width = w ;

        perimeter = 4 * height ;

        area = getArea() ;
    }

    public double getPerimeter() {
        return perimeter ;
    }
}