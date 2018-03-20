package chainOfresponsibility;

public class Director extends Approver {

	@Override
	public void processLoan(int amount) {
		if (amount <= 200000) {
			System.out.println("Director processed loan of " + amount);
		} else {
			System.out.println("Your loan of " + amount + " is not processed ");

		}

	}

}
