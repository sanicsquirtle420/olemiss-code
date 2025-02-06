// 01/29/2025

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage ;
import java.io.File;
import java.io.IOException;

public class Steganography {
    private String graphicFile ;
    private BufferedImage image ;

    public Steganography(String graphicFile) throws IOException {
        this.graphicFile = graphicFile ;
        this.image = ImageIO.read(new File(graphicFile)) ;
    }

    public String getGraphicFile() {
        return graphicFile ;
    }

    public BufferedImage getImage() {
        return image ;
    }

    // TODO: fix this garbage method that doesn't work
    public String decode() {
        int[][] data = new int[image.getWidth()][image.getHeight()] ;
        int rgbVal ;
        String message = "", letter = "";

        for(int i = 0 ; i < data.length ; i++) {
            for(int j = 0 ; j < data[i].length ; j++) {
                rgbVal = image.getRGB(i , j) ;
                if(rgbVal % 2 == 0) {
                    // append a 0
                    letter += "0" ;
                }
                else {
                    // append a 1
                    letter += "1" ;
                }

                if(letter.length() == 8){
                    message += (char) Integer.parseUnsignedInt(letter, 2);
                    letter = "" ;
                }
            }
        }
        return message ;
    }

    public String printRiddle(String riddle , int start, int end) {
        String message = "" ;
        for(int i = start ; i < end ; i++) {
            message += riddle.charAt(i) ;
        }

        return message ;
    }
}
