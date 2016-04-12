package com.acadgild.session.three;

import java.util.Scanner;

public class CheckPrimeNo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		int num = scanner.nextInt();

		CheckPrimeNo primeNum = new CheckPrimeNo();

		if (primeNum.isPrime(num)) {
			System.out.println("The Number " + num + " is Prime");
		} else {
			System.out.println("The Number " + num + " is not Prime");
		}
	}

	public boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
