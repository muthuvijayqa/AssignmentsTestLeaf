package week1.day2;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		// create a scanner object to get the user input

		Scanner sc = new Scanner(System.in);

		// ask the user to enter the desired series

		System.out.println("Enter the desired series");

		// store the input value to variable "series"

		int series = sc.nextInt();

		// Declare and initiate the first two numbers of the fibonacci series

		int n1 = 0, n2 = 1;

		// loop to get the fibonacci series

		for (int i = 0; i < series; i++) {

			System.out.println(n1 + " ");

			// calculate the next term in fibonacci series

			int n3 = n1 + n2;

			// update the values for next ieration

			n1 = n2;
			n2 = n3;

		}

	}

}
