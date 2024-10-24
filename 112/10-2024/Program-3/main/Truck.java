public class Truck extends Vehicle {
    protected int length , width , area ;

    public Truck() {
        super(false , 0 , 0) ;
        length = 0 ;
        width = 0 ;
        area = length * width ;
    }

    public Truck(int l , int w) {
        length = l ;
        width = w ;
        area = l * w ;
    }

    public Truck(boolean e , int nw , int c , int l , int w) {
        super(e , nw , c) ;
        length = l ;
        width = w ;
        area = l * w ;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int l , int  w) {
        area = l * w ;
    }

    public String toString() {
        return String.format("This truck's cargo space has a length of %d, width of %d with an area of %d" , length , width , area) ;
    }

    public void printData() {
        super.printData() ;
        System.out.printf("This truck's cargo space has a length of %d, width of %d with an area of %d\n" , length , width , area) ;
    }
}
