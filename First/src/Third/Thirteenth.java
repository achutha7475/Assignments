package Third;

public class Thirteenth {

	public static void main(String[] args) {
		int a=2345,b,c;
			b=a/1000;
			System.out.println("Thousand rupee notes required are "+b);
			c=a/500;
			System.out.println("Five hundred rupee notes required are "+c);
			c=b*500;
			a=c%500;
			b=a/100;
			System.out.println("Hundred rupee notes required are "+b);
			c=b*100;
			a=c%100;
			b=a/50;
			System.out.println("Fifty rupee notes required are "+b);
			c=b*50;
			a=c%50;
			b=a/20;
			System.out.println("Twenty rupee notes required are "+b);
			c=b*20;
			a=c%20;
			b=a/10;
			System.out.println("Ten rupee notes required are "+b);
			c=b*10;
			a=c%10;
			b=a/5;
			System.out.println("Five rupee coins required are "+b);
			c=b*5;
			a=c%5;
			b=a/2;
			System.out.println("Two rupee coins required are "+b);
			c=b*2;
			a=c%2;
			b=a/1;
			System.out.println("One rupee coins required are "+b);
			c=b*1;
			a=c%1;
}}
		
