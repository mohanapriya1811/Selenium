package staticBlock;

public class StaticMethod {
	int id;
	String studentName;
	static String collegeName = "IIT"; 

	public static void methodStatic() {
		
		// id = 101; cannot call non-static member or method it needs an object reference
		System.out.println(collegeName);
		collegeName = "MIT"; // can access static data member and change the value
		System.out.println(collegeName);
		
		// System.out.println(this.id); this and super cannot be used with static members and methods
		// this and super refer to the references of current class and parent class
	}
	
	public void nonStatic() {
		System.out.println(id +" " +studentName);
	}
	
	public static void main(String[] args) {
		StaticMethod.methodStatic(); // Belongs to Class no need of object
		// nonStatic(); non static method cannot be called without an object reference
	}
	
}
