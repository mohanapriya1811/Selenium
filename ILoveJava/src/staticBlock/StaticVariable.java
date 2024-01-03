package staticBlock;

public class StaticVariable {
	//
	
	
	int id;
	String studentName;
	// Stores at Class Area at the time of class loads
	// Memory Management
	// Class Specific rather the Object Specific ( No need of an Object to call Static data-member, methods
	
	static String collegeName = "IIT"; 

	public StaticVariable(int id, String studentName) {
		this.id = id;
		this.studentName =studentName;
	}
	public void display() {
		System.out.println(id + " "+studentName+" "+ collegeName);
	}
	
	public static void main(String[] args) {
		
		
		StaticVariable var = new StaticVariable(1, "Akshinth");
		StaticVariable var2 = new StaticVariable(2, "Devesh");
		
		var.display(); // collegeName shared to var and var2 -- static property shared to all objects
		var2.display();
		//System.out.println(collegeName);
		collegeName = "MIT";
		//System.out.println(collegeName);
		var.display();
		var2.display();
	}
		
}
