import java.text.DecimalFormat;

public abstract class Policies {

	protected static final int CURRENT_YEAR = 2024;
	DecimalFormat deform = new DecimalFormat("#.00");

	private int policyStartDate;
	private double yearlyPremiumAmount;

	public Policies(){
		policyStartDate = 0;
		yearlyPremiumAmount = 0.0;
	}
	
	public void setPolicyStartDate(int pDate) {
		policyStartDate = pDate;
	}
	public void setYearlyPremiumAmount(double pAmount) {
		yearlyPremiumAmount = pAmount;
	}
	public int getPolicyStartDate() {
		return policyStartDate;
	}
	public double getYearlyPremium() {
		return yearlyPremiumAmount;
	}
	public abstract void addOwnerInfo(String n, String a, String c, String s);
	
	public void PrintInfo() {
		System.out.println("The year is currently: " + CURRENT_YEAR);
		System.out.println("The year the policy was start: " + policyStartDate);
		System.out.println("The premium for this policy for the entire year is: $" + deform.format(yearlyPremiumAmount));
	}

	public double calcMonthlyPremium(){
		return yearlyPremiumAmount / 12;
	}
		
}
