package visitorPattern;

public class VisitorClient {

	public static void main(String[] args) {
		NewYearUI ui=new NewYearUI();
		Bank bank=new Bank();
		bank.DoBusiness(ui);

	}

}
