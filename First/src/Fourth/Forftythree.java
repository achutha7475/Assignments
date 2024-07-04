package Fourth;

import java.util.Scanner;

public class Forftythree {

	public static void main(String[] args) {
		System.out.println("Enter the number of days you took to return the book:");
		Scanner z=new Scanner(System.in);
		int a=z.nextInt();
		if(a==0) {
			System.out.println("No payment needed.");
		}
		if(a>0 && a<=5) {
			System.out.println("Pay 5 paise.");}
		else if(a>=6 && a<=10) {
			System.out.println("Pay 1 rupee.");}
		else if(a>10 && a<30) {
			System.out.println("Pay 5 rupees");
		}
		else if(a>=30) {
			System.out.println("Your membership has been cancelled.");
		
		}

	}

}
