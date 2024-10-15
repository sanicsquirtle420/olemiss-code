public class PL3Driver {
    public static void main(String[] args) {
        System.out.println("--- Welcome to Raccoon Insurance ---") ;

        AutoInsurance test = new AutoInsurance() ;
        test.setPolicyNum("dr") ;

        System.out.println("Policy Number: " + test.getPolicyNum()) ;

        System.out.println("--- Have a good day! ---") ;
    }
}
