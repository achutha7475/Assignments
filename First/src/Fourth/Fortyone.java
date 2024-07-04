package Fourth;

import java.util.Scanner;

public class Fortyone {

	public static void main(String[] args) {
		System.out.println("Enter the number of sides: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		switch(a) {
		case 3:
			System.out.println("Its a triangle.");
			break;
		case 4:
			System.out.println("Its a square.");
			break;
		case 5:
			System.out.println("Its a pentagon.");
			break;
		default:
			System.out.println("Enter the proper number of sides from 3-5.");
			break;
		}

	}

}
