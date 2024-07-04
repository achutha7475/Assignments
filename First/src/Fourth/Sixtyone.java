package Fourth;

import java.util.Scanner;

public class Sixtyone {

	public static void main(String[] args) {
		System.out.println("enter an integer : ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=1;i<=a;i++) {
			int c=0;
			if(i==2) {
				continue;
			}
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					c+=1;
			}}
			if(c==0) {
				System.out.println("Prime number "+i);
			}
			else {
				continue;
			}
		}
	}

}
