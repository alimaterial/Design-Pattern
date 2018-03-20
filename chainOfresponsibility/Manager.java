package chainOfresponsibility;

public class Manager extends Approver {

	@Override
	public void processLoan(int amount) {
		if(amount<=100000)
		{
			System.out.println("Manager processed loan of "+amount);
		}
		else
		{
			System.out.println("Manager (CANNOT) processed loan of "+amount);
			this._successor.processLoan(amount);
		}

	}

}
