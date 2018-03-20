package DecoratorDP;

public class Decorator implements ILogger {
	ILogger il;
	public Decorator(ILogger il) {
		this.il=il;
	}
	@Override
	public void LogMessage(String msg) {
		il.LogMessage(msg);
	}

}
