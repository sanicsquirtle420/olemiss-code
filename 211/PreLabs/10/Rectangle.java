import java.util.Base64 ;

public class Rectangle {
    private double length ;
    private double width ;

    public Rectangle(double length, double width) {
        this.length = length ;
        this.width = width ;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width ;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void printReference() {
        System.out.println(this) ;
    }

    public String rectangleHash() {
        String tmp = this + ".password" ;
        byte[] hashArr = Base64.getEncoder().encode(tmp.getBytes()) ;
        return new String(hashArr) ;
    }

    public String hashDecode(String decode) {
        byte[] hash = Base64.getDecoder().decode(decode) ;
        return new String(hash) ;
    }
}
