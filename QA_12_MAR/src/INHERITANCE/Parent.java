package INHERITANCE;

public class Parent {
	
	String lname="Winchester";
	
	public void factory() {
		
		System.out.println("Parent owns a factory");
	}
	
	public void house() {
		
		System.out.println("Parent owns a house");
	}

	public static void main(String[] args) {
		Parent p= new Parent();
		System.out.println(p.lname);
		p.house();
	//	System.out.println(p.age);
	//	p.car();
		

	}

}
