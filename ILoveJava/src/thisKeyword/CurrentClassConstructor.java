package thisKeyword;

public class CurrentClassConstructor {
	
	int id;
	String studentName;
	static String collegeName = "Prince";
	
	public CurrentClassConstructor(int id, String studentName) { //parameterized constructor
		this.id = id; 
		this.studentName = studentName; 
		System.out.println(id +" "+studentName+" "+ " " +collegeName);
	}
	
	public CurrentClassConstructor(int id, String studentName, String studentClass) {
		this(id, studentName);  // calls the parameterized constructor it should be the first one 
		//constructor chaining Rule: Call to this() must be the first statement in constructor.
		System.out.println(id +" "+studentName+" "+ " " +studentClass +" " +collegeName);
	}
	
	public static void main(String[] args) {
		CurrentClassConstructor current = new CurrentClassConstructor(1, "Devesh");
		CurrentClassConstructor current2 = new CurrentClassConstructor(1, "Askhinth", "10th");
		
		
		//current = this;
		//current.display();
	}
}
