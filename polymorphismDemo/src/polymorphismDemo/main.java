package polymorphismDemo;

public class main {

	public static void main(String[] args) {
		baseLogger loggers[] = new baseLogger[] {new fileLogger(),new DatabaseLogger(), new emailLogger()};
		
		for (baseLogger Logger : loggers) {
			Logger.Log("log mesajı");
		}
		
		customerManager customermanager = new customerManager(new DatabaseLogger());
		customermanager.add();
	}

}
