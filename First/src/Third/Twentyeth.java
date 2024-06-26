package Third;

public class Twentyeth {

	public static void main(String[] args) {
		String a="unmarried",b="female";
		int c=22;
		if(a=="married")
			System.out.println("Can claim Insurance");
		else if (b=="male" && c>=30)
			System.out.println("Can claim Insurance");
		else if (b=="female" && c>=25)
			System.out.println("Can claim Insurance");
		else
			System.out.println("Can't claim Insurance");

	}

}
