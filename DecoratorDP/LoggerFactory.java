package DecoratorDP;

public class LoggerFactory {
	public static ILogger GetLoggers()
	{
			//return new NullLogger();
		//return new ConsoleLogger();
		//return new FileLogger();
		return new FileLogger(new ConsoleLogger(new ServiceLogger(new NullLogger())));
	}
}
