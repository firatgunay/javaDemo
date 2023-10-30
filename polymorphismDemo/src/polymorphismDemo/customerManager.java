package polymorphismDemo;

public class customerManager {
	private baseLogger logger;
	
	 customerManager(baseLogger logger) {
		this.logger = logger;
	}
	
	public void add() {
		System.out.println("müşteri eklendi");
		this.logger.Log("müşteri bilgisi loglandı");
	}

}
