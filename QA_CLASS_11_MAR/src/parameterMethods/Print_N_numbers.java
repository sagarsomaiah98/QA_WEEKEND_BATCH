package parameterMethods;

public class Print_N_numbers {
	
	public void print(int limit) {
		
		for(int i=1;i<=limit;i++) {
			System.out.println(i);
		}
		
		
	}

	public static void main(String[] args) {
		
		Print_N_numbers p = new Print_N_numbers();
		p.print(10);
		

	}

}
