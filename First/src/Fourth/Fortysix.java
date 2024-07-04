package Fourth;

import java.util.Scanner;

public class Fortysix {

	public static void main(String[] args) {
		System.out.println("CALCULATOR");
		System.out.println("enter an integer :");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("Enter operator :");
			Scanner w=new Scanner(System.in);
			char c=w.next().charAt(0);
		System.out.println("Enter an integer :");
		Scanner d=new Scanner(System.in);
		int b=d.nextInt();
		System.out.println("The result is : ");
		switch(c) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			if(a!=0) {
			System.out.println(a/b);}
			else {
				System.out.println("Error!");
			}
			break;
		default:
			System.out.println("Error! Invalid operator");
			break;
		}

	}

}
