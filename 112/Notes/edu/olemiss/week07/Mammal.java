package edu.olemiss.week07;

public class Mammal {
    /** Super class (parent / base) - connects to a subclass */
    protected boolean vertebrate;

    public Mammal(){
        vertebrate = true;
    }

    public Mammal(boolean vert){
        vertebrate = vert;
    }

    public boolean getVertebrate() {
        return vertebrate;
    }

    public void setVertebrate(boolean vertebrate) {
        this.vertebrate = vertebrate;
    }

    @Override
    public String toString() {
        return "Mammal's are vertebrates " + vertebrate;
    }
    public void print(){
        System.out.println("Mammal's are vertebrates " + vertebrate);
    }
}
