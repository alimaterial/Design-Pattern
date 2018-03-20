package visitorPattern;

public class Dmat extends Account {

	@Override
	public void DoJob() {
		System.out.println("DMat job started ");
		this.ui.ShowUI(this);
		System.out.println("DMat job completed ");
	}

}
