public class EighteenWheeler extends Truck {
    protected String fuelType ;
    protected boolean cooler ;

    public EighteenWheeler() {
        super(false , 0 , 0 , 0 , 0) ;
        fuelType = "" ;
        cooler = false ;
    }

    public EighteenWheeler(String ft , boolean c) {
        fuelType = ft ;
        cooler = c ;
    }

    public EighteenWheeler(boolean e , int nw , int cap , int len , int wid , String ft , boolean c) {
        super(e , nw , cap , len , wid) ;
        fuelType = ft ;
        cooler = c ;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isCooler() {
        return cooler;
    }

    public void setCooler(boolean cooler) {
        this.cooler = cooler;
    }

    public String toString() {
        if(cooler == true) {
            return String.format("This 18 wheeler uses %s and does have a cooler" , fuelType) ;
        }

        return String.format("This 18 wheeler uses %s and does not have a cooler" , fuelType) ;
    }

    public void printData() {
        if(cooler == true) {
            super.printData() ;
            System.out.printf("This 18 wheeler uses %s and does have a cooler\n" , fuelType) ;
        }
        else {
            super.printData() ;
            System.out.printf("This 18 wheeler uses %s and does not have a cooler\n" , fuelType) ;
        }
    }
}
