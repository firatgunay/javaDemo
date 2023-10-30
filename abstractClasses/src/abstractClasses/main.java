package abstractClasses;

public class main {

	public static void main(String[] args) {
	
		kidGameCalculator kidgamecalculator = new kidGameCalculator();
		kidgamecalculator.hesapla();
		kidgamecalculator.gameOver();
		
		gameCalculator gamecalculator = new womenGameCalculator();
		gamecalculator.hesapla();
	}

}
