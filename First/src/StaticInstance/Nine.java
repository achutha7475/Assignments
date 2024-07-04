package StaticInstance;

public class Nine {
	int x=10;
	public static void main(String[] args) {
		 Nine a=new Nine();
		 System.out.println(a.x+" Instance variable outside the Main method can be written by using object reference.");
		 int x=15;
		 System.out.println(x+" Instance variable within main method."); 
    } 
    static
    { 
        int x = 20; 
        System.out.println(x + " Instance variable declaration within Static block. "); 
    } 


	}

