package arrays;

public class foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matris[][] = new int[][] {
			{1,75,10},
			{2,87,13},
			{3,95,13},
			{4,103,18},
			{5,110,19}
		};
		
		for(int row[] : matris) {
			for(int value : row) {
				System.out.print(value+ " ");
			}
			System.out.println();
		}
		
	}

}
