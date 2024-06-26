package Fourth;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		System.out.println("Enetr the two integers : ");
		Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		Scanner c=new Scanner(System.in);
		int d=c.nextInt();
		if(b>d)
			System.out.println(b+" is greater than "+d);
		else if(d>b)
			System.out.println(d+" is greater than "+b);
		else
			System.out.println("They are equal.");
		
	}

}
