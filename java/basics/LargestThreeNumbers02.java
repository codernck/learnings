package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LargestThreeNumbers02 {

	public static void main(String[] args) {
		System.out.println("Enter 3 numbers: ");
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int num3 = scn.nextInt();
		scn.close();
		
		System.out.println(findLargest01(num1, num2, num3));
		System.out.println(findLargest02(num1, num2, num3));
		System.out.println(findLargest03(num1, num2, num3));
		System.out.println(findLargest04(num1, num2, num3));
		System.out.println(findLargest05(num1, num2, num3));
		System.out.println(findLargest06(num1, num2, num3));
		System.out.println(findLargest07(num1, num2, num3));
	}

	private static int findLargest01(int num1, int num2, int num3) {
		int largest = Integer.MIN_VALUE;
		
		if (num1 >= num2 && num1 >= num3) {
			largest = num1;
		} else if (num2 >= num1 && num2 >= num3 ) {
			largest = num2;
		} else {
			largest = num3;
		}
		return largest;
	}
	
	private static int findLargest02(int num1, int num2, int num3) {
		int largest = Integer.MIN_VALUE;
		
		if (num1 >= num2) {
			if (num1 >= num3) largest = num1;
			else largest = num3;
		} else {
			if (num2 >= num3 ) largest = num2;
			else largest = num3;
		} 
		
		return largest;
	}
	
	private static int findLargest03(int num1, int num2, int num3) {
		int largest = Integer.MIN_VALUE;
		
		if (num1 >= num2 && num1 >= num3) {
			largest = num1;
		} else if(num2 >= num3) {
			largest = num2;
		} else {
			largest = num3;
		}
		
		return largest;
	}
	
	private static int findLargest04(int num1, int num2, int num3) {
		int largest = num1 > (num2 > num3 ? num2 : num3) ? num1 : (num2 > num3) ? num2 : num3 ;
		return largest;
	}
	
	private static int findLargest05(int num1, int num2, int num3) {
		int largest = Math.max(num1, Math.max(num2, num3));
		return largest;
	}
	
	private static int findLargest06(int num1, int num2, int num3) {
		List<Integer> al = new ArrayList<>();
		al.add(num1);
		al.add(num2);
		al.add(num3);
		
		return Collections.max(al);
	}
	
	private static int findLargest07(int num1, int num2, int num3) {
		List<Integer> al = new ArrayList<>();
		al.add(num1);
		al.add(num2);
		al.add(num3);
		
		return al
				.stream()
				.mapToInt(e -> e)
				.max()
				.orElseThrow(NoSuchElementException::new);
	}
}
