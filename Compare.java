package conditional;

import java.util.Scanner;

public class Compare {
	
	public static void main(String [] ars) {
		System.out.println ("Please enter 2 numbers: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		if (num1<num2) {
			System.out.println("Number " + num1 + " is less than number " + num2);
		}else if (num2>num1) {
			System.out.println("Number " + num2 +  " is greater than number " + num1);
		}else if (num1==num2) {
			System.out.println("Number " + num1 + " is equal to number " + num2);
		}
	}

}
