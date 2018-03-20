package chainOfresponsibility;

public class Cashier extends Approver {

	@Override
	public void processLoan(int amount) {
		if(amount<=50000)
		{
			System.out.println("Cashier processed loan of "+amount);
		}
		else
		{
			System.out.println("Cashier (CANNOT) processed loan of "+amount);
			this._successor.processLoan(amount);
		}
	}

}
