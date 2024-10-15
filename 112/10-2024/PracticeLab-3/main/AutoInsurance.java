import java.util.Random ;

public class AutoInsurance extends Policies {
    private String policyNum , vin , make , model ;
    private int year , millage , tickets ;
    private int count = 0 ;
    private PolicyOwner[] owners ;

    public AutoInsurance() {
        super() ;
        owners = new PolicyOwner[20] ;
        vin = "" ;
        make = "" ;
        model = "" ;
        year = 0 ;
        millage = 0 ;
        tickets = 0 ;
    }

    public AutoInsurance(String vin , String make , String model , int year , int millage , int tickets) {
        super() ;
        owners = new PolicyOwner[20] ;
        this.vin = vin ;
        this.make = make ;
        this.model = model ;
        this.year = year ;
        this.millage = millage ;
        this.tickets = tickets ;
    }

    @Override
    public void addOwnerInfo(String n, String a, String c, String s) {
        owners[count] = new PolicyOwner(n , a , c , s) ;
        count++ ;
    }

    public void setPolicyNum(String initials) {
        Random rand = new Random() ;
        int num1 = rand.nextInt(1000 - 650 + 1) + 650 ;
        int num2 = rand.nextInt(6000 - 1500 + 1) + 1500 ;
        StringBuilder sample = new StringBuilder("AUTO-") ;
        sample.append(num1 + initials + num2) ;

        policyNum = sample.toString() ;
    }

    public String getPolicyNum() {
        return policyNum ;
    }
}
