package preDefinedMethods;

public class Math {
	
	
	public void addition()
	{
	//code for addition
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println("addition of two numbers "+a+" and "+b+" is "+c);

	}
	
	public void subraction(){
		
		//code for subtraction
				int k=100;
				int m=50;
				int j=k-m;
				System.out.println("subtraction of two numbers "+k+" and "+m+" is "+j);
	}

	public static void main(String[] args) {
		
		//create a object of the class
		//className object= new ClassName();
		Math m=new Math();// create m object of class Math
		m.addition();
		m.subraction();
		m.addition();
		m.addition();
		
		
	   
		
		
		
	}

}
