package edu.olemiss.week07;

public class Poodle extends Dog{
    /** A subclass of Dog */
    private String coloring;
    private String coatType;

    public Poodle() {
        super();
        coloring = "";
        coatType = "";
    }

    public Poodle(String coloring, String coatType) {
        this.coloring = coloring;
        this.coatType = coatType;
    }

    public Poodle(String coloring, String coatType, boolean pet, String type) {
        // there is a super() here, or you can include one if you want to pass data
        // up to the super class.
        super(pet, type);
        this.coloring = coloring;
        this.coatType = coatType;
        setCoatType(coatType);
        setPet(pet);
        setHuntingType(type);
        age = 52;
    }

    public String getColoring() {
        return coloring;
    }

    public void setColoring(String coloring) {
        this.coloring = coloring;
    }

    public String getCoatType() {
        return coatType;
    }

    public void setCoatType(String coatType) {
        this.coatType = coatType;
    }

    @Override
    public String toString() {
        return "Poodle coloring='" + coloring + '\'' +
                ", coatType='" + coatType + '}';
    }

    public void print(){
        super.print();
        System.out.printf("This poodle has a %s coat type\n", coatType);
        System.out.printf("\twith a %s coloring", coloring);
        System.out.println(" the year is " + DATE);
    }
}
