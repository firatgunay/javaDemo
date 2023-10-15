package arrays;
import java.util.Scanner;
public class dimensialArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		int matris[][] = new int[][] {
			{1,75,10},
			{2,87,13},
			{3,95,13},
			{4,103,18},
			{5,110,19}
		};
		for(int i = 0; i < matris.length; i++) {
			for(int j = 0; j < matris[0].length; j++) {
				//System.out.print(matris[i][j] + " ");
			}
			//System.out.println();
		}
		int matris2[][] = new int[2][2];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < matris2.length; i++) {
			System.out.println("enter a number");
			for(int j = 0; j < matris2[0].length; j++) {
				matris2[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < matris2.length; i++) {
			for(int j = 0; j < matris2[0].length; j++) {
				System.out.print(matris2[i][j]);
			}
			System.out.println();
		}
	}

}
