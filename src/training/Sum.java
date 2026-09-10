package training;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		System.out.println("FIND SUM");
		Scanner sd=new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting range :");
		int startrange = sc.nextInt();
		System.out.println("Enter the ending range : ");
		int endrange = sc.nextInt();
		int sum=0;
		while (startrange <= endrange) {
			sum=sum+startrange;
			System.out.println(sum);
			startrange++;
		}

	}

}
