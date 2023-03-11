package parameterMethods;

public class Two_Number_Addition {
	
	public void add(int p, int r) {
		
		
		int c=p+r;
		System.out.println("Addition of two numbers "+p+" and "+r+" is "+c);
	}
	

	public static void main(String[] args) {
		
		Two_Number_Addition a= new Two_Number_Addition();
		a.add(100,20);
		a.add(23,60);
		a.add(63,13);

	}

}
