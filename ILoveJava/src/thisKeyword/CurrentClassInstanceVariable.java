package thisKeyword;

public class CurrentClassInstanceVariable {

	int id;
	String studentName;
	
	public void infoStudent(int id, String studentName) {
		this.id = id; // this.id = refers to the object reference of this class
		this.studentName = studentName; //this.studentName = refers to the object reference of this class
		
		//Distinguish instance and local variables
	
	}
	
	public static void main(String[] args) {
		CurrentClassInstanceVariable current = new CurrentClassInstanceVariable();
		
		//current = this;
	}
}
