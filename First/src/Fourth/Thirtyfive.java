package Fourth;

import java.util.Scanner;

public class Thirtyfive {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("Enter the integers: ");
		while(true){
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			if(a>0) {
				sum=sum+a;
			}
			else if(a<0) {
				break;}
			
		}
		System.out.println(sum);

	}

}
