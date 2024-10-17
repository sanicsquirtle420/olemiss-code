public class Shape {
    private double height , width ;
    private double area;
    public Shape(double h , double w) {
        height = h ;
        width = w ;

        area = h * w ;
    }
        /** This will be used as a super class */

    public double getArea() {
        return area ;
    }

    public void setArea() {
        area = height * width ;
    }
}
