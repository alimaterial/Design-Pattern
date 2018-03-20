package DecoratorDP;

public class DecortaorClient {

	public static void main(String[] args) {
		
		System.out.println("Business started ");
		
		ILogger log=new EventTrace( LoggerFactory.GetLoggers());
		log.LogMessage("India is great");
		System.out.println("Business completed");
	}

}
