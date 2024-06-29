package Fourth;

import java.util.Scanner;

public class Thirtyone {

	public static void main(String[] args) {
		int b;
		System.out.println("Enter the number of multiples you want for 7: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=1;i<=a;i++) {
			b=7*i;
			if(b==56 || b==49) {
				continue;
			}
			else {
				System.out.println(b);
		}

	}

}}
