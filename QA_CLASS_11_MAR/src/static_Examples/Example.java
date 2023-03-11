package static_Examples;

public class Example {
	
	 static String name="Bob";
	
	public static  void method1() {
		
		System.out.println("Calling static method 1 in Example ");
	}

	public static void main(String[] args) {
		
		method1();
		System.out.println(name);
		
	}

}
