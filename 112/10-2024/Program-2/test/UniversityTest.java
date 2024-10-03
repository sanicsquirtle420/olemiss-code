// 10/02/24
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UniversityTest {
    @Test
    void noParamConst() {
        University test = new University() ;
        assertNotNull(test) ;
    }

    @Test
    void ParamConst() {
        University test = new University("Texas") ;
        assertAll("testing paramertized constructor" ,
                ()-> assertEquals("Texas" , test.getUniName()) ,
                ()-> assertNotNull(test.getOrganizations())
        ) ;
    }

    @Test
    void setUniName() {
        University test = new University() ;
        test.setUniName("Texas") ;
        assertEquals("Texas" , test.getUniName()) ;
    }

    @Test
    void addOrganizationToList() {
        University test = new University() ;
        test.addOrganizationToList("" , "" ,"") ;
        assertNotNull(test.getOrganizations()) ;
    }

    @Test
    void addMemberToOrg() {
        University test = new University() ;
        test.addOrganizationToList("" ,"" ,"") ;
        test.addMemberToOrg("" , "" ,"" ,"", 0) ;
        assertNotNull(test.getMemberFromOrgList(0 , 0)) ;
    }
}
