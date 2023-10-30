package abstractClasses;

public abstract class gameCalculator {
	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("oyun bitti");
	}
}
