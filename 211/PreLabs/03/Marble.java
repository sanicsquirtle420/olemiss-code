import java.util.Random;

public class Marble {
    final int NUM_SIZES = 5 ;
    final int NUM_COLORS = 8 ;
    final int NUM_MATERIALS = 4 ;

    final String[] sizes = {"Mini", "Small", "Medium", "Large", "XLarge"} ;
    final String[] colors = {"Red", "Orange", "Yellow", "Green", "Blue", "Black",
            "White", "Gray"} ;
    final String[] materials = {"Clay", "Glass", "Plastic", "Steel"} ;
    Random gen = new Random() ;
    private String size , color , material ;

    public Marble() {
        this.size = sizes[gen.nextInt(NUM_SIZES - 1) + 1] ;
        this.color = colors[gen.nextInt(NUM_COLORS - 1) + 1] ;
        this.material = materials[gen.nextInt(NUM_MATERIALS - 1) + 1] ;
    }

    public Marble(String size, String color, String material) {
        this.size = size ;
        this.color = color ;
        this.material = material ;
    }

    public String getSize() {
        return size ;
    }

    public String getColor() {
        return color ;
    }

    public String getMaterial() {
        return material ;
    }

    public void setSize(String size) {
        this.size = size ;
    }

    public void setColor(String color) {
        this.color = color ;
    }

    public void setMaterial(String material) {
        this.material = material ;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s marble" , size , color , material) ;
    }
}
