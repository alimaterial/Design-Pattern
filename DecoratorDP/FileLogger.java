package DecoratorDP;

public class FileLogger extends Decorator {

	public FileLogger(ILogger il) {
		super(il);
	}
	@Override
	public void LogMessage(String msg) {
		System.out.println("File Logger ( " +msg+" )");
		super.LogMessage(msg);
	}

}
