package polymorphismDemo;

public class DatabaseLogger extends baseLogger{
	public void Log(String message) {
		System.out.println("Logged to Database :" + message);	
	}
}
