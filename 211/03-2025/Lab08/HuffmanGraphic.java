import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HuffmanGraphic {
      protected BinaryTreeNode<ColorCode> root;
      protected int modCount;
      private ArrayList<ColorCode> colors;
      private String filename;
  
      public HuffmanGraphic(String filename) throws IOException {
          this.filename = filename;
          this.root = null;
          this.colors = new ArrayList<>();
  
          //256 possible colors for each channel
          for(int i = 0; i <=255; i++)
              colors.add(new ColorCode(i));
  
          processGraphic();
          build();
      }
      private void processGraphic() throws IOException {
          int pixel=0, alpha=0, red=0, green=0, blue=0;
          BufferedImage image = ImageIO.read(new File(this.filename));
          int height = image.getHeight();
          int width = image.getWidth();
  
          for (int y = 0; y < height; y++) {
              for (int x = 0; x < width; x++) {
                  pixel = image.getRGB(x, y);
                 
                  alpha = pixel >> 24 & 0xff ;
                  red = pixel >> 16 & 0xff ;
                  green = pixel >> 8 & 0xff ;
                  blue = pixel & 0xff ;
                
                  int prev = colors.get(alpha).getFrequency() ;
                  colors.get(alpha).setFrequency(prev + 1);
                  prev = colors.get(red).getFrequency() ;
                  colors.get(red).setFrequency(prev + 1) ;
                  prev = colors.get(green).getFrequency() ;
                  colors.get(green).setFrequency(prev + 1) ;
                  prev = colors.get(blue).getFrequency() ;
                  colors.get(blue).setFrequency(prev + 1) ;
              }
          }
      }
    
    private void traverse(BinaryTreeNode<ColorCode> node, String prefix) {
      if(node.getElement().getColorValue() == -1) {
        traverse(node.getLeft() , prefix + "0") ;
        traverse(node.getRight() , prefix + "1") ;
      } else {
        int index = node.getElement().getColorValue() ;
        colors.get(index).setCode(prefix) ;
        prefix = "" ;
      }
    }
  
    public String encode(String str) throws InvalidHuffmanCodeException {
      String msg = "" ;
      getCodes() ;
      if(str.isEmpty()) {
        throw new InvalidHuffmanCodeException() ;
      }
      String[] token = str.split(",") ;
      if(token.length < 4) {
        throw new InvalidHuffmanCodeException() ;
      }
      boolean found = false ;
      for(int i = 0 ; i < token.length ; i++) {
        for(ColorCode cc : colors) {
          int color = Integer.parseInt(token[i]) ;
          if(cc.getColorValue() == color) {
            msg += cc.getCode() ;
            found = true ;
            break ;
          }
        }
      }
      if(!found) {
        throw new InvalidHuffmanCodeException() ;
      }
      return msg ;
    }
  
    public String decode(String str) throws InvalidHuffmanCodeException {
      if(str.isEmpty() {
        throw new InvalidHuffmanCodeException() ;
      }
      for(int i = 0 ; i < str.length() ; i++) {
        if(current.getElement().colorValue() == -1) {
          if(str.charAt(i) == '1') {
            current = current.getRight() ;
          } else if(str.charAt(i) == '0') {
            current = current.getLeft() ;
          } else {
            throw new InvalidHuffmanCodeException() ;
          }
        } else {
          msg += current.getElement().getColorValue() + "," ;
          current = root ;
          i-- ;
        }
      }
      return msg + current.getElement().getColorValue() ;
    }
  }
