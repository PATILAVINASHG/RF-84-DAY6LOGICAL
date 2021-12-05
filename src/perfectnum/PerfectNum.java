package perfectnum;

import java.util.Scanner;
public class PerfectNum {

	public static void main(String[] args) {

					System.out.println("enter the number ");
					
					Scanner sc = new Scanner (System.in);
					
					int number = sc.nextInt();
					sc.close();
					int sum = 0;
					for (int i = 1; i <=number/2; i++) {
						if (number % i == 0 ) {
							System.out.println(+ i );		
						 sum  = sum + i;
						}
					}
					
		if (sum == number) {
			System.out.println("The number is perfect number : " + number);			
		}else {
		System.out.println("The number is not perfect number : " + number );
		}
	}

}
