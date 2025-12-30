package Day1;

import java.util.Scanner;

public class F4 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter number 1");
		
		int num1 = sc.nextInt();
		
		System.out.println("Enter number 2");
		
		int num2 = sc.nextInt();
		
		int addition = num1 + num2 ;
		
		System.out.println("The addition of above two numbers is " + addition + ".");
		String word = sc.next();
		boolean b = sc.nextBoolean();
		String str = sc.nextLine();
		double db = sc.nextDouble();
		
	}

}
