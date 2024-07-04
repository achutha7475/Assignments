package Fourth;
import java.util.Scanner;

public class Thirtyseven {

	public static void main(String[] args) {
		System.out.println("Enter the alphabetical grade you have obtained (A to F except E) : ");
		Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
		switch(a) {
		case 'A':
			System.out.println("Marks you have obtained is between 92 to 98.");
			break;
		case 'B':
			System.out.println("Marks you have obtained is between 82 to 91.");
			break;
		case 'C':
			System.out.println("Marks you have obtained is between 72 to 81.");
			break;
		case 'D':
			System.out.println("Marks you have obtained is between 62 to 71.");
			break;
		case 'F':
			System.out.println("Marks you have obtained is between 50 to 61.");
			break;
		default:
			System.out.println("Please enter a valid Character from A to F except E.");
			break;
		}
	}

}
