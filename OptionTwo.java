import java.io.*;
public class OptionTwo {
	
	public static void main(String args[]) throws IOException {
		optionTwo();
	}
	public static void optionTwo() throws IOException{
		System.out.println("PLease enter your debt amount.");
		double loanAmount = input();
		System.out.println("How many months have passed since you left post-secondary?");
		double input = input();
		int passedMonths = (int)input;
		System.out.println("What is your desirable monthly payment?");
		double monthlyAmount = input();
		if(passedMonths == 6) {
			AmountOfMonths am = new AmountOfMonths(loanAmount,monthlyAmount);
			System.out.println(am.toString());
		}
		else {
			System.out.println("How much have you already paid off?");
			double paidOff = input();
			loanAmount = loanAmount - paidOff;
			AmountOfMonths am = new AmountOfMonths(loanAmount,monthlyAmount);
			System.out.println(am.toString());
		}
	}
	
	public static double input() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return Double.parseDouble(br.readLine());
	}
	
}
