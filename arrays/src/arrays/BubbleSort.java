package arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("enter lenght for array :");
		int len = scan.nextInt();
		int matris[] = new int[len];
		System.out.println("unsorted array: ");
		for(int i = 0; i < len; i++) {
			matris [i] = 1 + (int) (Math.random() * 99);
			System.out.print(" "+ matris[i]);
		}
		System.out.println();
		// bubble sort
		for(int i = 0; i < len - 1; i++) {
			for(int j = i+1; j < len; j++) {
				if(matris[i] > matris[j]) {
					int tmp = matris[i];
					matris[i] = matris[j];
					matris[j] = tmp;
				}
			}
		}
		System.out.println("sorted array :");
		for(int i = 0; i < len; i++) {
			System.out.print(" " + matris[i]);
		}
	}

}
