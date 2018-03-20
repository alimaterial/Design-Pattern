package classfactory;

abstract class Account
{
	protected abstract void actualJob();
	public abstract ITax getTax();
	public void PerformTrans()
	{
		System.out.println("Trans Started ");
		actualJob();
		System.out.println("Trans Completed ");
	}
}

class Savings extends Account
{

	@Override
	protected void actualJob() {
		System.out.println("Savings job done ");		
	}

	@Override
	public ITax getTax() {
		return new SavingsTax();
	}
	
}

class Current extends Account
{
	@Override
	protected void actualJob() {
		System.out.println("Current job done ");		
	}

	@Override
	public ITax getTax() {
		return new CurrentTax();
	}
}

interface ITax
{
	void payTax();
}

class SavingsTax implements ITax
{

	@Override
	public void payTax() {
		System.out.println("Savings tax paid ");
		
	}
}

class CurrentTax implements ITax
{
	@Override
	public void payTax() {
		System.out.println("Current tax paid ");
		
	}
}



class CFactory
{
	public static Account GetAccountObject(int choice)
	{
		if(10==choice)
		{
			return new Savings();
		}
		else
			return new Current();
	}
}

public class ClassFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc=CFactory.GetAccountObject(10);
		acc.PerformTrans();
		ITax tax=acc.getTax();
		tax.payTax();
		
	}

}
