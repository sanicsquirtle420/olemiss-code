// 02/12/2025
import java.io.FileNotFoundException;
import java.util.Stack ;
import java.util.ArrayList ;
import java.util.Scanner ;
import java.io.File ;

public class HTMLValidator {
    private Stack<String> openTags ;
    private Stack<String> closeTags ;
    private ArrayList<String> validTags ;
    private ArrayList<String> voidTags ;
    private String filename ;

    public HTMLValidator(String filename , String validHTML , String voidHTML) throws FileNotFoundException {
        this.filename = filename ;
        openTags = new Stack<>() ;
        closeTags = new Stack<>() ;
        validTags = new ArrayList<>() ;
        voidTags = new ArrayList<>() ;

        Scanner scan = new Scanner(new File(validHTML)) ;
        while(scan.hasNextLine()) {
            String tmp = scan.nextLine() ;
            validTags.add(tmp) ;
        }

        scan.close() ;
        scan = new Scanner(new File(voidHTML)) ;

        while(scan.hasNextLine()) {
            String tmp = scan.nextLine() ;
            voidTags.add(tmp) ;
        }
    }

    public ArrayList<String> getValidTags() {
        return validTags ;
    }

    public ArrayList<String> getVoidTags() {
        return voidTags ;
    }

    public String getFilename() {
        return filename ;
    }

    public String printOpenTags() {
        String output = "", tag ;
        Stack<String> tmp = new Stack<>() ;
        while(!openTags.isEmpty()){
            tag = openTags.pop() ;
            tmp.push(tag) ;
            output += tag + "\n" ;
        }


        while(!tmp.isEmpty()) {
            openTags.push(tmp.pop()) ;
        }

        return output ;
    }

    public String printCloseTags() {
        String output = "", tag ;
        Stack<String> tmp = new Stack<>() ;
        while(!closeTags.isEmpty()){
            tag = closeTags.pop();
            tmp.push(tag) ;
            output += tag + "\n" ;
        }


        while(!tmp.isEmpty()) {
            closeTags.push(tmp.pop()) ;
        }

        return output ;
    }

    public String removeOpenTag() throws InvalidHTMLException {
        if(openTags.isEmpty()) {
            throw new InvalidHTMLException() ;
        }

        return openTags.pop() ;
    }

    public String removeSlash(String tag) {
        String str = "" ;
        if(tag.indexOf('/') != -1) {
            str = tag.substring(0 , tag.indexOf('/')) + tag.substring(tag.indexOf('/') + 1 , tag.length()) ;
        }
        else {
            return tag ;
        }
        return str ;
    }

    public void addTag(String tag) {
        String tmpTag ;

        if(tag.indexOf('/') != -1) {
            tmpTag = removeSlash(tag) ;
            if(!validTags.contains(tmpTag)) {
                throw new InvalidHTMLException() ;
            }
            closeTags.push(tmpTag) ;
        }

        else {
            if (!validTags.contains(tag)) {
                throw new InvalidHTMLException();
            }
            openTags.push(tag) ;
        }
    }
}
