package DecoratorDP;

public class ServiceLogger extends Decorator {

	public ServiceLogger(ILogger il) {
		super(il);
	}
	@Override
	public void LogMessage(String msg) {
		System.out.println("Service Logger ( " +msg+" )");
		super.LogMessage(msg);
	}

}