// 02-05-2025
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Steganography {
    private String graphicFile;
    private BufferedImage image;

    public Steganography(String graphicFile) throws IOException {
        this.graphicFile = graphicFile;
        image = ImageIO.read(new File(this.graphicFile));
    }

    public String getGraphicFile() {
        return graphicFile;
    }

    public BufferedImage getImage() {
        return image;
    }

    public String decode() {
        String message = "", letter = "";
        boolean done = false;
        int pixel;
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        while (!done) {
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    pixel = this.image.getRGB(x, y);
                    //System.out.println("Pixel " + pixel);
                    //blue = (pixel) & 0xff;
                    if (pixel % 2 == 0)
                        letter += "0";
                    else
                        letter += "1";
                    if (letter.length() == 8) {
                        // Character 63 is a question mark and signals the end of the riddle
                        //if(Integer.parseUnsignedInt(letter, 2) >= 32 && Integer.parseUnsignedInt(letter, 2) <= 126)
                        //if (!done)
                        message += (char) (Integer.parseUnsignedInt(letter, 2));
                        if (Integer.parseUnsignedInt(letter, 2) == 63) {
                            done = true;
                            break;
                        }

                        //reset letter
                        letter = "";
                    }
                }
            }
        }
        return message;
    }
    public String printRiddle(String riddle, int start, int stop) {
        String message = "";
        for(int i = start; i < stop; i++)
            message += riddle.charAt(i);
        return message;
    }

    ////////////////////////////// LAB 2  //////////////////////////////

    /**
     * method prependBits that prepends 0's to oneLetterBits
     * @param oneLetterBits
     * @return
     */
    public String prependBits(String oneLetterBits) {
        while(oneLetterBits.length() != 8) {
            oneLetterBits = "0" + oneLetterBits ;
        }
        return oneLetterBits ;
    }

    /**
     * method encodedFilename that appends Encoded to graphicFile
     * @return
     */
    public String encodedFilename() {
        String[] token = graphicFile.split("\\.") ;
        String newFile = token[0] + "Encoded." + token[1] ;

        return newFile ;
    }

    /**
     * method encode that encodes the message in graphicFileEncoded.png (where graphicFile is the name of the graphicFile instance variable).
     * @param message
     * @throws IOException
     */
    // THANK FUCK THIS WORKS
    public void encode(String message) throws IOException {
        int pixel , count = 0;
        String messageBits = "", tempBits = "";
        BufferedImage newImage = this.image ;

        for(int i = 0 ; i < message.length() ; i++) {
            messageBits += prependBits(Integer.toBinaryString(message.charAt(i))) ;
        }
        while(count != messageBits.length()) {
            for (int y = 0; y < image.getHeight(); y++) {
                for (int x = 0; x < image.getWidth(); x++) {
                    pixel = newImage.getRGB(x, y);
                    int alpha = pixel >> 24 & 0xff, red = pixel >> 16 & 0xff;
                    int green = pixel >> 8 & 0xff, blue = pixel & 0xff;
                    tempBits = prependBits(Integer.toBinaryString(blue));
                    if (messageBits.charAt(count) != tempBits.charAt(7)) {
                        blue--;
                    }

                    pixel = (alpha << 24) | (red << 16) | (green << 8) | blue;
                    newImage.setRGB(x, y, pixel);
                    count++ ;

                    if(count == messageBits.length()) {
                        break ;
                    }
                }
                if(count == messageBits.length()) {
                    break ;
                }
            }
        }

        File f = new File(encodedFilename()) ;
        ImageIO.write(newImage , "png" , f) ;
    }
}
