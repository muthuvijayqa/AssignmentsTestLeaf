package week1.day2;

import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {

		// Scanner Object o read the input from the user
		Scanner sc = new Scanner(System.in);

		// Ask the user to enter the number
		System.out.println("Enter the number:");

		// Store the input from user to variable num
		int num = sc.nextInt();

		// declare and initialize a variable to store the reversed number

		int rev = 0;

		// loop to get the reversed number

		for (int i = num; i > 0; i = i / 10) {

			// shift the digit in rev to one place in left
			// Get the last digit of the number(i%10)
			rev = rev * 10 + (i % 10);
		}

		// check if original number and reversed number are same
		if (num == rev) {
			System.out.println("The given number is a palindrome");
		} else {
			System.out.println("The given number is not a palindrome");
		}
	}

}
