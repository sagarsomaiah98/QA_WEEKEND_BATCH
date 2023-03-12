package POLYMORHPHISM;

public class B extends A {
	
	//method overriding- happens in child class, there should relationship /inheritance between the classes, changing implementation in child class
	public void house() {
		
		System.out.println("B owns house");
	}
	
	public void cash() {
		
		System.out.println("B owns cash");
	}

	public static void main(String[] args) {
		B b = new B();
		b.house();
		b.factory();
		b.cash();
		

	}

}
