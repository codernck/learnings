package basics;

import java.util.Scanner;

public class EvenOdd03 {
	public static void main(String[] args) {
		System.out.println("Enter the number to check if its even or odd");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		scn.close();
		
		System.out.println(findEvenOdd01(num));
		System.out.println(findEvenOdd02(num));
		System.out.println(findEvenOdd03(num));
	}

	private static String findEvenOdd01(int num) {
		if (num % 2 == 0) {
			return "Even";
		} else {
			return "Odd";
		}
	}
	
	private static String findEvenOdd02(int num) {
		return num % 2 == 0 ? "Even": "Odd";
	}
	
	/*
	 * if num&1 is 1 than its odd else its even
	 */
	private static String findEvenOdd03(int num) {
		return (num&1) != 1 ? "Even" : "Odd";
	}
}
