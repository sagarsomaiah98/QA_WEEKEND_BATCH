package returnTypes;

public class Addition_ReturnType {

	
	public int add()
	{
		
		int a =40;
		int b=70;
		int c=a+b;
		System.out.println("Addditon of two numbers is "+c);
		return c;
	}

	

	public static void main(String[] args) {
		
		Addition_ReturnType A=new Addition_ReturnType();
		int value=A.add();
		System.out.println("Value ="+value);

		  if(value%2==0) 
			  System.out.println("Even number");
		  else
		  System.out.println("Odd number");
		 

	}

}
