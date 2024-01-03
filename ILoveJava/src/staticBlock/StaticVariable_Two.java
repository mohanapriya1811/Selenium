package staticBlock;

public class StaticVariable_Two {

	int id;
	String studentName;
	static String collegeName = "MIT";
	
	
	// static block to initialize
	// static block loads at the time of class is loading before main method execution
	static {
		collegeName = "Prince";
	}
	 
	public void changeName() {

		StaticVariable_Two.collegeName = "IIT";

	}

	public static void main(String[] args) {

		StaticVariable_Two var = new StaticVariable_Two();
		// System.out.println(collegeName); MIT in the absence of static block
		System.out.println(collegeName); 	// Prince in the presence of static block
		//var.changeName();
		System.out.println(collegeName); 	// Prince when changeName() is not called
		// System.out.println(collegeName); IIT when changeName is called 
	}

}
