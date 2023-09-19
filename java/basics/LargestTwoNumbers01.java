package basics;

import java.util.Scanner;

public class LargestTwoNumbers01 {

	public static void main(String[] args) {
		System.out.println("Enter two numbers:");
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		scn.close();
		
		System.out.println(findLargest01(num1, num2));
		System.out.println(findLargest02(num1, num2));
		System.out.println(findLargest03(num1, num2));
	}

	private static int findLargest01(int num1, int num2) {
		// this if is in separate line to cover this we can write >= instead
		if (num1 == num2) { 
			return num1;
		} else if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	private static int findLargest02(int num1, int num2) {
		// this if is in separate line to cover this we can write >= instead
		if (num1 == num2) { 
			return num1;
		}
		
		int res = num1 > num2?num1:num2;
		return res;
	}
	
	private static int findLargest03(int num1, int num2) {
		// this if is in separate line to cover this we can write >= instead
		if (num1 == num2) { 
			return num1;
		}
		
		int res = Math.max(num1, num2);
		return res;
	}

}
