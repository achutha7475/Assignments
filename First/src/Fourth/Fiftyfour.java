package Fourth;

import java.util.Scanner;

public class Fiftyfour {

	public static void main(String[] args) {
		System.out.println("Enter an integer : ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=1;i<=1000;i++) {
			if(i%a==0) {
				System.out.println(i);
			}
		}


	}

}
