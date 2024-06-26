package Third;

public class Twentysecond {

	public static void main(String[] args) {
		int a=25,b=25,c=186;
		if (a<b && a<c)
			System.out.println(a);
		if (a>b && b<c)
			System.out.println(b);
		if (c<b && a>c)
			System.out.println(c);
		if (a==b && (a<c))
			System.out.println(a+" & "+b);
		if (c==a && (a<b))
			System.out.println(a+" & "+c);
		if (b==c && a>c)
			System.out.println(b+" & "+c);
		if (a==b && b==c)
			System.out.println(a+" and "+b+" and "+c+" are equal.");

	}

}
