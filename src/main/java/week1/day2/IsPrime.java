package week1.day2;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {

		// Scanner Object to get input from the user

		Scanner sc = new Scanner(System.in);

		// Ask the user to key the number
		System.out.println("Enter the number: ");

		// store the input value to variable "num"
		int num = sc.nextInt();

		// Declaring and initializing a variable "Count" to store the number of
		// factors/Divisors

		int count = 0;

		// check if num is greater than 1
		if (num > 1) {

			// loop to find the factors of the given number
			for (int i = 1; i <= num; i++) {

				// increment the value of count if the given number is completly divisble by i
				if (num % i == 0) {

					count++;

				}

			}

		}

		// If the number of factors is only 2, the given number is printed as Prime
		if (count == 2) {

			System.out.println("The given number is a prime number");

		}

		// if the number of factors is not equal to 2, the given number is printed as
		// not a prime number
		else {

			System.out.println("The given number is not a prime number");
		}

	}

}
