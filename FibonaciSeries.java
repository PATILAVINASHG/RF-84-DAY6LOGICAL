package fibonaciseries;
import java.util.Scanner;

public class FibonaciSeries {
		public static void main (String[] args) {
			System.out.println("How many fibonacci element to print");
			
			Scanner sc = new Scanner (System.in);
			int count = sc.nextInt();
			
			int prev = 0;
			int current = 1;
			
			if (count > 1) {
				System.out.println(prev + "\t" );
				
				for (int i = 2; i < count; i++) {
					FibonaciSeries Fbnacci =new FibonaciSeries();
					int temp = Fbnacci.nextElement(prev, current);
					sc.close();
					prev = current;
					current = temp ;
					System.out.println( + current +"\t");
				}
				
			}else {
				System.out.println("Invalid input");
			}
		}
		
		public int nextElement(int prev, int current) {
			return (prev + current);
		}
}

