package Third;

public class Fifteenth {

	public static void main(String[] args) {
		int a=53,b=74,c=53;
		if((a+b+c)==180) {
			if (a==b && b==c)
				System.out.println("Equilateral Triangle");
			else if (a==b && b!=c || a==c && c!=b || b==c && c!=a)
				System.out.println("Isosceles Triangle");
			else
				System.out.println("Scalane Triangle");
		}
		else
			System.out.println("It's not a Triangle");
	}

}
