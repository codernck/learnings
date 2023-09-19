package basics;

import java.time.Year;
import java.util.Scanner;

public class Leapyear04 {

	public static void main(String[] args) {
		System.out.println("Enter he year to check");
		Scanner scn = new Scanner(System.in);
		int year = scn.nextInt();
		scn.close();
		System.out.println(printLeapYear01(year));
		System.out.println(printLeapYear02(year));
		System.out.println(printLeapYear03(year));
		
	}

	private static String printLeapYear01(int year) {
		if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
			return "Leap Year";
		} else {
			return "Not Leap Year";
		}
	}
	
	private static String printLeapYear02(int year) {
		 return (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))?"Leap Year":"Not Leap Year";		
	}
	
	private static String printLeapYear03(int year) {
		Year yearOb = Year.of(year);
		return yearOb.isLeap() ? "Leap year" : "Not Leap Year";
	}

}
