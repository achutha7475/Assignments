package Fourth;

import java.util.Scanner;

public class Thirtyfive {

	public static void main(String[] args) {
		int sum=0,c=0;
		System.out.println("Enter the integers: ");
		while(true){
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			if(a>0) {
				sum=sum+a;
			}
			else if(a<0){
				c=c+1;
				sum=sum+a;
				break;
			}
			if(c>1) {
				sum=sum;
				break;
			}
			
		}
		System.out.println(sum);

	}

}
