package StaticInstance;

public class Ten {
	
	static int x=10;

	public static void main(String[] args) {
		Ten t1 = new Ten(); 
        Ten t2 = new Ten();
        
        t1.x = 20; 
        System.out.print(t1.x + " "); 
        System.out.println(t2.x);

	}

}
