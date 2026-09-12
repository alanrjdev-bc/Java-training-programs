package training;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner pr=new Scanner(System.in);
		System.out.println("Check the Factorial of the number: ");
		int num=pr.nextInt();
		int factorial=1;
		int i=1;
		while(i<=num) {
			factorial=factorial*i;
			i++;
		}
		System.out.println(factorial);

	}

}
