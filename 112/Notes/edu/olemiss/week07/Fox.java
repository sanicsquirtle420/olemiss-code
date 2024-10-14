package edu.olemiss.week07;

public class Fox extends Mammal {
    /** A subclass (child / derived) of edu.olemiss.week07.Mammal */
    private String type;
    private double weight;

    public Fox() {
        // super(); // automatically a super call
        type = "";
        weight = 0.0;
    }
    public Fox(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "edu.olemiss.week07.Fox " + " type= " + type + ", weight= " + weight;
    }
}
