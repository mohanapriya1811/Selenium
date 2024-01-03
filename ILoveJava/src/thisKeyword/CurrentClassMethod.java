package thisKeyword;

public class CurrentClassMethod {
	
	int id;
	String studentName;
	static String collegeName = "Prince";
	
	public void infoStudent(int id, String studentName) {
		this.id = id; 
		this.studentName = studentName; 
	}
	
	public void display() {
		this.infoStudent(1, "Akshinth"); //can specify infoStudent(1, "Akshinth") automatically compiler adds this.infoStudent(1, "Akshinth")
		System.out.println(id +" "+studentName+" "+collegeName);
	}
	
	public static void main(String[] args) {
		CurrentClassMethod current = new CurrentClassMethod();
		
		//current = this;
		current.display();
	}
}
