package preDefinedMethods;

public class Student {
	//global variables or class variables
	
	String name="mark";
	char grade='A';
	
	public void records() {
		System.out.println(name);
		System.out.println(grade);
	}

	public static void main(String[] args) {
		
		Student s=new Student();
	
		System.out.println(s.name);
		System.out.println(s.grade);
		

	}

}
