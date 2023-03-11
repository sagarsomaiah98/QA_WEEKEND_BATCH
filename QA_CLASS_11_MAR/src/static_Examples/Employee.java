package static_Examples;

public class Employee {
	//static variables or static methods can be called directly in main method without creating object
	
	//using static extensively will put lot of load on performance
	
	static String company="Google";
	static char grade='K';
	
	 double salary=432.45;
	
	//static method
	public static void info() {
		String company="ANZ";
		int age=40;
		String name="James";
		System.out.println("Employee info "+name +" & "+age);
		
		
	}
	//non static method
	public void display() {
		
		System.out.println("calling display method");
	}
	

	public static void main(String[] args) {

		System.out.println(company);
		System.out.println(grade);
		info();
		Employee emp= new Employee();
		emp.display();
		
		

	}

}
