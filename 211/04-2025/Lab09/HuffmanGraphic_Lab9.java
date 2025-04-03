// 04-02-2025
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class HuffmanGraphic_Lab9 implements HuffmanGraphicADT {
    protected BinaryTreeNode<ColorCode> root;
    protected int modCount;
    private ArrayList<ColorCode> colors;
    private String filename;

    public HuffmanGraphic_Lab9(String filename) throws IOException {
        this.filename = filename;
        this.root = null;
        this.colors = new ArrayList<>();

        //256 possible colors for each channel
        for(int i = 0; i <=255; i++)
            colors.add(new ColorCode(i));

        processGraphic();
        build();
        //getCodes();
    }

    public void encodeGraphic(String inputFile, String outputFile) throws InvalidHuffmanCodeException, IOException {
        int pixel, alpha, red, green, blue ;
        PrintWriter out = new PrintWriter(outputFile) ;
        String encode = "" ;
        BufferedImage input = ImageIO.read(new File(inputFile)) ;
        int width = input.getWidth() , height = input.getHeight() ;
        out.write(height + "\n") ;
        out.write(width + "\n") ;
        for(int y = 0 ; y < height ; y++) {
            for(int x = 0 ; x < width ; x++) {
                pixel = input.getRGB(x , y) ;
                alpha = pixel >> 24 & 0xff ;
                red = pixel >> 16 & 0xff ;
                green = pixel >> 8 & 0xff ;
                blue = pixel & 0xff ;
                encode = String.format("%d,%d,%d,%d" , alpha, red, green, blue) ;
                encode = encode(encode) + "\n" ;
                out.write(encode) ;
            }
        }
        out.close() ;
    }

    public void decodeGraphic(String inputFile, String outputFile) throws InvalidHuffmanCodeException, IOException {
       int alpha, red, green, blue, pixel;
        Scanner scan = new Scanner(new File(inputFile)) ;

        int width = Integer.parseInt(scan.nextLine()) ;
        int height = Integer.parseInt(scan.nextLine()) ;
        BufferedImage out = new BufferedImage(width,height, BufferedImage.TYPE_INT_ARGB) ;
        for(int y = 0 ; y < height ; y++) {
            for(int x = 0 ; x < width ; x++) {
                String[] msg = decode(scan.nextLine()).split(",") ;
                alpha = Integer.parseInt(msg[0]) ;
                red = Integer.parseInt(msg[1]) ;
                green = Integer.parseInt(msg[2]) ;
                blue = Integer.parseInt(msg[3]) ;
                pixel = (alpha << 24) | (red << 16) | (green << 8) | blue ;
                out.setRGB(x, y, pixel) ;
            }
        }
      ImageIO.write(out, "png" , new File(outputFile)) ;
    }
}
