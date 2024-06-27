package Fourth;

import java.util.Scanner;

public class Twentysecond {

	public static void main(String[] args) {
		System.out.println("Enter your age:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("Enter your nationality");
		Scanner d=new Scanner(System.in);
		String b=d.nextLine();
		if(a>=18 && b=="Indian") {
			System.out.println("Eligible for vote.");
		}
		else {
			System.out.println("Not eligible for vote.");

	}

}
}

