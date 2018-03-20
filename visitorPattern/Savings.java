package visitorPattern;

public class Savings extends Account {
	@Override
	public void DoJob() {
		System.out.println("Savings job 1");
		System.out.println("Savings job 2");
		this.ui.ShowUI(this);
		System.out.println("Savings job 3");
		System.out.println("______________________________");
	}

}
