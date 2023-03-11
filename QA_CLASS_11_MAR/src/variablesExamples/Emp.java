package variablesExamples;

public class Emp {
	String company="Google";
	double salary=789.47;
	//global variable is defined at class level and outside the method it can be accessed anywhere
	//local variable is defined inside the method and its scope is only within the method
	
	public void employee() {
		//local variables
		String name="Jean";
		int age=30;
		double salary=345.67;
		System.out.println(name);
		System.out.println(age);
 		System.out.println(salary);
 		System.out.println(company);
 		System.out.println("**********************");
		
	}
	
	public void manager() {
		//local variables
		String name="Peter";
		int age=40;
		double salary=5000.28;
		System.out.println(name);
		System.out.println(age);
 		System.out.println(salary);
 		System.out.println(company);
 		System.out.println("**********************");
		
	}
	public void finance() {
		System.out.println(company);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		
		Emp e = new Emp();
		e.employee();
		e.manager();
		e.finance();
		

	}

}
