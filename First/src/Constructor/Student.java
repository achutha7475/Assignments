package Constructor;

public class Student {
	private String n;
	private int a;
	private double g;
	
	Student(String name,int age,double cgpa){
		this.n=name;
		this.a=age;
		this.g=cgpa;
	}
	Student(String name,int age){
		this.n=name;
		this.a=age;
	}
	public void displayGPA() {
		System.out.println("Name: "+n+", Age: "+a+", GPA is "+g+" .");
	}
	

	public static void main(String[] args) {
		Student s1=new Student("Chaitanya",21,7.7);
		s1.displayGPA();
		Student s2=new Student("Achutha",21,7.2);
		s2.displayGPA();
		Student s3=new Student("None",0);
		s3.displayGPA();
	}

}
