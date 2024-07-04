package Fourth;

import java.util.Scanner;

public class Fortytwo {

	public static void main(String[] args) {
		System.out.println("Enter hardness of steel:");
		Scanner z=new Scanner(System.in);
		int a=z.nextInt();
		System.out.println("Enter carbon content in the given steel:");
		Scanner y=new Scanner(System.in);
		float b=y.nextFloat();
		System.out.println("Enter the tensile strength of given steel:");
		Scanner x=new Scanner(System.in);
		int c=x.nextInt();
		if(a>50 && b<0.7 && c>5600) {
			System.out.println("Steel grade is 10.");
	}
		else if(a>50 && b<0.7) {
			System.out.println("Steel grade is 9.");
}
		else if(b<0.7 && c>5600) {
			System.out.println("Steel grade is 8.");
		}
		else if(a>50 && c>5600) {
			System.out.println("Steel grade is 7.");
		}
		else if(a>50 || b<0.7 || c>5600) {
			System.out.println("Steel grade is 6.");
		}
		else if(a<=50 && b>0.7 && c<=5600) {
			System.out.println("Steel grade is 5.");
		}
	}}
