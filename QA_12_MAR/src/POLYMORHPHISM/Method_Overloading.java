package POLYMORHPHISM;

public class Method_Overloading {
	
// method overloading- same method name but different arguments/parameter/method signature within class	
	public void add() {
		
		System.out.println("Addition");
	}
	
	public void add(int a ,int b) {
		
		System.out.println("Addition in second method");
	}
public void add(double a ,int b) {
		
		System.out.println("Addition in third method");
	}
public void add(int a ,double b) {
	
	System.out.println("Addition in fourth method");
}
public void add(String a) {
	
	System.out.println("Addition in fifth method");
}

	public static void main(String[] args) {
		
		Method_Overloading m = new Method_Overloading();
		m.add(10,23);
		m.add("James");
		m.add(12.3,23);
		m.add(52,3.2);
		

	}

}
