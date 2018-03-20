package chainOfresponsibility;

public abstract class Approver {
	protected Approver _successor=null;
	public void set_successor(Approver _successor) {
		this._successor = _successor;
	}
	public abstract void processLoan(int amount);
}
