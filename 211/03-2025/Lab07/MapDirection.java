// 03-19-2025

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MapDirection {
    private String filename;
    private LinkedUnorderedList<OneMapDirection> directions;

    public MapDirection(String filename) {
        this.filename = filename;
        directions = new LinkedUnorderedList<>() ;
    }
  
    /** methods not written by me were removed, most of which are in Lab06 */

    public LinkedUnorderedList<OneMapDirection> removeUnusedElements() {
        LinkedUnorderedList<OneMapDirection> tmp = copy() ;
        LinearNode<OneMapDirection> current = tmp.getListHead() ;
        LinearNode<OneMapDirection> previous = null ;

        while(current != null) {
            if(current.getElement().getReferenceNum() == -1) {
                if(previous == null) {
                    tmp.head = current.getNext() ;
                } else {
                    previous.setNext(current.getNext()) ;
                }
            } else {
                previous = current ;
            }
            current = current.getNext() ;
        }

        return tmp ;
    }

    public LinkedUnorderedList<OneMapDirection> modify(String filename) throws FileNotFoundException {
        LinkedUnorderedList<OneMapDirection> tmp = removeUnusedElements() ;
        LinearNode<OneMapDirection> current = tmp.getListHead() ;
        LinearNode<OneMapDirection> previous = null ;
        Scanner scan = new Scanner(new File(filename)) ;

        while(scan.hasNextLine()) {
            String[] token = scan.nextLine().split(",") ;
            int cmp = Integer.parseInt(token[0]) ;
            while(current != null) {
                if(current.getElement().getReferenceNum() == cmp) {
                    previous = current ;
                    current = current.getNext() ;
                } else {
                    OneMapDirection add = new OneMapDirection(cmp , token[1] , token[2]) ;
                    if(previous == null) {
                        tmp.addToRear(add) ;
                    } else {
                        LinearNode<OneMapDirection> newNode = new LinearNode<>(add) ;
                        newNode.setNext(previous.getNext()) ;
                        previous.setNext(newNode) ;

                        previous = newNode ;
                    }
                }
                break ;
            }
        }
        return tmp ;
    }
}
