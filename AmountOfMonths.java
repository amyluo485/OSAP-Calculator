
public class AmountOfMonths {
	private double loanAmount;
	private double monthlyAmount;
	
	public AmountOfMonths(){
		super();
		loanAmount = 1.00;
		monthlyAmount = 1.00;
	}
	
	public AmountOfMonths(double loanAmount,double monthlyAmount) {
		super();
		this.loanAmount = loanAmount;
		this.monthlyAmount = monthlyAmount;
	}
	
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	public double getLoanAmount() {
		return loanAmount;
	}
	
	public void setMonthlyAmount(double monthlyAmount) {
		this.monthlyAmount = monthlyAmount;
	}
	
	public double getMonthlyAmount() {
		return monthlyAmount;
	}
	
	public int findAmountOfMonths() {
		return (int)((-1*Math.log10(1-(0.0495*loanAmount/monthlyAmount)))/(Math.log10(1+0.0495))+1);
	}

	public String toString() {
		return "The number of months required to pay off your loan is " + findAmountOfMonths();
	}
	
}
