package thisKeyword;

public class ThisAsAnArgument {
	int id;
	String studentName;
	static String collegeName;
	
	public ThisAsAnArgument() {
		
		id = 20;
		studentName = "Devesh";
		collegeName = "IIT";
		
		System.out.println(id + " " +studentName +" "+collegeName);
	}
	
	public void withReference(ThisAsAnArgument arg) { // providing reference of current class
													// can also provide another class reference
		arg.id = 10;
		arg.studentName = "Akshinth";
		collegeName = "MIT";
		
		System.out.println(id + " " +studentName +" "+collegeName);
		
		//use of one object in many methods
		
	}
	
	public void thisReference() {
		withReference(this);
	}
	
	public static void main(String[] args) {
		ThisAsAnArgument asArg = new ThisAsAnArgument();
		asArg.thisReference();
		
	}
	

}
