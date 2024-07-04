package Fourth;

import java.util.Scanner;

public class Fifythree {

	public static void main(String[] args) {
		System.out.println("Enter an integer of which you want a table: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int f;
		for(int i=1;i<=a;i++) {
			f=i*a;
			System.out.println(a+" * "+i+" = "+f);
		}

	}

}
