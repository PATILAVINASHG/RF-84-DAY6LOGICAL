package reverseNum;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number you want reverse :");
		int x = num.nextInt();
		
		int rev = 0; int remainder ;
		
		while (x != 0) {
			
			remainder = x % 10;
		//	System.out.println(+ remainder);
			rev = rev * 10 + remainder;
			//System.out.println(+ rev);
		 x = x / 10;
		 System.out.println(+ x);
		}
		System.out.println("Reverse Number : " + rev);
			
		

	}

}
