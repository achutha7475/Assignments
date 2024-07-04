package StaticInstance;

public class Eight {
	int x=10;
	public static void main(String[] args) {
	        Eight t1 = new Eight(); 
	        System.out.println(t1.x+"=> Got x instance variable value by creating an object and by calling that variable by using object reference. "); 
	    } 
	    static
	    { 
	        int x = 20; 
	        System.out.println(x + "=> Directly declared x as a variable in static block itself."); 


	}

}
