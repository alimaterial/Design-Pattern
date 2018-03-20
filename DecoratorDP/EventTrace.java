package DecoratorDP;

public class EventTrace extends Decorator {

	public EventTrace(ILogger il) {
		super(il);
		
	}
@Override
public void LogMessage(String msg) {
	System.out.println("EventTrace Logger ( " +msg+" )");
	super.LogMessage(msg);
}
}
