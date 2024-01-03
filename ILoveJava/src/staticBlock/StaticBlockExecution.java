package staticBlock;

public class StaticBlockExecution {
	
	static {
		System.out.println("Static Block");
	}
	
	StaticBlockExecution(){
		System.out.println("I am in Main Method");
	}
	public static void main(String[] args) {
		StaticBlockExecution block = new StaticBlockExecution();
	}
}
