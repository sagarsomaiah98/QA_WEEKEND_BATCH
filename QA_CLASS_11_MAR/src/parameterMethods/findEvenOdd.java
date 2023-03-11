package parameterMethods;

public class findEvenOdd {
	
	
	public void find(int input) {
		
		if(input%2==0)
		{
			System.out.println(input+" is even");
		}
		else
		{
			System.out.println(input+" is odd");
		}
		
		
	}

	public static void main(String[] args) {
		
		findEvenOdd f= new findEvenOdd();
		f.find(23);
		f.find(90);
		f.find(68);
		f.find(67159);
		
		

	}

}
