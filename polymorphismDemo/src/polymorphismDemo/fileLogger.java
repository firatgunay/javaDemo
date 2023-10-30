package polymorphismDemo;

public class fileLogger extends baseLogger{
	public void Log(String message) {
		System.out.println("Logged to file :" + message);	
	}

}
