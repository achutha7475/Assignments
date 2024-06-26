package Third;

public class Thirteenth {

	public static void main(String[] args) {
		int a=8964,b,c,d,e,f,g,h;
		b=((a/10)*10);
		c=a-b;
		if (c>5) {
			d=c/5;
			System.out.println("Number of 5 rupee coins : "+d);
			e=(c-(d*5));
			f=e/2;
			g=e%2;
			System.out.println("Number of 2 rupee coins : "+f);
			System.out.println("Number of 1 rupee coins : "+g);
		}
		if (c<5) {
			d=c/2;
			e=d%2;
			System.out.println("Number of 2 rupee coins : "+d);
			System.out.println("Number of 1 rupee coins : "+e);
		}
		if (b>100) {
			d=b/100;
			System.out.println("Number of 100 rupee notes : "+d);
			e=(b-(d*100));
			if (e>=50) {
				d=e/50;
				System.out.println("Number of 50 rupee notes : "+d);
				h=(e-(d*50));
				if(h>20 || h>10) {
					f=h/20;
					g=h%20;
					System.out.println("Number of 20 rupee notes : "+f);
					System.out.println("Number of 10 rupee notes : "+g);
					}
			else if (e<50) {
				d=e/20;
				h=e%20;
				System.out.println("Number of 20 rupee notes : "+d);
				System.out.println("Number of 10 rupee notes : "+h);
		}
		else if (b>50) {
			d=b/50;
			System.out.println("Number of 50 rupee notes : "+d);
			e=(b-(d*50));
			f=e/20;
			g=e%20;
			System.out.println("Number of 20 rupee notes : "+f);
			System.out.println("Number of 10 rupee notes : "+g);
			}
		else if (b<50) {
			d=b/20;
			e=d%20;
			System.out.println("Number of 20 rupee notes : "+d);
			System.out.println("Number of 10 rupee notes : "+e);
		}
	}
		}
	}
}

		
