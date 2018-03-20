package chainOfresponsibility;

public class chainofResposibilityClient {

	public static void main(String[] args) {
		Cashier john = new Cashier();

		Manager abay = new Manager();

		Director james = new Director();

		john.set_successor(abay);

		abay.set_successor(james);

		john.processLoan(260000);

	}

}
