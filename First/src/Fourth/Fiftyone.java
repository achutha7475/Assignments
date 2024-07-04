package Fourth;

import java.util.Scanner;

public class Fiftyone {

	public static void main(String[] args) {
		System.out.println("Enter an integer from which you need even numbers: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("Enter an integer to which you need even numbers: ");
		Scanner d=new Scanner(System.in);
		int b=d.nextInt();
		for (int i=a;i<=b;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			
		}

	}

}
