/* 10/02/24
I again don't know how overwatch characters ened up in this .java
file */
public class LP2Driver {
    public static void main(String[] args) {
        University uni = new University("Mississippi");

        uni.addOrganizationToList("ACM", "Academic", "Computer Science");

        uni.addMemberToOrg("Roadhog", "16972", "Junior", "Memphis TN", 0);
        uni.addMemberToOrg("Doomfist", "19472", "Senior", "Dallas TX", 0);
        uni.addMemberToOrg("Orisa", "16892", "Sophomore", "Gulfport MS", 0);
        uni.addMemberToOrg("Sigma", "16480", "Junior", "Gainesville FL", 0);
        uni.addMemberToOrg("Junker Queen", "14446", "Senior", "Baltimore MD", 0);

        uni.addOrganizationToList("PKT", "Greek fraternity", "Social");

        uni.addMemberToOrg("Junkrat", "14681", "Freshman", "Starkville MS", 1);
        uni.addMemberToOrg("Cassidy", "11208", "Freshman", "Macon GA", 1);
        uni.addMemberToOrg("Bastion", "19518", "Sophomore", "Atlanta GA)", 1);
        uni.addMemberToOrg("Reaper", "18840", "Freshman", "Nashville TN", 1);
        uni.addMemberToOrg("Genji", "10020", "Sophomore", "Oxford MS", 1);
        uni.addMemberToOrg("Hanzo", "19056", "Junior", "Charlotte NC", 1);
        uni.addMemberToOrg("Solider 76", "12960", "Freshman", "Oxford MS", 1);
        uni.addMemberToOrg("Torbjorn", "11317", "Freshman", "Columbia SC", 1);
        uni.addMemberToOrg("Lifeweaver", "12330", "Senior", "Sikeston MO", 1);

        uni.addOrganizationToList("KKG", "Greek sorority", "Social");

        uni.addMemberToOrg("Juno", "19678", "Freshman", "Tupelo MS", 2);
        uni.addMemberToOrg("Kirko", "16565", "Sophomore", "Huntsville AL", 2);
        uni.addMemberToOrg("D.Va", "12090", "Sophomore", "Senatobia MS", 2);
        uni.addMemberToOrg("Soujourn", "15161", "Junior", "Madison MS", 2);
        uni.addMemberToOrg("Pharah", "17977", "Senior", "Greenville MS", 2);

        uni.addOrganizationToList("ESB", "Academic", "Engineering");

        uni.addMemberToOrg("Lucio", "19704", "Freshman", "Tunica MS", 3);
        uni.addMemberToOrg("Mercy", "14576", "Sophomore", "Oxford MS", 3);
        uni.addMemberToOrg("Mei", "11809", "Freshman", "Asheville NC", 3);
        uni.addMemberToOrg("Moira", "17524", "Senior", "Sarasota FL", 3);
        uni.addMemberToOrg("Baptiste", "10921", "Sophomore", "Madison TN", 3);
        uni.addMemberToOrg("Sigma", "11103", "Senior", "Nashville TN", 3);

        uni.addOrganizationToList("SWE", "Academic", "Social");

        uni.addMemberToOrg("Mercy", "10203", "Senior", "Mobile AL", 4);
        uni.addMemberToOrg("Mei", "16402", "Junior", "Covington GA", 4);
        uni.addMemberToOrg("Moira", "18627", "Sophomore", "Baton Rouge LA", 4);
        uni.addMemberToOrg("Sombra", "16613", "Junior", "Memphis TN", 4);

        uni.sortMembersInOrgs();
        uni.printUniData();

        uni.printFreshmenList();
        System.out.println();
        System.out.println("We at The University of " + uni.getUniName() + " hope to see you again soon!");
    }
}
