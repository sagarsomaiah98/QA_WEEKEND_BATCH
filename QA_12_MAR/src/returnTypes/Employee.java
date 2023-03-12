package returnTypes;

public class Employee {
	
	
	public boolean info() 
	{
	String name="John";
	double salary=6789.12;
	char grade='S';
	int age=30;
	boolean flag=true;
	
	return flag;
		
	}

	public static void main(String[] args) {
		
		Employee e = new Employee();
		System.out.println(e.info());

	}

}
