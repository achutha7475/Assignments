package Fourth;

import java.util.Scanner;

public class Thirtynineth {

	public static void main(String[] args) {
		System.out.println("Enter two integers : ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		Scanner d=new Scanner(System.in);
		int b=d.nextInt();
		System.out.println("Enter the operator you want to do on integers :");
		Scanner t=new Scanner(System.in);
		char f=t.next().charAt(0);
		switch(f){
		case '+':
			System.out.println("Addition of given two numbers results in "+(a+b)+".");
			break;
		case '-':
			System.out.println("Subtraction of given two numbers results in "+(a-b)+".");
			break;
		case '*':
			System.out.println("Multiplication of given two numbers results in "+(a*b)+".");
			break;
		case '/':
			System.out.println("Addition of given two numbers results in "+(a/b)+".");
			break;
		default:
			System.out.println("Enter the correct operators like +,-,*,/.");
			break;
		}
	}

}
