package Fourth;

import java.util.Scanner;

public class Second {
		public static void main(String[] args) {
			System.out.println("Enter the three integers : ");
			Scanner a=new Scanner(System.in);
			int b=a.nextInt();
			Scanner c=new Scanner(System.in);
			int d=c.nextInt();
			Scanner e=new Scanner(System.in);
			int f=e.nextInt();
			if(b>d && b>f) {
				System.out.println(+b+" is greater than "+d+","+f);
			}
			else if(d>b && d>f) {
				System.out.println(+d+" is greater than "+b+","+f);
			}
			else if(f>b && f>d){
				System.out.println(+f+" is greater than "+b+","+d);
	}

}
}
