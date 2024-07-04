package StaticInstance;

public class Four {
	
	static int i=1;
	public static void main(String[] args) {
	        for (Four.i = 1; Four.i < 10; Four.i++) { 
	            i = i + 2; 
	            System.out.print(i + " "); 
	        } 
/* here we did'nt assigned any instance variable named i . so it took static variable directly as i.
 Static variable must be assigned before the main method. Can't be initialized in a method.*/

	}

}
