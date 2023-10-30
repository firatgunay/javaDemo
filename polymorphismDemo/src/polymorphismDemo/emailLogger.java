package polymorphismDemo;

public class emailLogger extends baseLogger{
	public void Log(String message) {
		System.out.println("Logged to email :" + message);	
	}

}
