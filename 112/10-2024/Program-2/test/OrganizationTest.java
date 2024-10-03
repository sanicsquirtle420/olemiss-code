// 10/02/24
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrganizationTest {
    @Test
    void noParamConst(){
        Organization test = new Organization() ;
        assertNotNull(test) ;
    }

    @Test
    void ParamConst() {
        Organization test = new Organization("ABC" , "something" , "nonsocial") ;
        assertAll("testing parameterized constructor" ,
                ()-> assertEquals("ABC" , test.getLettersOrg()) ,
                ()-> assertEquals("something" , test.getType()) ,
                ()-> assertEquals("nonsocial" , test.getAffiliation())
        ) ;
    }

    @Test
    void setLettersOrg() {
        Organization test = new Organization() ;
        test.setLettersOrg("ABC") ;

        assertEquals("ABC" , test.getLettersOrg()) ;
    }

    @Test
    void setType() {
        Organization test = new Organization() ;
        test.setType("Something") ;

        assertEquals("Something" , test.getType()) ;
    }

    @Test
    void setAffiliation() {
        Organization test = new Organization() ;
        test.setAffiliation("Nonsocial"); ;

        assertEquals("Nonsocial" , test.getAffiliation()) ;
    }

    @Test
    void addMember() {
        Organization test = new Organization() ;
        test.addMember("a" , "123" , "c" , "d");

        assertNotNull(test.getMember(0));
    }

    @Test
    void sortMembersByName() {
        Organization test = new Organization() ;

        test.addMember("c" , "123" , "y" , "MEX") ;
        test.addMember("a" , "456" , "z" , "USA") ;
        test.addMember("b" , "789" , "x" , "CAN") ;

        test.sortMembersByName() ;
        assertAll("testing the sort method" ,
                ()-> assertEquals("a" , test.getMember(0).getName()) ,
                ()-> assertEquals("789" , test.getMember(1).getID()) ,
                ()-> assertEquals("MEX" , test.getMember(2).getHometown())
        ) ;
    }
}
