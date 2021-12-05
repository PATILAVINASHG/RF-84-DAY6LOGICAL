package couponNum;

import java.util.Scanner;
public class CouponNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter number for generate coupons");
		CouponNum obj = new CouponNum();
		
		int range = scanner.nextInt();
		
		int count=obj.distinctCoupon(range);
		
		System.out.println(count + " N times loop runs for finding distinct");
		scanner.close();

	}

	public int distinctCoupon(int range) {
		boolean[] arr = new boolean[range];
		int count = 0;
		int distinct = 0;
		while (distinct < range) {
			int value = randomNumber(range);
			System.out.print(value + " ");
			if (!arr[value]) {
				distinct++;
				arr[value] = true;
				System.out.print(arr[value] + " ");
			}

			count++;
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print("index " + i + " values " + arr[i] + "\n");
		}
		return count;

	}

	public int randomNumber(int range) {

		return (int) (Math.random() * range);
	
	}

}
