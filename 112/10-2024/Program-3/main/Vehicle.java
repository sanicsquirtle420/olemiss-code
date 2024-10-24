public class Vehicle {

    // class attributes
    private boolean engine;
    private int numWheels;
    private int capacity;

    public Vehicle() {
        this.engine = false;
        this.numWheels = 0;
        this.capacity = 0;
    }

    public Vehicle(boolean engine, int numWheels, int capacity) {
        this.engine = engine;
        this.numWheels = numWheels;
        this.capacity = capacity;
    }

    // setters and getters
    public boolean hasEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return String.format("The Vehicle has an engine %5b, with %d wheels and can transport %d\n", engine, numWheels, capacity);
    }

    public void printData(){
        System.out.printf("The Vehicle has an engine %5b, with %d wheels and can transport %d\n", engine, numWheels, capacity);
    }
}
