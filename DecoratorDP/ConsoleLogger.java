package DecoratorDP;

public class ConsoleLogger extends Decorator {

	public ConsoleLogger(ILogger il) {
		super(il);
	}
	@Override
	public void LogMessage(String msg) {
		System.out.println("Console Logger ( " +msg+" )");
		super.LogMessage(msg);
	}

}
