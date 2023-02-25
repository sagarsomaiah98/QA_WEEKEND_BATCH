package LogicalOperators;

public class AND_operator_Ex {

	public static void main(String[] args) {
		//& - and operator
		
		int a= 50;
		int b=300;
		int c=900;
		
		if((a>b)&(a>c))   //true & true-> true
			System.out.println(a+" is greater than "+b +" and "+c);//true
		
		else if(b>c)
			System.out.println(b+" is greater than "+a+" and "+c);
		else
			System.out.println(c+" is greater than "+a+" and "+b);
		
			
			
		
		
	}

}
