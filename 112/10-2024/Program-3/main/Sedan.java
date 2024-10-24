public class Sedan extends Vehicle {
    protected String color , wheelMaterial ;
    protected boolean heatedSeats ;

    public Sedan() {
        super(false , 0 , 0) ;
        color = "" ;
        wheelMaterial = "" ;
        heatedSeats = false ;
    }

    public Sedan(String c , String wm , boolean hs) {
        color = c ;
        wheelMaterial = wm ;
        heatedSeats = hs ;
    }

    public Sedan(boolean e , int nw , int cap , String c , String wm , boolean hs) {
        super(e , nw , cap) ;
        color = c ;
        wheelMaterial = wm ;
        heatedSeats = hs ;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWheelMaterial() {
        return wheelMaterial;
    }

    public void setWheelMaterial(String wheelMaterial) {
        this.wheelMaterial = wheelMaterial;
    }

    public boolean isHeatedSeats() {
        return heatedSeats;
    }

    public void setHeatedSeats(boolean heatedSeats) {
        this.heatedSeats = heatedSeats;
    }

    @Override
    public String toString() {
        if (heatedSeats == true) {
            return String.format("This sedan is %s, has a %s wheel, and does have heated seats.", color, wheelMaterial);
        }
        return String.format("This sedan is %s, has a %s wheel, and it does not have heated seats" , color , wheelMaterial) ;
    }

    public void printData() {
        super.printData() ;
        if (heatedSeats == true) {
            System.out.printf("This sedan is %s, has a %s wheel, and does have heated seats.\n", color, wheelMaterial);
        }
        else {
            System.out.printf("This sedan is %s, has a %s wheel, and does not have heated seats.\n", color, wheelMaterial);
        }
    }
}
