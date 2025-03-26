import java.io.FileNotFoundException ;
import java.io.File ;
import java.util.*

public class PreLab8 {
  protected BinaryTreeNode<String> root ;
  protected int modCount ;
  ArrayList<MorseCode> list = new ArrayList<>() ;

  public PreLab8(String filename) throws FileNotFoundException {
    root = new BinaryTreeNode<>("") ;
    readFile(filename) ;
    build() ;
  }
  
  public void readFile(String filename) throws FileNotFoundException {
    Scanner scan = new Scanner(new File(filename)) ;
    while(scan.hasNextLine()) {
      String[] token = scan.nextLine().split("\t") ;
      list.add(new MorseCode(token[1] , token[0]) ;
    }
    
    public void build() {
      BinaryTreeNode<String> current = null ;

      for(int i = 0 ; i < list.size() ; i++) {
            current = root ;
            String code = list.get(i).getCode() ;
            for(int j = 0 ; j < code.length() ; j++) {
                if(code.charAt(j) == '-') {
                    if(current.getLeft() == null) {
                        current.setLeft(new BinaryTreeNode<>(""));
                    }
                    current = current.getLeft() ;
                }
                else if(code.charAt(j) == '.') {
                    if(current.getRight() == null) {
                        current.setRight(new BinaryTreeNode<>("")) ;
                    }
                    current = current.getRight() ;
                }

                if(j == code.length() - 1) {
                    current.setElement(list.get(i).getCode()) ;
                }
            }
      }
    }

    private void getMorseCodes(ArrayList<String> mCode, BinaryTreeNode<String> node, String prefix) {
        if(node != null) {
              getMorseCodes(mCode , node.getLeft(), ".") ;
              String ch = "" ;
              for(MorseCode mc : list) {
                  if(mc.getCode().equals(node.getElement())) {
                      ch = mc.getCh() ;
                  }
              }
              if(!node.getElement().equals(" ")) {
                  mCode.add(ch + " " + node.getElement());
              }
              getMorseCodes(mCode , node.getRight() , "-") ;
          }
      }

  public String transmit(String str) throws InvalidMorseCodeException {
    String msg = "";
          ArrayList<String> mCodes = getMorseCodes() ;
          if(str.isEmpty()) {
              throw new InvalidMorseCodeException() ;
          }
          str = str.trim() ;
          String[] juno = str.split(" ") ;
          for(String j : juno){
              for(String mc : mCodes) {
                  String[] val = {} ;
                  if(!mc.equals(" ")) {
                      val = mc.split(" ") ;
                  }
                  if(val.length == 2) {
                      if (j.equals(val[1])) {
                          msg += val[0];
                      }
                  }
              }
          }
          return msg ;
    }

    public String translate(String morseCode) throws InvalidMorseCodeException {
      String msg = "" ;
      return msg ;
      // TODO
    }
}
