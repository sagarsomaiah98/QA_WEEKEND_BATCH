package INHERITANCE;

public class Child extends Parent {
	
	int age=25;
	
	public void car() {
		
		System.out.println("Child owns a car");
	}
	

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.age);
		c.car();
		System.out.println(c.lname);
		c.factory();

	}

}
