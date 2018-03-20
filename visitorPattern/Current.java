package visitorPattern;

public class Current extends Account {
	@Override
	public void DoJob() {
		System.out.println("Current job 1");
		this.ui.ShowUI(this);
		System.out.println("Current job 2");

		System.out.println("Current job 3");
		System.out.println("______________________________");
	}

}