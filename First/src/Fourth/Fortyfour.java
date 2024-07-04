package Fourth;

import java.util.Scanner;

public class Fortyfour {

	public static void main(String[] args) {
		System.out.println("Enter the hours of time taken by you to complete a task: ");
		Scanner s=new Scanner(System.in);
		float a=s.nextFloat();
		if(a>=2 && a<=3) {
			System.out.println("You are highly efficient!.");
		}
		else if(a>3 && a<=4) {
			System.out.println("You have to improve your work speed!.");
		}
		else if(a>4 && a<=5) {
			System.out.println("You can undergo into training to increase your work speed!. ");
		}
		else if(a>5) {
			System.out.println("You are layed off from this organization!.");
		}
		else {
			System.out.println("Enter the proper hours you took to complete your task!");
		}

	}

}
