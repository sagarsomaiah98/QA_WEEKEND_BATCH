package parameterMethods;

public class GreatestTwoNumbers {
	
	public void min(double d, double e) {
		
		if(d>e)
			System.out.println(d+" is greatest");
		else
			System.out.println(e+" is greatest");
		
		
	}
	

	public static void main(String[] args) {
		
		GreatestTwoNumbers g = new GreatestTwoNumbers();
		
		g.min(23.56, 54.63);
		

	}

}
