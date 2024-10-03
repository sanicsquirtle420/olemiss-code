/* 10/02/24
needed to run the driver and test class */
import java.util.ArrayList; // i hate you arraylist

public class University {

    private String uniName;
    private ArrayList<Organization> orgs;

    public University(){
        uniName = "";
        orgs = new ArrayList<>();
    }

    public University(String uniName){
        this.uniName = uniName;
        orgs = new ArrayList<>();
    }

    public void setUniName(String uniName){
        this.uniName = uniName;
    }

    public String getUniName(){
        return uniName;
    }

    public ArrayList<Organization> getOrganizations(){
        return orgs;
    }

    public void addOrganizationToList(String lettersOrg, String type, String affiliation){
        orgs.add(new Organization(lettersOrg, type, affiliation));
    }

    public void addMemberToOrg(String name, String ID, String classification, String hometown, int index){
        orgs.get(index).addMember(name, ID, classification, hometown);
    }

    public void printUniData(){
        System.out.println("The University of " + uniName + " Welcomes you!");
        System.out.println("These are some of the organizations and members");
        System.out.println();
        for(int i = 0; i < orgs.size(); i++){
            orgs.get(i).printOrgData() ;
        }
    }

    public void sortMembersInOrgs(){
        for(int i = 0; i < orgs.size(); i++){
            orgs.get(i).sortMembersByName();
        }
    }

    public void printFreshmenList() {
        System.out.println("The Freshman in each Organization");
        System.out.println();
        for(int i = 0; i < orgs.size(); i++){
            orgs.get(i).listOfFreshmenMembers();
        }
    }

    public Organization getOrgFromList(int index) {
        return orgs.get(index);
    }

    public Members getMemberFromOrgList(int index, int index2){
        return orgs.get(index).getMember(index2);
    }
}
