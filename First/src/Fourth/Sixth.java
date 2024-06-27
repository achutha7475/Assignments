package Fourth;

import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		System.out.println("Enter an alphabet : ");
		Scanner a=new Scanner(System.in);
		char b=a.next().charAt(0);
		if(b=='a'|| b=='e'||b=='i'||b=='o'||b=='u') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonant");
	}

}
}
