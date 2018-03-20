package visitorPattern;

public class ChristmasUI implements IUI {

	@Override
	public void ShowUI(Account acc) {
		System.out.println("General ui for Christmas");

	}

	@Override
	public void ShowUI(Savings acc) {
		System.out.println("Savings ui for Christmas");

	}

	@Override
	public void ShowUI(Current acc) {
		System.out.println("Current ui for Christmas");

	}

}
