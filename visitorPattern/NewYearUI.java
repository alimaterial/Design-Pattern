package visitorPattern;

public class NewYearUI implements IUI {

	@Override
	public void ShowUI(Account acc) {
		System.out.println("General ui for NY");

	}

	@Override
	public void ShowUI(Savings acc) {
		System.out.println("Savings ui for NY");

	}

	@Override
	public void ShowUI(Current acc) {
		System.out.println("Current ui for NY");

	}

}
