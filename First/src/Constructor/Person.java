package Constructor;
public class Person {
	private int a;
	private String n;
	Person(int age,String name){
		this.a=age;
		this.n=name;
	}
	public void Introduce() {
		System.out.println("I am "+n+" & I am "+a+" years old.");
	}
	public static void main(String[] args) {
		Person p1=new Person(21,"Chaitanya");
		p1.Introduce();
		Person p2=new Person(22,"Achutha");
		p2.Introduce();
		Person p3=new Person(20,"Deekshitha");
		p3.Introduce();
		Person p4=new Person(19,"Chandvika");
		p4.Introduce();
		

	}}
	
/*public class Employee{
	private double s;
	Employee(double salary){
		this.s=salary;
	}
	public void dispsal() {
		System.out.println("Salary :"+s);
	}
	Employee(n,double s){
		this.s=s;
		super.a=a;
		super.n=n;
	}
}
}*/

