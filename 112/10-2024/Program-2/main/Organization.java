/* 10/02/24
needed to run the driver and test class */
public class Organization {
	//fields
	private String lettersOrg;
	private String type;
	private String affiliation;
	private Members[] members;

	private int counter;

	//constructors
	public Organization() {
		lettersOrg = "";
		type = "";
		affiliation = "";
		members = new Members[40];
		counter = 0;
	}

	public Organization(String lettersOrg, String type, String affiliation) {
		this.lettersOrg = lettersOrg;
		this.type = type;
		this.affiliation = affiliation;
		members = new Members[40];
		counter = 0;
	}

	//setters
	public void setLettersOrg(String lettersOrg) {
		this.lettersOrg = lettersOrg;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	//getters
	public String getLettersOrg() {
		return lettersOrg;
	}

	public String getType() {
		return type;
	}

	public String getAffiliation() {
		return affiliation;
	}

	public int getLength() {
		return counter;
	}

	public Members[] getMembersArray() {
		return members;
	}

	public void addMember(String name, String ID, String classification, String hometown) {
		members[counter] = new Members(name, ID, classification, hometown);
		counter++ ;
	}

		//method to print data for an organization including all members

	public void printOrgData() {
		System.out.println(lettersOrg + " is a " + type + " organization in " + affiliation);
		System.out.println("Our members are:");
		for (int i = 0; i < counter; i++) {
			System.out.println(members[i].toString());
		}
			System.out.println();;
		}

		public void listOfFreshmenMembers () {
			System.out.println(lettersOrg + "'s Freshman are:");
			int count = 0;

			for (int i = 0 ; i < counter; i++) {
				if (members[i].getClassification() == "Freshman") {
					System.out.println(members[i].getName() + " from " + members[i].getHometown()) ;
					count++ ;
				}
			}

			if (count == 0) {
				System.out.printf("They don't have any Freshman currently\n");
			}
			System.out.println();
			System.out.println("***************************************");
		}

		public void sortMembersByName () {
			int indexOfName;
			Members alphabeticalMember;

			for (int outerControl = 0; outerControl < members.length - 1; outerControl++) {

				indexOfName = outerControl;
				alphabeticalMember = members[outerControl];

				for (int innerControl = outerControl + 1; innerControl < counter; innerControl++) {

					if ((members[innerControl].getName().compareTo(alphabeticalMember.getName())) < 0) {
						alphabeticalMember = members[innerControl];
						indexOfName = innerControl;
					}
				}
				members[indexOfName] = members[outerControl];
				members[outerControl] = alphabeticalMember;
			}
		}

		public Members getMember ( int index){
			return members[index];
		}
}
