package StaticInstance;

public class Seven {
	static int x=10;

	public static void main(String[] args) {
			System.out.println("Main method");
		        System.out.println(x); 
		    } 
		    static
		    { 
		    	System.out.println("Static method.");
		        System.out.println(x + " "); 
		    } 

}
/* we can get directly only a static variable into main method.but not instance variable.
 we can get instance variables into main method by creating object. as eighthh one.*/
