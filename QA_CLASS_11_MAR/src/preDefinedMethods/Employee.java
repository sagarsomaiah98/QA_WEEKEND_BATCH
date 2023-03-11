package preDefinedMethods;

public class Employee {
	
	public void info() {
		int age=40;
		String name="James";
		System.out.println("Employee info "+name +" & "+age);
		
		
	}
	

	public static void main(String[] args) {
		
		Employee emp= new Employee();
		emp.info();
		
		

	}

}
