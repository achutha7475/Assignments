package Fourth;

import java.util.Scanner;

public class Nineth {

	public static void main(String[] args) {
		System.out.println("Enter the three integers : ");
		Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		Scanner c=new Scanner(System.in);
		int d=c.nextInt();
		Scanner e=new Scanner(System.in);
		int f=e.nextInt();
		if((b+d+f)==180) {
			System.out.println("Triangle can be formed by using these values.");
		}
		else {
			System.out.println("Triangle can't be formed by using these values.");
		}

	}

}
