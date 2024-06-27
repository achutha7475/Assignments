package Fourth;

import java.util.Scanner;

public class Thirteenth {

	public static void main(String[] args) {
		System.out.println("Enter the three integers : ");
		Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		Scanner c=new Scanner(System.in);
		int d=c.nextInt();
		Scanner e=new Scanner(System.in);
		int f=e.nextInt();
		if(b==d && d==f) {
			System.out.println("REGULAR - All three sides are equal");
		}
		else if(b==d && d!=f || d==f && f!=b || b==f && d!=b) {
			System.out.println("SYMMETRIC - Two sides are equal");
		}
		else {
			System.out.println("IRREGULAR - No two sidea are equal");
		}

	}

}
