package LogicalOperators;

public class Biggest_four_Numbers {

	public static void main(String[] args) {
		
		int a=0, b=8,c=7,d=2;
		
		if(a>b & a>c  & a>d)//  false &false & false-> false
			
			System.out.println("a is bigger");
		
		else if(b>a & b>c & b>d)  //  true & true & true -> true
		
			System.out.println("b is bigger");
		
		else if(c>a & c>b & c>d)  // true & false & true -> false
		
			System.out.println("c is bigger");
		
		else 
		
			System.out.println("d is bigger");

	}

}
