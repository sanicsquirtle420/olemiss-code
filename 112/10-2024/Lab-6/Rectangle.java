public class Rectangle extends Shape {
    private double height , width ;
    private double perimeter , area ;

    public Rectangle(double h , double w) {
        super(h , w) ;
        height = h ;
        width = w ;

        perimeter = 2 * (h + w) ;

        area = getArea() ;
    }

    public double getPerimeter() {
        return perimeter ;
    }
}


