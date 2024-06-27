package Fourth;

import java.util.Scanner;

public class Thirty {

	public static void main(String[] args) {
		int n1=0,n2=1,n3;
		System.out.println("Enter the number till which you want to print the fibonacci series :");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.print(n1+","+n2);
		for (int i=2;i<=a;i++) {
			n3=n1+n2;
			switch(n3) {
			case 13:
				break;
			case 35:
				break;
			default:
				System.out.print(","+n3);
			}
			n1=n2;
			n2=n3;
		}

	}

}
