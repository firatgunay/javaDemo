package arrays;
import java.util.Scanner;

public class createArray {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the array lenght: ");
		int len = scan.nextInt();
		
		int matris[] = new int [len];
		for(int i = 0; i<len; i++) {
			matris[i] = 1 + (int) (Math.random() * 100);
			sum = sum + matris[i];
			System.out.println(i +". eleman :" + matris[i]);
		}
		System.out.print("sum: " + sum);
		
	}

}
