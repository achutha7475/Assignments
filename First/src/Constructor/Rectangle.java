package Constructor;
public class Rectangle {
	private int a;
	private int b;
	Rectangle(int length,int breadth){
		this.a=length;
		this.b=breadth;
	}
	public void Area() {
		System.out.println("Area of given rectangle of length "+a+" and breadth "+b+" is "+(a*b)+" .");
	}
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(5,6);
		r1.Area();
		Rectangle r2=new Rectangle(53,21);
		r2.Area();	
	}

}
