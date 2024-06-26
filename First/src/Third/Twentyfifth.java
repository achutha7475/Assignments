package Third;

import java.util.Scanner;

public class Twentyfifth {

	public static void main(String[] args) {
		System.out.println(" Enter three integer values: ");
		Scanner m=new Scanner(System.in);
		Scanner n=new Scanner(System.in);
		Scanner o=new Scanner(System.in);
		int a=m.nextInt();
		int b=n.nextInt();
		int c=o.nextInt();
		if (a>b && b>c)
			System.out.println("It is in Descending order.");
		else if(a<b && b<c)
			System.out.println("It is in Ascending order.");
		else
			System.out.println("It doesn't followed any order.");
	}

}
